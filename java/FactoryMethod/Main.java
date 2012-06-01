import framework.*;
import idcard.*;

public class Main{
    public static void main(String[] args){
	Factory factory = new IDCardFactory();
	Product Card1 = factory.create("うんこ1");
	Product Card2 = factory.create("うんこ2");
	Product Card3 = factory.create("うんこ3");
	Card1.use();
	Card2.use();
	Card3.use();
    }
}
