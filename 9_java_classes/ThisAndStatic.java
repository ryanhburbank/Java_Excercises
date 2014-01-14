/* this refers to the current object
this can be used inside any method to refer to the current object

Syntax:

Rectangle(double w, double h) {
  this.width = w;
  this.height = h
}

Hidden instance variables
use this to reference hidden instance variables
member variables and method params may have the same name,
under this situation, we use this to differentiate the two
Example below:

Static Keyword
a static class member can be used independently of any
object of that class(like a ruby class method)
A static member can be used by itself, without reference to 
a specific instance
syntax
  static int intvalue;

  static void aStaticMethod(){}

  restrictions:
  static methods:
    can only call other static methods
    must only rely on static data
    cannot refer to this or super in any way

    all instances of the class share the same static variable.
    You can declare a static block to initialize your static variables.
    The static block only gets called once when the class is first loaded.
*/
class Person {
  private String name;

  public Person(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}

public class ThisAndStatic {
  static int a = 3;
  static int b;

  static { //anything initialized within block will be static
    System.out.println("Static block initialized:::");
    b = a * a;
  }

  static void meth(int x){
    System.out.println("x = " + x);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
  public static void main(String[] args){
    ThisAndStatic.meth(42); //static method referred to by classname
    Person person = new Person("Ryan");
    System.out.println(person.getName());
    person.setName("Hunter");
    System.out.println(person.getName());
    System.out.println(ThisAndStatic.a);
  }
}