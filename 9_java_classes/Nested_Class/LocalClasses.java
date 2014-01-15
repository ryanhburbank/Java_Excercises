/* A local class is a class that is declared anywhere
that a local variable is declared.  A local class has the
same scope as a local variable

A local class has a name and can be reused.  A local class
instance can access the surrounding scope's local final variables
and final parameters. 
example: below
*/
class MyClass {
  void myMethod(final int x) {
    final int y = x;

    class LocalClass {
      int a = x;
      int b = y;
    }

    LocalClass lc = new LocalClass();
    System.out.println(lc.a);
    System.out.println(lc.b);    
  }
}

class Item{/*from java2  s. c  o  m*/
  private String name;
  private String value;
  
  public Item(String n, String v){
    name = n;
    value = v;
  }
  public String toString(){
    return name + value;
  }
}

interface Iterator {
  boolean hasMoreElements();

  Object nextElement();
}

class ItemManager {
  private Item[] itemArray;
  private int index = 0;

  ItemManager(int size) {
    itemArray = new Item[size];
  }

  Iterator iterator() {
    class Iter implements Iterator {
      int index = 0;

      @Override
      public boolean hasMoreElements() {
        return index < itemArray.length;
      }

      @Override
      public Object nextElement() {
        return itemArray[index++];
      }
    }
    return new Iter();
  }

  void add(Item item) {
    itemArray[index++] = item;
  }
}

public class LocalClasses {
  public static void main(String[] args) {
    MyClass object = new MyClass();
    object.myMethod(10); //myMethod initializes LocalClass, sets local variable
  
    ItemManager itemManager = new ItemManager(5);
    itemManager.add(new Item("#1", "A"));
    itemManager.add(new Item("#2", "B"));
    itemManager.add(new Item("#3", "C"));
    Iterator iter = itemManager.iterator();
    while (iter.hasMoreElements()){
      System.out.println(iter.nextElement());
    }
  }
}