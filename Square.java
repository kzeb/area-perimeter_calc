import java.util.Scanner;

public class Square extends Figure implements Print {

    double side;

    public Square(){
        this.side = 0;
    }

    public boolean makeSquare(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter side length: ");
            this.side = scanner.nextDouble();
            if (this.side <= 0) throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println("\nYou passed illegal argument, try again.\n");
            return false;
        }
        return true;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public void print() {
        System.out.println("\nFigure: Square\nArea: " + calculateArea() + "\nPerimeter: " + calculatePerimeter() + "\n\n");
    }
}
