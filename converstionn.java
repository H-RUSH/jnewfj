
import java.util.Scanner;

public class converstionn {
    public static void main(String[] args) {
        /*
         * here we have some goles and which is down bellow
         * declear veriable
         * welcome message
         * prompt for choise
         * option 1 choise and option 2 choise
         * thank u for vising our softwear
         */
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newweight;
        int choise;
        System.out.println("Hellow brother what kind of unit convertion u want please tell me ");
        System.out.println("1: from pound to kg");
        System.out.println("2: from kgs to pound");
        System.out.print("please choose a option ");
        choise = scanner.nextInt();
        if (choise == 1) {
            System.out.println("you wan to convert pound to kg");
            System.out.println("tell me the weight in pound");
            weight=scanner.nextDouble();
            newweight=weight*0.453592;
            System.out.printf("you out the weight:%.2f and the converted weight on kg is %.2f",weight,newweight);
           
        } else if (choise == 2) {
            System.out.println("you want to convert kg to pound");
            System.out.println("tell me the weight in kg");
            weight=scanner.nextDouble();
            newweight=weight/0.453592;
            System.out.printf("you out the weight:%.2f and the converted weight pound is %.2f",weight,newweight);
        } else {
            System.out.println(" thanks for using our softwear");
        }

        scanner.close();
    }
}
