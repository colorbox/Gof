import java.io.*;
import java.util.Properties;



public class FileProperties implements FileIO{
    private FileInputStream in;
    private FileOutputStream out;
    private Properties conf;

    FileProperties(){
	conf= new Properties();	
    }

    public void readFromFile(String filename)throws IOException{
	in = new FileInputStream("file.txt");
	conf.load(in);
    }

    public void writeToFile(String filename)throws IOException{
	out = new FileOutputStream("newfile.txt");
	conf.store(out,"test");
    }

    public void setValue(String key,String value){
	conf.setProperty(key,value);
    }

    public String getValue(String key){
	return "tinko";
    }

    
}
