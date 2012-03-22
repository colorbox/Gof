public class Main{
    public static void main(String[] args){
	String[] data={
	    "eagle","birdy","par","boogy","phantom"
	};
	SortAndPrint sap = new SortAndPrint(data,new SelectionSorter());
	sap.execute();
    }
}
