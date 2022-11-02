import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String []Args) {
        Scanner scan = new Scanner(System.in);

        //initializes variables
        String coordinate;
        String coordinate2;
        double x;

        System.out.println("Hello");
        System.out.println("Enter coordinate 1: ");
        coordinate = scan.nextLine(); //declares value of coordinate variable
        int x1 = Integer.parseInt(coordinate.substring(1, coordinate.indexOf(","))); //parses out first integer between the
        // substring of 1 and ",", excluding ",/
        int y1 = Integer.parseInt(coordinate.substring(coordinate.indexOf(" ") + 1, (coordinate.indexOf(")")))); //parses out the second
        // integer between " " and ")", excluding the ")"/


        System.out.println("Enter coordinate 2: ");
        coordinate2 = scan.nextLine(); //declares value of coordinate2 variable
        int x2 = Integer.parseInt(coordinate2.substring(1, coordinate2.indexOf(","))); //parses out first integer
        // between the substring of 1 and ",", excluding ","/
        int y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(" ") + 1, (coordinate2.indexOf(")"))));//parses out the second
        // integer between " " and ")", excluding the ")"/


        if (x1 == x2) { //if x1 is equal to x2
            System.out.println(" the line is a vertical line" + " x= " + x1);
        } else { //if x1 is not equal to x2
            LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
            System.out.println("Equation: " + equation.equation());
            System.out.println("Slope: " + equation.slope());
            System.out.println("y-intercept: " + equation.yIntercept());
            System.out.println("Distance: " + equation.distance());
            System.out.println();
            System.out.println("----- Line info -----");
            System.out.println(equation.lineInfo());
            System.out.println();

            System.out.println("Enter value for x");
            x = scan.nextDouble(); //declares value of x
            double testX = x;  //assigns x to parameter of coordinateforX
            System.out.println("Coordinate for x: " + equation.coordinateForX(testX));
        }
    }
}


