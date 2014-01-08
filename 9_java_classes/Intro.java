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
