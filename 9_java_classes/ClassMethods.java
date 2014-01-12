/* Classes generally consist of two things: instance variables
and methods.  Instance variables are data, while methods define
behaviours

Syntax of a methods

type name(parameter-list) {
  //method body
}
type specifies the type of data returned by the method
if there is no return, the type must be void
name refers to the name of the method
parameter-list is a sequence of type identifiers pairs(comma seperated)
example: (int cost, char title)
methods with no parameters have empty parameter lists

*/
class Box {
  int width;
  int height;
  int depth;
  int volume;
  int getArea() { 
  //note: declared data type(int) must match actual return type
    return width * height;
  }
  void calculateVolume() { //void as there is no data returned 
    System.out.print("Volume is ");
    System.out.println(width * height * depth);
    volume = width * height * depth;
  }
}

class MyClass {
  int myMemberValue = 2;
  MyClass() {

  }
  MyClass doubleValue() {
    MyClass temp = new MyClass();
    temp.myMemberValue = temp.myMemberValue*2;
    return temp;
  }
}

public class ClassMethods {
  public static void main(String args[]){
    Box mybox1 = new Box();
    mybox1.width = 10;
    mybox1.height = 20;
    mybox1.depth = 15;
    int area;
    area = mybox1.getArea();
    mybox1.calculateVolume();
    System.out.println("Volume is " + mybox1.volume);
    System.out.println("Area is " + area);
    
    //A method can also return class types
    MyClass ob1 = new MyClass();
    MyClass ob2;

    ob2 = ob1.doubleValue();
    System.out.println("ob1 myMemberValue is " + ob1.myMemberValue);
    System.out.println("ob2 myMemberValue is " + ob2.myMemberValue);

    ob2 = ob2.doubleValue();
    System.out.println("ob2 myMemberValue is " + ob2.myMemberValue);
  }
}