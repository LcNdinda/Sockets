import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serveMultiplication {
    public static void main(String arg[]) throws IOException {
        int num3, num4, num5,  temp;
        ServerSocket serverSocketMul = new ServerSocket(1342);
        Socket ss = serverSocketMul.accept();

        Scanner sc = new Scanner(ss.getInputStream());
        num3= sc.nextInt();
        num4=sc.nextInt();
        num5=sc.nextInt();
        temp = num3 * num4 * num5;

        PrintStream p = new PrintStream(ss.getOutputStream());
        p.println(temp);

    }
}
