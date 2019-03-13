import java.util.Scanner;

public class Triangle extends Figure implements Print {

    double x, y, z;

    public Triangle(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public boolean makeTriangle(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter length 1: ");
            this.x = scanner.nextDouble();
            System.out.print("Enter length 2: ");
            this.y = scanner.nextDouble();
            System.out.print("Enter length 3: ");
            this.z = scanner.nextDouble();
            if (this.x <= 0 || this.y <= 0 || this.z <= 0) throw new IllegalArgumentException();
            if(!possiblyTriangle(this.x, this.y, this.z)){
                System.out.println("\nYou can not create a triangle using the sides you have entered\n");
                return false;
            };
        } catch (Exception e) {
            System.out.println("\nYou passed illegal argument, try again.\n");
            return false;
        }
        return true;
    }

    public boolean possiblyTriangle(double x, double y, double z){
        if (x + y > z && x + z > y && z + y > x) return true;
        return false;
    }

    @Override
    double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    double calculatePerimeter() {
        return x + y + z;
    }

    @Override
    public void print() {
        System.out.println("\nFigure: Triangle\nArea: " + calculateArea() + "\nPerimeter: " + calculatePerimeter() + "\n\n");
    }
}
