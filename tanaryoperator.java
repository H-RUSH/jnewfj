
import java.util.Scanner;

public class tanaryoperator {
 public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("please enter your mark");
    int hard=scanner.nextInt();
    String snip=(hard>=33)?"you have passsed the exam":"you have faild the exam";
    System.out.println(snip);
    System.out.println("please enter your age");
    int himadry=scanner.nextInt();
    String mondol=(himadry<18)?"1":"0";
    System.out.println(mondol);
    int sapla=scanner.nextInt();
    System.out.println((sapla<10)?"hellow its less then 10":"its more then 10");
   scanner.close();
 }
}
