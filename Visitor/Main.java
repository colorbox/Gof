public class Main{
    public static void main(String[] args){
	try{
	    System.out.println("Making root entries...");
	    Directory rootdir = new Directory("root");
	    Directory bindir = new Directory("bin");
	    Directory tmpdir = new Directory("tmp");
	    rootdir.add(bindir);
	    rootdir.add(tmpdir);
	    bindir.add(new File("unko",1000));
	    rootdir.add(new File("unko12",1200));
	    tmpdir.add(new File("unko23",2300));

	    System.out.println("");
	    rootdir.accept(new ListVisitor());
	}catch(FileTreatmentException e){
	    e.printStackTrace();
	}
    }
}
