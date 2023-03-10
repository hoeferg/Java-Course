import java.util.Scanner;

public class MathClass {
    public static void main (String[] args) {

//        double x = 3.14;
//        double y = 10;

//        double z = Math.max(x, y);
//        Max finds the greater of two values

//        double z = Math.min(x, y);
//        Min finds the greater of two values

//        double z = Math.abs(y);
// displayes the absolute value of y

//        double z = Math.sqrt(y);
//        The square root function

//        double z = Math.round(x);
//        rounds a number

//        double z = Math.ceil(y);
//        round up number

//        double z = Math.floor(y);
//        round down number
//        System.out.println(z);

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotensuse is : "+z);

        scanner.close();
//        it is good to always close your scanner

    }
}
