import java.util.Scanner;

public class Circle extends Figure implements Print {

    double radius;

    public Circle(){
        this.radius = 0;
    }

    public boolean makeCircle(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter radius length: ");
            this.radius = scanner.nextDouble();
            if (this.radius <= 0) throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println("\nYou passed illegal argument, try again.\n");
            return false;
        }
        return true;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public void print() {
        System.out.println("\nFigure: Circle\nArea: " + calculateArea() + "\nPerimeter: " + calculatePerimeter() + "\n\n");
    }
}
