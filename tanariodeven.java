
import java.util.Scanner;

public class tanariodeven {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("hellow please give a number");
    int a = scanner.nextInt();
    String b=(a%2==0)?"the number is even":"the number is odd ";
    System.out.println(b);
    scanner.close();
}
}
