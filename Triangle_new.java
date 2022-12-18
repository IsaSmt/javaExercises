class Triangle_new {

  private int tree_trunk;
  private int length;
  private int lines;
  private int dots = 0;
  private int stars = 0;
  private int zaehler = 0;

  Triangle_new(int newLength) {
    length = newLength;
    lines = newLength/2+1;
    stars = (int) ((length + 1) * (lines / 2.0));
    dots = length * lines - stars;
    tree_trunk = length/2-1;
  }

  public void display_triangle(){
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

  public void display_tree(){
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
    int tree_trunk = length/2;
    for(int i = tree_trunk; i > 1; i--){
      while(tree_trunk > 0){
        System.out.print(".");
        tree_trunk--;
      }
      System.out.print("*");

      tree_trunk = length/2;
      while(tree_trunk > 0){
        System.out.print(".");
        tree_trunk--;
      }
      System.out.println();
      tree_trunk = length/2;
    }
  }

  public void set_length(){

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
