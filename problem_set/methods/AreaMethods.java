package problem_set.methods;

public class AreaMethods{

        public static double area(double side) {
            return side * side;
        }

        public static double area(double width, double height) {
            return width * height;
        }
        public static double area(double base1, double base2, double height) {
            return ((base1 + base2) * height) / 2;
        }

        public static void main(String[] args) {
            System.out.println("Area of square (side = 4): " + area(4));
            System.out.println("Area of rectangle (5 x 3): " + area(5, 3));
            System.out.println("Area of trapezoid (base1 = 6, base2 = 4, height = 5): " + area(6, 4, 5));
        }
    }
