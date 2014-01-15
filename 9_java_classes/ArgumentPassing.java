/* Method Argument Passing
  When a parameter is passed into a method, it can be passed
  by value or by reference.  Pass-by-value copies the value
  of an argument into the parameter.  
  Changes made to the parameter have no effect on the argument.
  Pass-by-reference passes a reference to the parameter.
  Changes made to the parameter will affect the argument

  Example: When a primitive type is passed to a method, it is 
  done by use of call-by-value.

  Objects are passed by use of call-by-reference.
  the following program uses the "pass by value"
  */
  class Test { //pass-by-value
    void change(int i, int j) {
      i *= 2;
      j /= 2;
    }
  }

  class Test2 { //pass-by-reference
    int a, b;
    Test2(int i, int j){
      a = i;
      b = j;
    }
    void change(Test2 object) {
      object.a *= 2;
      object.b /= 2;
    }
  }

  public class ArgumentPassing {
    public static void main(String args[]){
      Test object = new Test();
      
      int a = 5, b = 2;

      System.out.println("a and b before call: " + a + " " + b);
      object.change(a, b); //not change in a & b value
      System.out.println("a and b after call: " + a + " " + b);
    
      Test2 object2 = new Test2(7,9);

      System.out.println("object2.a => " + object2.a + " object2.b => " + object2.b);
      System.out.println("running object2.change(object2)...");

      object2.change(object2);

      System.out.println("object2.a => " + object2.a + " object2.b => " + object2.b);

    }
  }