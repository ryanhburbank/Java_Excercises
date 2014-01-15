/* 
Java Constructor Overload:
  constructors can also be overloaded
  the this keyword can call the overloaded constructors. 
  The general form is shown here. 
  this(arg-list)
  when this() is executed, the overloaded constructor that
  matches the arg-list is executed first

  the call to this() must be the first statement within
  a constructor.

Example: 3
*/

class MyClass {
  int a;
  int b;
  private int c;

  MyClass(int i, int j) { //initialize a & b individually
    a = i;
    b = j;
    c = i + j;
  }
  
  MyClass(int i) { //initialize a & b to the same value
    this(i, i); // invokes MyClass(i, i)
  }

  MyClass() { // give a & b default values of 0
    this(0); //invokes MyClass(0)
  }
  int c() {
    return this.c;
  }
}

public class ConstructorsOverload {
  public static void main(String args[]){
    MyClass object1 = new MyClass();
    MyClass object2 = new MyClass(3);
    MyClass object3 = new MyClass(1,2);
    System.out.println("object1 is: " + object1.a + " object2 is: " + object1.b);
    System.out.println("object2 is: " + object2.a + " object2 is: " + object2.b);
    System.out.println("object3 is: " + object3.a + " object3 is: " + object3.b);
    System.out.println("object1.c is: " + object1.c());
  }
}