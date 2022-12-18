class Rekursion {

  public static void main(String[] args){
    int a = In.readInt();
    System.out.println(add_n(a));
  }

  static int add_n(int x){
    if (x == 0) return(0);
    else {
    int b = In.readInt();
    return(x+add_n(b)) ;
    }
  }
}
