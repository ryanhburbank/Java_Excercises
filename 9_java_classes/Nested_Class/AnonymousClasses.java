/* 
Nested Class:
 Classes are declared outside of any class are top-level classes.
 Nested classes are classes declared as members of other classes
 or scopes.

 The 4 nested classes:
  static member classes,
  nonstatic member classes,
  anonymous classes,
  local classes

  1: Anonymous Classes
  An anonymous class is a class without a name and 
  simultaneously declared.  You can instantiate an anonymous
  class where it is legal to specify an expression.

  An anonymous class instance can only access local final
  variables and final parameters

  Syntax how to define an anonymous class
*/
  interface People {
    abstract void speak();
  }

  public class NestedClasses {
    public static void main(final String[] args) {
      new People() {
        String msg = "this is test.";

        @Override //override method definition 
                 //with new definition
        public void speak() {
          System.out.println(msg);
        }
      }.speak();
    }
  }

