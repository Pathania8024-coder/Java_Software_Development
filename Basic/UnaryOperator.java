              // java code to illustrate arithmetic operations

public class UnaryOperator {



              // main method

              public static void main(String[] args) {
                            
                            //  initializing variable

                            int a = 10, result;


                            // Displaying variables
                            
                            System.out.println("a = " + a);

                            //  unary plus
                            result = +a;
                            System.out.println("After Applying Pre - increment = " + (result));

                            //  unary minus
                            result = -a;
                            System.out.println("After Post - increment = "+ (result));

                            // pre - increment
                            result = ++a;
                            System.out.println("After Applying Pre - increment = " + (result));

                            //  post - increment
                            result = a++;
                            System.out.println("After Post - increment = "+ (result));

                            //  pre - decrement
                            result = --a;
                            System.out.println("After Applying Pre - decrement = " + (result));

                            //  post - decrement
                            result = a--;
                            System.out.println("After Post - decrement = "+ (result));


                            
              }
              
}

              

