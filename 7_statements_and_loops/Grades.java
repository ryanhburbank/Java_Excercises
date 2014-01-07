public class Grades {
  public static void main(String args[]) throws java.io.IOException {
    char choice;
    do {
      System.out.println("Help on:");
      System.out.println(" 1. A");
      System.out.println(" 2. B");
      System.out.println(" 3. C");
      System.out.println(" 4. D");
      System.out.println(" 5. E");
      System.out.println("Choose one:");
      choice = (char) System.in.read();
    } while (choice < '1' || choice > '5');
    System.out.println("\n");
    switch (choice) {
      case '1':
        System.out.println("A");
        break;
      case '2':
        System.out.println("B");
        break;
      case '3':
        System.out.println("C");
        break;
      case '4':
        System.out.println("D");
        break;
      case '5':
        System.out.println("E");
        break;
    }
  }
}