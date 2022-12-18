public class Triangle_Test {
  public static void main(String[] args){

    System.out.println("\nPlease enter a positive odd number: \n");
    int n = In.readInt();

//input needs to be greater zero and an even number in order to create a triangle/tree
    while((n < 0) || (n % 2 == 0)){
      System.out.println("\nPlease try again ");
      n = In.readInt();
    }
    Triangle testTriangle = new Triangle(n);
    testTriangle.display_triangle();
    System.out.println("\nNumber of stars: " + testTriangle.get_stars());
    System.out.println("Number of dots: " + testTriangle.get_dots() + "\n");
    testTriangle.display_tree();

    testTriangle.set_length(n+2);
    testTriangle.display_triangle();
    System.out.println("\nNumber of stars: " + testTriangle.get_stars());
    System.out.println("Numer of dots: " + testTriangle.get_dots() + "\n");
    testTriangle.display_tree();
  }
}
