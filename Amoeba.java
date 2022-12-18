class Amoeba{

  private final boolean gender;
  //private final String gender = "männlich";
  private int size;

  Amoeba(boolean gender){
    this.size = 1;
    this.gender = gender;
    isFemale();
    }

    boolean isFemale(){
      if(this.gender == true){
        return true;
      }
      return false;
    }

    int getSize(){
      return size;
    }

    Amoeba feed(){
      this.size++;
      return this;
    }

    Amoeba hunger(){
      if(this.size > 1){
        this.size--;
      }
      return this;
    }

    Amoeba split(){
    if(this.size > 5){
      Amoeba newAmoeba = new Amoeba(gender);
      newAmoeba.size = this.size / 2;
      this.size -= newAmoeba.size;
      return newAmoeba;
    }
    return null;
    }

  /*  int setSize(){

  } */

    Amoeba join(Amoeba other){
      if(this.gender != other.isFemale() && this.size != other.getSize()){
        if(this.size > other.getSize()){
          Amoeba child1 = new Amoeba(this.gender);
          //child1.gender = this.gender;
          return child1;
        }
        else {
          Amoeba child2 = new Amoeba(other.isFemale());
          //child2.gender = other.isFemale();
          return child2;
        }
      }
      return null;
    }

    Amoeba attack(Amoeba other){
      if(this.gender == false && other.gender == false &&  this.size != other.getSize() ) {
        if(this.size != other.getSize()){
          other.size = 1;
        //  this.size = ;
        //  this.size +=;
          return this;
        }
      }
      return null;
    }
}
