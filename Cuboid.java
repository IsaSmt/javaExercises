class Cuboid{

  private double a = 0.0;
  private double b = 0.0;
  private double c = 0.0;
  private double volume;
  private static int counter;
  private double newVolume;
  public String name;

//default constructor sets sides to the same length 1.0
  Cuboid(){
    a = 1.0; b = 1.0; c = 1.0;
    counter++;
    name = "Cube " + counter;
  }

  //constructor with just one given parameter. Sets all sides of the cube to the given parameter.
  Cuboid(double n){
    a = n; b = n; c = n;
    counter++;
    name = "Cube " + counter;
  }

  Cuboid(double n, double i, double k){
    a = n; b = i; c = k;
    counter++;
    name = "Cube " + counter;
  }

  //copy constructor initializes an object with the same parameters as the given input.
  Cuboid(Cuboid r){
    a = r.a; b = r.b; c = r.c;
    counter++;
    name = "Cube " + counter;
  }

  public double getA(){
    return a;
  }
  public double getB(){
    return b;
  }
  public double getC(){
    return c;
  }

  //returns true if the given parameters a cube with the same length on every side.
  public boolean isCube(){
    if((a == b) && (b == c) && (a == c)){
      return true;
    }
    return false;
  }

  //gives back the volume of the cube.
  public double getVolume(){
    volume = a*b*c;
    return volume;
  }

  //compares two cubes and gives true back, if they have the same volume.
  public boolean hasSameVolume(Cuboid cub){
    if(this.volume == cub.getVolume()){
      System.out.println(name + " has same volume as " + cub.name + ": true");
      return true;
    }
    System.out.println(name + " has same volume as " + cub.name + ": false");
    return false;
  }

  //returns true, if both cubes are identical.
  public boolean isSame(Cuboid cub){
    if((cub.a == a) && (cub.b == b) && (cub.c == c)){
     return true;
    }
    return false;
  }

  /*returns true if the parameter cube fits into the original cube.
  ab = area of one side of the original cube
  AB = area of one side of the given input cube */
  public boolean fitsInto(Cuboid cub){
    double ab = a*b;
    double ac = a*c;
    double cubeAB = cub.a*cub.b;
    double cubeAC = cub.a*cub.c;
    double cubeBC = cub.b*cub.c;

    if(((cubeAB < ab) && (cubeAC < ac)) || ((cubeAB < ac) && (cubeAC < ac)) || ((cubeAC < ab) && (cubeBC < ac))){
      return true;
    }
    return false;
  }

  //returns how many objects were created with this class so far
  static int getCount(){
    return counter;
  }
}
