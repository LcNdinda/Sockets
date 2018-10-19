import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serveReverseWord {
    public static void main(String arg[]) throws IOException {
        ServerSocket serverSocketReverse = new ServerSocket(1342);
        Socket ss = serverSocketReverse.accept();


        Scanner sc = new Scanner(ss.getInputStream());
        String str = sc.nextLine();

        String reverse = "";
        for (int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }


        PrintStream p = new PrintStream(ss.getOutputStream());
        p.println(reverse);


    }
}
