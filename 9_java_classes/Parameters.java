// public class Classes {
//   public static void main (String args[]) {
//     int i;
//     for(i = 0; i <= 10; i++)
//       System.out.println(i);
//   }
// }
/* Parameters allow a method to be generalized by operating
on a variety of data.

Syntax: type methodName (paramter Type variable1, paramter Type2 variable2,...){
  //method body
}
Example: Rectangle class has a method to accept dimensions
of a rectangle and the sets the dimensions with a passed in value.
*/
class Rectangle {
  double width;
  double height;

  double area() {
    return width * height;
  }

  void setDim(double w, double h) {
    width = w;
    height = h;
  }
}

class Test {
  int a;

  Test(int i) { //allows a to be set when creating instances of 
                //Test object 
    a = i;
  } 
  boolean equals(Test o){ //parameter is a Test object variable 'o'
    if(o.a == a) //thus we are passing an object to the method
      return true;
    else
      return false;
  }
}

public class Parameters {

  public static void main(String args[]) {
    Rectangle mybox1 = new Rectangle();
    double vol;
    mybox1.setDim(10,20);
    vol = mybox1.area();

    System.out.println("Area is " + vol);

    Test ob1 = new Test(100);
    Test ob2 = new Test(100);

    System.out.println("ob1.a == ob2.a =>" + ob1.equals(ob2));
  }
}
