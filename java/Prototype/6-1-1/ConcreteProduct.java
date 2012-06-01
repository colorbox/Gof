

public class ConcreteProduct implements Product{
    public void use(String s){
	System.out.println("ConcreteProduct use "+s);
    }
    public Product createClone(){
	Product p = null;
	try{
	    p=(Product)clone();
	}catch(CloneNotSupportedException e){
	    e.printStackTrace();
	}
	return p;
    }
}
