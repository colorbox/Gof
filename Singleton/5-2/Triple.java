public class Triple{
    private static Triple triple1 = new Triple();
    private static Triple triple2 = new Triple();
    private static Triple triple3 = new Triple();
    private Triple(){
	System.out.println("It's maked.");
    }
    public static Triple getInstance(int num){
	if(num==1){
	    return triple1;
	}else if(num==2){
	    return triple2;
	}else{
	    return triple3;
	}
    }
}
