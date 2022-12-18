class Triangle{

  private int tree_trunk;
  private int length;
  private int lines;
  private int dots = 0;
  private int stars = 0;

  Triangle(int newLength) {
    set_length(newLength);
  }

//calculates a triangle shaped figure out of stars.
  public void display_triangle(){
    int zaehler = 0;
    while (zaehler < lines){
      int dots_counter = 0;
      while (dots_counter < lines -1 -zaehler){
        System.out.print(".");
        dots_counter++;
      }
      int stars_counter = 0;
      while (stars_counter < zaehler*2+1){
        System.out.print("*");
        stars_counter++;
      }
      int dots_counter_2 = 0;
      while (dots_counter_2 < lines -1 -zaehler){
        System.out.print(".");
        dots_counter_2++;
      }
      System.out.println();
      zaehler++;
    }
  }

//displays a tree-trunk attached to a triangle.
  public void display_tree(){
    display_triangle();
    int i = tree_trunk;

    while(i > 0){
      int g = length/2;
        while(g > 0){
          System.out.print(".");
          g--;
        }
      System.out.print("*");
      g = length/2;
        while(g > 0){
          System.out.print(".");
          g--;
        }
      System.out.println();
      i--;
    }
    System.out.println();
  }

//sets length to a new value in order to create a whole new tree
  public void set_length(int newLength){
    length = newLength;
    lines = newLength/2+1;
    stars = (int) ((length + 1) * (lines / 2.0));
    dots = length * lines - stars;
    tree_trunk = lines/2;
  }

  public int get_length() {
    return length;
  }

  public int get_lines() {
    return lines;
  }
  public int get_stars() {
    return stars;
  }
  public int get_dots() {
    return dots;
  }
}
