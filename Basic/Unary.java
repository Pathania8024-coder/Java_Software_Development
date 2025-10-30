// java code to illustrate unary operators' working

// importing modules

import java.util.Scanner;

public class Unary {

              // main method

              public static void main(String[] args) {

                            int a, result;

                            Scanner sc = new Scanner(System.in);

                            // initializing variables
                            System.out.print("a = ");
                            a = sc.nextInt();

                            // unary plus
                            result = +a;
                            System.out.println("After Unary Plus : " + result);

                            // unary minus
                            result = -a;
                            System.out.println("After Unary Minus : " + result);

                            // pre - increment
                            result = ++a;
                            System.out.println("After Pre - increment : " + result);

                            // post - decrement
                            result = a++;
                            System.out.println("After Post - increment" + result);
                            // pre - decrement
                            result = --a;
                            System.out.println("After Pre - decrement : " + result);

                            // Post decrement
                            result = a--;
                            System.out.println("After Post - decrement" + result);

              }
              
}
