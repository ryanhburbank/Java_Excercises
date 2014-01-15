/* Java Method Recursion 

Recursion allows a method to call itself

Code Example: 

*/
class Factorial {
  //this is a recursive function
  int factorial(int n) {
    int result;

    if (n == 1){
      return 1;
    }
    result = factorial(n - 1) * n;
    return result;
  }
}

public class MethodRecursion {
  public static void main(String args[]) {
    Factorial object = new Factorial();

    System.out.println("Factorial of 5 is " + object.factorial(5));
  }
}