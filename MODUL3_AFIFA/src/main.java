
import java.util.Scanner;
import java.util.InputMismatchException;

public class main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    calculation calculation = new calculation();

    do {
        try {
            System.out.println("\n-----Menu Program-----");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Trapezoid");
            System.out.println("0. Exit");
            System.out.print("\nPlease select menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
            case 1:
                System.out.print("\nInsert the side : ");
                double sisi = scanner.nextDouble();
                calculation.setsquare(sisi);
                calculation.run();
                System.out.println("\nThe result: " + calculation.getsquare());
                break;

            case 2:
                System.out.print("\nInsert the radius : ");
                double radius = scanner.nextDouble();
                calculation.setcircle(radius);
                calculation.run();
                System.out.println("\nThe result: " + calculation.getcircle());
                break;

            case 3:
                System.out.print("\nInsert the upper side : ");
                double a = scanner.nextDouble();
                System.out.print("Insert the side of the base : ");
                double b = scanner.nextDouble();
                System.out.print("Insert the height : ");
                double t = scanner.nextDouble();
                calculation.settrapesium(a, b, t);
                calculation.run();
                System.out.println("\nThe result: " + calculation.gettrapesium());
                break;

            case 0:
                System.out.println("\nPROGRAM END.");
                break;

            default:
                System.out.println("\nChoose an option in the menu");
                continue;
        }

        repeat = false;
    } catch (InputMismatchException e) {
        System.out.println("\n---------Input must be a number---------");
        scanner.next();
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
} 
while (repeat);
    

scanner.close();
  }
}
