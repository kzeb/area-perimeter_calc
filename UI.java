import java.util.Scanner;

public class UI {
    public static void Interface(){
        System.out.print("\nWelcome in my little area/perimeter calculator!\nI hope you will like it!\n");
        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Choose figure:\n   1. Square\n   2. Circle\n   3. Triangle\n   0. EXIT\nYour choice: ");
                String fig = scanner.nextLine();
                System.out.print("\n");
                int choice = Integer.parseInt(fig);
                switch (choice) {
                    case 1:
                        Square s = new Square();
                        boolean exist = s.makeSquare();
                        if (exist) s.print();
                        break;
                    case 2:
                        Circle c = new Circle();
                        exist = c.makeCircle();
                        if (exist) c.print();
                        break;
                    case 3:
                        Triangle t = new Triangle();
                        exist = t.makeTriangle();
                        if (exist) t.print();
                        break;
                    case 0:
                        System.out.println("Bye Bye!\nThank you for using my calculator!\n");
                        return;
                    default:
                        System.out.println("The number you have entered is incorrect. Try again later.\n");
                        break;
                }
            } catch (IllegalArgumentException il) {
                System.out.println("What are you doing?!?! That thing you have just entered is not even a number!\n");
            }
        }
    }
}