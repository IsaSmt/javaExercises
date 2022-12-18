class Amoeba_Test{
  public static void main(String... args){

    Amoeba mother = new Amoeba(true);
    Amoeba father = new Amoeba(false);

    System.out.println("We have a mother amoeba now with size: " + mother.getSize() + "\n");
    System.out.println("We have a father amoeba now with size: " + father.getSize() + "\n");
    System.out.println("The mother amoeba is female: " + mother.isFemale() + "\n");
    System.out.println("The father amoeba is female: " + father.isFemale() + "\n");

    for(int i = 5; i >= 0; i--){
      mother.feed();
      father.feed();
    }

    System.out.println("After feeding the mother amoeba it has the size: " + mother.getSize() + "\n");
    System.out.println("After feeding the father amoeba it hast the size: " + father.getSize() + "\n");

    //System.out.println(mother.split().getSize());

    Amoeba zakaria = mother.split();
    System.out.println("The mother amoeba split itself and the new amoeba has the size: " + zakaria.getSize() + "\n");
    System.out.println("The new amoeba split from the mother amoeba is female: " + zakaria.isFemale() + "\n");

    Amoeba baby = mother.join(father);
    System.out.println("Mother and father have a baby with size: " + baby.getSize() + "\n");








  }
}
