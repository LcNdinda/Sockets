import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {

    InetAddress host = InetAddress.getLocalHost();
    Socket socket = null;
    ObjectOutputStream oos = null;
    ObjectInputStream ois = null;

    public client() throws UnknownHostException {
    }

    public static void main(String args[]) throws IOException {

        Socket clientSocket = new Socket("127.0.0.1", 1342);
        Scanner sc1 = new Scanner(clientSocket.getInputStream());
// Addition
        Scanner user_input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter Two Number\n");
        num1= user_input.nextInt();
        num2=user_input.nextInt();
        System.out.print("\nAddition :" +(num1+num2));

// Multiplication
        Scanner user_input2 = new Scanner(System.in);
        int num3, num4, num5;
        System.out.print("\nEnter Three Number\n");
        num3= user_input.nextInt();
        num4=user_input.nextInt();
        num5=user_input.nextInt();
        System.out.print("\nMultiplication :" +(num3*num4*num5));

// Reverse word
        System.out.println("\nEnter the string to reverse");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";

        for (int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed String is:" +reverse);

    }
}
