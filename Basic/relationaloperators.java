// java code to illustrate arithmetic operations

import java.util.Scanner;

public class relationaloperators {


              // main method

              public static void main(String[] args) {
                            
                            //  initializing variables

                            int a, b;

                            Scanner sc = new Scanner(System.in);

                            // Displaying variables
                            System.out.print("a = ");
                            a = sc.nextInt();

                            System.out.print("b = ");
                            b = sc.nextInt();

                            //  Equal to
                            System.out.println("Equal to : " + (a==b));

                            //  Not Equal to
                            System.out.println("Not Equalt to : "+ (a!=b));

                            //  Greater than
                            System.out.println("Greater than : " + (a>b));

                            //  Greater than or eqaul to
                            System.out.println("Greater than or eqaul to : " + (a>=b));

                            //  Less than
                            System.out.println("Less than : " + (a<b));

                            //  Less than or eqaul to
                            System.out.println("Less than or eqaul to : " + (a<=b));
                            

                            
              }
              
}
