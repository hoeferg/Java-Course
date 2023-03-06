public class Variable {
    public static void main (String[] args) {
// boolean = true or false, 1 bit of memory, primitive
// byte holds a number -127 to 127, 1 bit of memory, primitive
// short holds a number from -32768 to 32767, 2 bytes of memory, primitive
// int -2 billion to 2 billion. 4 bytes of memory, primitive
//// long -9 quintillion to 9 quintillion, 8 bytes, primitive
//// float store a decimal (also called a fractional number) up to 6 or 7 digits, 4 byte, you must follow the value by letter f example: 3.141592f , primitive
//// double store a decimal up to 15 digits, 8 bytes, primitive
//// char stands for characters, store a single characters/letter/ASCII value, 2 bytes, must suround varibale with a pair of single quotes '' , primitive
//// string reference data type that stroes a squence of characters like a word.
// Primitve typse store data, can only hold 1 value, ;ess memory, fast
// Reference stroes an address, could hold more than 1 value, More memory, slower

//        int x =123; //initialization
//        System.out.println("My number is: "+x);

//        long x =123135496841321786L;
//        System.out.println("My number is: "+x);

//        byte x =127; //this is the max num
//        System.out.println("My number is: "+x);

        int x =123;
        float y = 3.14f;
        double y2 = 3.14;
        boolean z = false;
        char symbol = '@';
        String name = "Gayle"; // is a reference data type and all reference data types start with a capital letter

        System.out.println("Hello " + name);
    }
}
