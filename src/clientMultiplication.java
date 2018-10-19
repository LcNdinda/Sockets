import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class clientMultiplication {
    public static void main(String arg[]) throws IOException {
        Socket clientSocketMul = new Socket("127.0.0.1", 1342);
        Scanner sc1 = new Scanner(clientSocketMul.getInputStream());
        Scanner user_input = new Scanner(System.in);
        int num3, num4, num5, temp;
        System.out.print("Enter Three Number to Multiply\n");
        num3= user_input.nextInt();
        num4=user_input.nextInt();
        num5=user_input.nextInt();

        PrintStream p = new PrintStream(clientSocketMul.getOutputStream());
        p.println(num3);
        p.println(num4);
        p.println(num5);
        temp=sc1.nextInt();
        System.out.println(temp);

    }
}
