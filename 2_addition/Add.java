public class Add {
  public static void main(String args[]) {
    int num, num2; // a variable called num
    //in java variables must be declared before use
    num = 100;
    num2 = 200;
    if (num < num2) { //begining of block
      num = num2;
      num2 = 0;
      System.out.println("num == " + num);
      System.out.println("num2 == " + num2);
    } //end of block

    System.out.print("The sum of " + num + " and " + num2 + " is: ");
    System.out.println(num + num2);
    int i, y;
    y = 0;
    for (i = 0; i < num / 50; i++ ) { //target of this loop is a block
      System.out.print(y + " + 50 equals: ");
      y += 50;
      System.out.println(y);
    }
  }
}