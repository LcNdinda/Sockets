import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class clientAddition {
    public static void main(String arg[]) throws IOException {
        Socket clientSocketAdd = new Socket("127.0.0.1", 1342);
        Scanner sc1 = new Scanner(clientSocketAdd.getInputStream());
        Scanner user_input = new Scanner(System.in);
        int num1, num2, temp;
        System.out.print("Enter Two Numbers to Add\n");
        num1= user_input.nextInt();
        num2=user_input.nextInt();

        PrintStream p = new PrintStream(clientSocketAdd.getOutputStream());
        p.println(num1);
        p.println(num2);
        temp=sc1.nextInt();
        System.out.println(temp);


        System.out.print("\nAddition :" +(num1+num2));
    }
}
