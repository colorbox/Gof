public class Main{
    public static void main(String[] args){
	System.out.println("Start.");
	Triple obj11 = Triple.getInstance(1);
	Triple obj21 = Triple.getInstance(2);
	Triple obj31 = Triple.getInstance(3);
	Triple obj12 = Triple.getInstance(1);
	Triple obj22 = Triple.getInstance(2);
	Triple obj32 = Triple.getInstance(3);
	if(obj11==obj12){System.out.println("11=12");}
	if(obj11==obj22){System.out.println("11=22");}
	if(obj11==obj32){System.out.println("11=32");}
	if(obj21==obj12){System.out.println("21=12");}
	if(obj21==obj22){System.out.println("21=22");}
	if(obj21==obj32){System.out.println("21=32");}
	if(obj31==obj12){System.out.println("31=12");}
	if(obj31==obj22){System.out.println("31=22");}
	if(obj31==obj32){System.out.println("31=32");}
	System.out.println("End.");
    }
}
