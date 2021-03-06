import java.util.HashMap;

public class BigCharFactory{
    private HashMap pool = new HashMap();
    private static BigCharFactory singleton = new BigCharFactory();
    private BigCharFactory(){}
    public static BigCharFactory getInstance(){
	return singleton;
    }
    public synchronized BigChar getBigChar(char charname){
	BigChar bc = (BigChar)pool.get(charname);//XXXX
	if(bc == null){
	    bc = new BigChar(charname);
	    pool.put(""+charname,bc);
	}
	return bc;
    }
    public static void main(String[] args){
	for(int j=0;j<10;j++){
	    for(int k=0;k<10;k++){
		System.out.print(args[0]);
	    }
	    System.out.println();
	}
    }

}
