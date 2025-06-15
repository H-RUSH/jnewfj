
import java.util.Scanner;

public class trymethod {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("hwllow plese int the number ");
            int hard = scanner.nextInt();
            System.out.printf("the number is %d", hard);
        }
    }
}
