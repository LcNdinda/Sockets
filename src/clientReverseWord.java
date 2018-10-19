import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class clientReverseWord {
    public static void main(String arg[]) throws IOException {
        Socket clientSocketReverse = new Socket("127.0.0.1", 1342);
        Scanner sc1 = new Scanner(clientSocketReverse.getInputStream()); // scanner for socket
        System.out.println("\nEnter the string to reverse");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();


        PrintStream p = new PrintStream(clientSocketReverse.getOutputStream());
        p.println(str);
        String reverse = sc1.next();
        System.out.println(reverse);



    }
}
