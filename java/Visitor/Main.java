public class Main{
    public static void main(String[] args){
	try{
	    System.out.println("Making root entries...");
	    Directory rootdir = new Directory("root");
	    Directory bindir = new Directory("bin");
	    Directory tmpdir = new Directory("tmp");
	    rootdir.add(bindir);
	    rootdir.add(tmpdir);

	    
	    bindir.add(new File("unko.java",1000));
	    rootdir.add(new File("unko12.txt",1000));
	    rootdir.add(new File("unko34.txt",1000));
	    rootdir.add(new File("unko56.txt",1000));
	    tmpdir.add(new File("unko23.html",1000));
	    tmpdir.add(new File("unko45.html",1000));
	    tmpdir.add(new File("unko67.html",1000));
	    

	    System.out.println("");
	    rootdir.accept(new ListVisitor());
	    rootdir.accept(new FindFileVisitor(".java"));
	    rootdir.accept(new FindFileVisitor(".txt"));
	    rootdir.accept(new FindFileVisitor(".html"));

	    System.out.println("");
	    System.out.println(rootdir.getSize());

	    ElementArrayList list = new ElementArrayList();
	    list.add(rootdir);

	    list.accept(new ListVisitor());

		}catch(FileTreatmentException e){
	    e.printStackTrace();
	}
    }
}
