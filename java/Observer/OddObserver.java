public class OddObserver implements Observer{
    public void update(NumberGenerator generator){
	if(generator.getNumber()%2==1){
	    System.out.println(generator.getNumber()+"is ODD NUMBER!!");
	}
	try{
	    Thread.sleep(100);
	}catch(InterruptedException e){
	}
    }
}
