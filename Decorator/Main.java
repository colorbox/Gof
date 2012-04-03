public class Main{
    public static void main(String[] args){
	Display d1 = new StringDisplay("Hello,World.");
	Display d2 = new SideBorder(d1,'#');
	Display d3 = new FullBorder(d2);
	d1.show();
	d2.show();
	d3.show();
	Display d4= new SideBorder( new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("bondia")),'#'))),'/');
	d4.show();
	Display d5 =new UpDownBorder(d1,'+');
	d5.show();
	MultiStringDisplay d6 =new MultiStringDisplay("otinpo");
	d6.add("unko");
	d6.add("unko2");
	d6.add("unko34");
	Display d7 = new UpDownBorder(d6,'+');
	d7.show();
	Display d8 = new FullBorder(d7);
	d8.show();
    }
}
