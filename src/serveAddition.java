import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serveAddition {
    public static void main(String args[]) throws IOException {
        int num1, num2, temp;
        ServerSocket serverSocketAdd = new ServerSocket(1342);
        Socket ss = serverSocketAdd.accept();

        Scanner sc = new Scanner(ss.getInputStream());
        num1= sc.nextInt();
        num2=sc.nextInt();
        temp = num1 + num2;

        PrintStream p = new PrintStream(ss.getOutputStream());
        p.println(temp);

    }
}
