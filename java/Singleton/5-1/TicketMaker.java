public class TicketMaker{
    private static TicketMaker ticketmaker = new TicketMaker();
    private int ticket =1000;
    private TicketMaker(){
	System.out.println("instance maked.");
    }
    public static TicketMaker getInstance(){
	return ticketmaker;
    }
    public int getNextTicketNumber(){
	return ticket++;
    }
}
