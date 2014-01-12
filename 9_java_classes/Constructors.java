/* A constructor initializes an object during object creation
   when using the 'new' operator.

   Java allows objects to initialize themselves when they are created. 
   This auto initialization is performed through the use of a 
   constructor

   Syntax: 
   constructor method has same name as class without a return type(not even void!)

   class ClassName {
  
      ClassName(parameter list) { //constructor
        
      }
   }
   Example: Rectangle class uses a constructor to set dimensions
   */
   class Rectangle {
    double width;
    double height;
    double area;

    Rectangle() { //note: default constructor has no parameters
      width = 10;
      height = 10;
    }
    /*if you do not declare a default constructor, the compiler
    will add it for you.  the compilers defaul constructor initializes
    class member variables with their default value.
    */
  
    double area() {
      return width * height;
    }

    void setArea() {
      area = width * height;
      System.out.println("Area has been set to " + area);
    }
   }

   public class Constructors {
    public static void main(String args[]){
      Rectangle mybox1 = new Rectangle();
      double area = 23.45;
      mybox1.setArea();
      System.out.println("Area is " + mybox1.area);
      System.out.println("Scope check, main area is " + area);
    }
   }