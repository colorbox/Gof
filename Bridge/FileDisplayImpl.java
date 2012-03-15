import java.io.*;

public class FileDisplayImpl extends DisplayImpl{
    private String filename;
    private FileReader in;
    public FileDisplayImpl(String filename){
	this.filename = filename;
    }
    public void rawOpen(){
	try{
	    in = new FileReader(filename);
	}catch(IOException e){
	    System.out.println(e);
	}
    }
    public void rawPrint(){
	int ch=0;
	try{
	    while((ch = in.read()) != -1){
		System.out.print((char)ch);
	    }
	}catch(IOException e){
	    System.out.println(e);
	}

    }
    public void rawClose(){
	try{
	    System.out.println();
	    in.close();
	}catch(IOException e){
	    System.out.println(e);
	}
    }
}
