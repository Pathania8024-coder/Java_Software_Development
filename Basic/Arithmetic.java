// java code to illustrate arithmetic operations

// importing java.util.Scanner

import java.util.Scanner;

public class Arithmetic {

              // Main Method
              public static void main(String[] args) {

                            // initializing variables

                            int a,b;
                            Scanner sc = new Scanner(System.in);

                            // Displaying variables

                            System.out.println("Enter a = ");
                            a = sc.nextInt();

                            System.out.println("Enter b = ");
                            b = sc.nextInt();

                            //  addition
                            System.out.println("After Addition = " + (a+b));

                            //  Subtraction
                            System.out.println("After Subtraction = "+ (a-b));

                            //  Multiplication
                            System.out.println("After multiplication = " + (a*b));

                            //  Division
                            System.out.println("After Division = " + (a/b));
                            //  Modulus
                            System.out.println("After mod = " + (a%b));
                            
                            
              }
}
