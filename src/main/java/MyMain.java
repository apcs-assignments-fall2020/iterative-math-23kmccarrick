import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 6;
        double m = 8;
        boolean sub = false;
        while (sub==false){
            if (Math.abs(m-n)<.000009)
                sub = true;
            n = m;
            m = (n + x/n) / 2;
            
        }
        return n;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        if (x==0)
            return 1;
        for(int i = x-1; i>0; i--){
            x = x * i;
        }
        return x;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 0;
        int i = 0;
        while(Math.E-e>.00001){
            e += 1/factorial(i);
            i++;
        }
        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number!");
        int input = scan.nextInt();
        System.out.println("The squareroot of " + input + " is " + babylonian(input));
        System.out.println("The factorial of " + input + " is " + factorial(input));
        System.out.println("The value of e is roughly " + calculateE());


        

        scan.close();
    }
}
