/* A variable is defined by an identifier, a type,
and an optional initializer.  The variables also
have scope
All variables must be declared before use. The basic
format is shown below
type identifier [ = value][, identifier [= value]...]
type could be int or float
to declare more then one variable of the same type,
you a comma seperated list

*/
/*int a, b, c; //declares three ints, a, b, c
int d = 3, e, f = 5; //declares three more ints
and initializes d and f */ 

// the following variables are defined and
// initialized in one expression
public class Variable {
  public static void main(String[] argv) {
    int a,b,c;
    byte z = 2; // initialize z
    double pi = 3.14; // declares an approx. of pi
    char x = 'x'; // the variable x has the value 'x'.
    a = b = c = 100; //sets x, y, and z to 100
    //the assignment operator '=' can be used to chain expressions
  }
}

//Jav allows variables to be initialized dynamically
//Math.sqrt returns the square root of 2 * 2 and assigns 
//the result to c directly
class Main {
  public static void main(String args[]){
    //c is dynamically initialized
    double c = Math.sqrt(2 * 2);

    System.out.println("c is " + c);
  }
}

// variables cannot be used prior to declaration
