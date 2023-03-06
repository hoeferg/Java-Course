public class swapTwoVariables {
    public static void main(String[] args) {
        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+y);
        System.out.println("y: "+x);
    }
}
