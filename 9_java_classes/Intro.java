/* A class defines a new data type.  This new type can be
used to create objects of that type.  A class is a template 
for an object, and an object is an instance of a class
Syntax: 
general form of a class definition
class classname {
  type instance-variable1
  ...etc

  type methodname1(parameter-list){
   //body of method
  }

  etc...
}

classes are declared with the 'class' keyword
methods and variables within are called class members
variables defined within a class are instance variables 
because each instance of the class contains its own copy
of these variables

the data for one object is seperate and unique from the data of
another
Example below:
a class called Box that defines three member variables
class Box {
  int width, height, depth;
}

When creating a class you are creating a new data type
you can use this type to declare objects of that type

Syntax: 
Creating objects of a class is a two step process.
 Declare a variable of the class type
 use the new operator to dynamically to dynamically allocate
 memory for an object. 

 Box mybox = new Box()//declares an object of type box. combines both
 //steps, can be broken down into two steps as below:

 Box mybox; //declare reference to object of type box.  At this point
              mybox contains the value null, indiciating it does not yet
              point to an actualy object, this attempting to use it will result
              in an error.
mybox = new Box(); //allocate a Box object and assigns a
              reference to mybox.  After second line executes
              mybox can be used as a Box object 
              mybox holds the memory address of the actual Box object 
 
Example: A class defines a new type of data.  We will create
a Box object, then create an instance of that object
*/
class Box {
  int width;
  int height;
  int depth;
}

public class Intro {
  public static void main(String args[]) {
    Box myBox = new Box();
    myBox.width = 10;

    System.out.println("myBox.width:" + myBox.width);
  /* mybox is an instance of Box.  mybox contains its 
  own copy of each instance variable, width, height, and depth,
  each originally defined by the class.  To access these variables
  you the '.' operator
  }
}