class Cuboid_Test{

  public static void main(String... args){

    Cuboid cuboid1 = new Cuboid(1.5, 2.5, 3.5);
    Cuboid cuboid2 = new Cuboid(1.4, 2.4, 3.4);
    Cuboid cuboid3 = new Cuboid(cuboid1);
    Cuboid cuboid4 = new Cuboid(4.0);
    Cuboid cuboid5 = new Cuboid(5.0);

    System.out.println("Cube 1: ");
    System.out.println(cuboid1.getA());
    System.out.println(cuboid1.getB());
    System.out.println(cuboid1.getC());
    System.out.println("It is a cube: " + cuboid1.isCube());
    System.out.println("Volume: " + cuboid1.getVolume());

    System.out.println("\nCube 2: ");
    System.out.println(cuboid2.getA());
    System.out.println(cuboid2.getB());
    System.out.println(cuboid2.getC());
    System.out.println("It is a cube: " + cuboid2.isCube());
    System.out.println("Volume: " + cuboid2.getVolume());

    System.out.println("\nCube 3: ");
    System.out.println(cuboid3.getA());
    System.out.println(cuboid3.getB());
    System.out.println(cuboid3.getC());
    System.out.println("It is a cube: " + cuboid3.isCube());
    System.out.println("Volume: " + cuboid3.getVolume());

    System.out.println("\nCube 4: ");
    System.out.println(cuboid4.getA());
    System.out.println(cuboid4.getB());
    System.out.println(cuboid4.getC());
    System.out.println("It is a cube: " + cuboid4.isCube());
    System.out.println("Volume: " + cuboid4.getVolume() + "\n");

    cuboid1.hasSameVolume(cuboid3);
    cuboid1.hasSameVolume(cuboid4);
    cuboid2.hasSameVolume(cuboid3);
    cuboid1.hasSameVolume(cuboid2);
    System.out.println();

    System.out.println("Cube 4 + Cube 5 are the same: " + cuboid4.isSame(cuboid5));
    System.out.println("Cube 2 + Cube 3 are the same: " + cuboid2.isSame(cuboid3));
    System.out.println("Cube 1 + Cube 3 are the same: " + cuboid1.isSame(cuboid3) +"\n");

    System.out.println("Cube 2 fits into Cube 1: " + cuboid1.fitsInto(cuboid2));
    System.out.println("Cube 2 fits into Cube 4: " + cuboid4.fitsInto(cuboid2));
    System.out.println("Cube 4 fits into Cube 5: " + cuboid5.fitsInto(cuboid4) + "\n");

    System.out.println("Anzahl erzeugter Objekte: " + cuboid5.getCount() + "\n");
  }
}
