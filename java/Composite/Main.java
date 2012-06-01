public class Main{
    public static void main(String[] args){
	try{
	    System.out.println("Making root entries...");
	    Directory rootdir = new Directory("root");
	    Directory bindir = new Directory("bin");
	    Directory tempdir = new Directory("temp");
	    rootdir.add(bindir);
	    rootdir.add(tempdir);
	    File test = new File("test",10);
	    File test2 = new File("test",100);
	    File config = new File("config",1000);
	    bindir.add(test);
	    tempdir.add(test2);
	    rootdir.add(config);
	    rootdir.printList("");

	    System.out.println(rootdir.printWorkingDirectory());
	    System.out.println(bindir.printWorkingDirectory());
	    System.out.println(tempdir.printWorkingDirectory());
	    System.out.println(test.printWorkingDirectory());
	    
	}catch(FileTreatmentException e){
	    e.printStackTrace();
	}
    }
}
