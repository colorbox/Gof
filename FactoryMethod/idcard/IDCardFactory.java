package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory{
    private int Totalbooks=0;
    private List owners = new ArrayList<IDCard>();
    protected Product createProduct(String owner){
	Totalbooks++;
	return new IDCard(owner,Totalbooks);
    }
    protected void registerProduct(Product product){
	owners.add( ((IDCard)product).getOwner() );
    }
    public List getOwners(){
	return owners;
    }
    public int getTotal(){
	return Totalbooks;
    }
}
