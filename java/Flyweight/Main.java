public class Main{
    private static BigString[] TestString = new BigString[10000];
    public static void main(String[] args){
	if(args.length == 0){
	    System.out.println("Usage  :java Main digits");
	    System.out.println("Example:java Main 123456");
	}

	//BigString bs = new BigString(args[0],true);
	//bs.print();

	showTest();

	System.out.println("共有する");
	testForAll(args[0],true);
	System.out.println("共有しない");
	testForAll(args[0],false);

    }

    //配列1000個を確保
    private static void testForAll(String String,boolean shared){
	for(int i=0;i<TestString.length;i++){
	    TestString[i]=new BigString("1234567890",shared);
	}
	showTest();
    }

    //メモリ消費量を表示
    private static void showTest(){
	Runtime.getRuntime().gc();
	long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	System.out.println("使用メモリー = "+used);
    }
}
