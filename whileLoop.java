import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as it's condition remains true
        Scanner scanner = new Scanner(System.in);
        String name = "";

//        while(name.isBlank()) {
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//       /do loop = makes sure you perform this block of code at least once
        do {System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while(name.isBlank());
        System.out.println("Hello "+name);
    }
}
