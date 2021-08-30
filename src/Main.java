import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers: ....");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x == y & x == z & y == z)
            System.out.println(x + " " + y + " " + z);
       else  if (x == y)
            System.out.println(x + " " + y);
       else  if (x == z)
            System.out.println(x + " " + z);
       else  if (y == z)
            System.out.println(y + " " + z);

    }
}
