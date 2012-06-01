public class IncrementalNumberGenerator extends NumberGenerator{
    private int start,end,inc;
    int number=0;
    public IncrementalNumberGenerator(int start,int end,int inc){
	this.start=start;
	this.end=end;
	this.inc=inc;
	this.number=start;
    }
    public int getNumber(){
	return number;
    }
    public void execute(){
	for(int i=0;end-i*inc+start>0;i++){
	    number=start+inc*i;
	    notifyObservers();
	}
    }
}
