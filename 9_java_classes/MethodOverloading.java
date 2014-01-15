/* Method Overload
Java allows you to define 2 or more methods within the same class
that share the same name, as long as their parameter declarations
are different.

When this is the case, the methods are said to be overloaded

note: overloaded methods have same name but different params.
Overloaded methods must differ in the type or number of params,
overloaded method may have different return types, but return type
alone is insufficent to distinguish between two methods. 

example below: 
*/

class OverloadDemo {
  int volume;

  OverloadDemo(int volume){
    this.volume = volume;
  }

  OverloadDemo(){
    this.volume = -1;
  }
  OverloadDemo(OverloadDemo object){
    this.volume = object.volume;
  }
  void test() {
    System.out.println("No params");
  }
  void test(int a) {
    System.out.println("a: " + a);
  }
  void test(int a, int b) {
    System.out.println("a and b: " + a + " " + b);
  }
  double test(double a) {
    System.out.println("double a: " + a);
    return a * a;
  }
}

public class MethodOverloading {
  public static void main(String args[]){
    OverloadDemo object = new OverloadDemo();
    object.test();
    object.test(5);
    object.test(2,4);
    double answer = object.test(12.34);
    System.out.println("Result of object.test(12.34): " + answer);
  }
}