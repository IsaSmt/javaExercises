class Quersumme_Rek {
  public static void main(String[] args){
    int input;

    do {
      System.out.println("Please enter a number:\n");
      input = In.readInt();
    }
    while (input <= 0);

    System.out.println("\nYour input: " + input);
    System.out.print("\nThe cross sum is: ");
    System.out.print(calculate(input));

  }

  public static int calculate(int input) {
    int rest = input%10;
    input /= 10;
    //sum = rest + sum;

      if(input > 0) {
        System.out.print(rest + " + ");
        return rest + calculate(input);
      }
    else {
      System.out.print(rest + " = ");
      return rest;
    }
  }
}
