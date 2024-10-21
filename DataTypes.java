// public class FirstProgram {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }
public class DataTypes {
    public static void main(String[] args) {
        // Primitive data types
        byte a = 100;
        short b = 10000;
        int c = 100000;
        long d = 100000L;
        float e = 234.5f;
        double f = 123.4;
        char g = 'A';
        boolean h = true;

        // Non-primitive data types
        String str = "I am a software developer";
        int[] arr = {1, 2, 3, 4, 5};

        // Displaying the values
        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        test();
        testConditional();
    }
    public static void test(){
        System.out.println("\nHello, World!");
    }

public static void testConditional(){
   int  Scanner x ;
    int y = 20;
    int z = 5;

    if (x >y&&x>z) {
        System.out.println("x is greater than y and z");
        } 
        
    else if(y>x&&y>z) {
        System.out.println("y is greater than x and z");
        }
    else if(z>x&&z>y){
        System.out.println("z is greater than xand y");
    }
    else{
        System.out.println("x,y,z are equal");
    }
}

}
