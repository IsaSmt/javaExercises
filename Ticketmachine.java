class Ticketmachine {

  public int ticketPrice;
  public int alreadyPaid = 0;
  public int totalSum = 0;

  Ticketmachine(int newTicketPrice){
    ticketPrice = newTicketPrice;
  }

  public void insertMoney(int amount){
    if(amount > 0) alreadyPaid += amount;
  }

  public void printTicket(int newSum){
    System.out.println("###################");
    System.out.println("#Erstsemesterfeier#");
    System.out.println("######Ticket#######");
    System.out.println("######" + ticketPrice + " Cent######");
    System.out.println("###################\n");
    totalSum += newSum;
    alreadyPaid -= newSum;
  }

  public String resetAlreadyPaid(){
    int remainingMoney = alreadyPaid;
    alreadyPaid = 0;
    return "Ausgabe Restgeld: " + remainingMoney + " Cent\nGesamtsumme: " + totalSum + " Cent\n";
  }

  public void processTicket(){
    System.out.print("Bitte M\u00fcnze eingeben: ");
    insertMoney(In.readInt());
    char decision;

    while(alreadyPaid < ticketPrice){
      System.out.print("Bitte M\u00fcnze einwerfen ( " + (ticketPrice - alreadyPaid) + " Cent bis zum n\u00e4chsten Ticket): ");
      insertMoney(In.readInt());
      System.out.println();
    }
      printTicket(ticketPrice);
      do {
        System.out.println("Wollen Sie weitere Tickets? (j/n)");
        decision = In.readChar();

        switch(decision){
          case 'j':
            while(alreadyPaid < ticketPrice){
                System.out.print("Bitte M\u00fcnze einwerfen (" + (ticketPrice - alreadyPaid) + " Cent bis zum n\u00e4chsten Ticket): ");
                insertMoney(In.readInt());
                System.out.println();
            }
          printTicket(ticketPrice);
            break;
          case 'n':
          System.out.println("Vielen Dank. Bis zum n\u00e4chsten Mal! \n");
            break;
          default:
            System.out.println("Unbekannt. Bitte nochmal versuchen..");
            break;
          }
        }
      while(decision != 'n');
    System.out.println(resetAlreadyPaid());
  }
}
