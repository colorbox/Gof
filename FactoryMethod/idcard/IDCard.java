package idcard;
import framework.*;

public class IDCard extends Product{
    private String owner ;
    private int Booknumber;
    IDCard(String owner,int Booknumber){
	System.out.println(owner+"のカードを作ります");
	this.owner=owner;
	this.Booknumber=Booknumber;
    }
    public void use(){
	System.out.println(owner+"のカード"+Booknumber+"番を使います");
    }
    public String getOwner(){
	return owner;
    }
    public int getNumber(){
	return Booknumber;
    }
}
