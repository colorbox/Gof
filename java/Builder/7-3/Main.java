public class Main{
    public static void main(String[] args){
	if(args.length != 1){
	    usage();
	    System.exit(0);
	}
	if(args[0].equals("plain")){
	    TextBuilder textbuilder= new TextBuilder();
	    Director director = new Director(textbuilder);
	    director.construct();
	    //String result = textbuilder.getResult();
	    //System.out.println(result);//XXX
	    System.out.println(textbuilder.getResult());
	}else if(args[0].equals("html")){
	    HTMLBuilder htmlbuilder = new HTMLBuilder();
	    Director director = new Director(htmlbuilder);
	    director.construct();
	    String filename = htmlbuilder.getResult();
	    System.out.println(filename+" has maked");
	}else if(args[0].equals("csv")){
	    CSVBuilder csvbuilder = new CSVBuilder();
	    Director director = new Director(csvbuilder);
	    director.construct();
	    String result = csvbuilder.getResult();
	    System.out.println(result);//XXX
	}else{
	    usage();
	    System.exit(0);
	}
    }
    public static void usage(){
	System.out.println("Usage: java Main plain");
	System.out.println("Usage: java Main html");
	System.out.println("Usage: java Main csv");

    }
}
