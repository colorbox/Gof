public class Main{
    public static void main(String[] args){
	TicketMaker tm1 = TicketMaker.getInstance();
	TicketMaker tm2 = TicketMaker.getInstance();
	System.out.printf("%d\n",tm1.getNextTicketNumber());
	System.out.printf("%d\n",tm2.getNextTicketNumber());
	System.out.printf("%d\n",tm1.getNextTicketNumber());
	System.out.printf("%d\n",tm2.getNextTicketNumber());
	System.out.printf("%d\n",tm1.getNextTicketNumber());
	if(tm1==tm2){
	    System.out.println("equal!");
	}

    }
}