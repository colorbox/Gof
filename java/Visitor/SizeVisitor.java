import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Iterator;

public class SizeVisitor extends Visitor{
    int size=0;
    public SizeVisitor(){
    }
    public void visit(File file){
	size+=file.getSize();
    }
    public void visit(Directory directory){
	Iterator it = directory.iterator();
	while(it.hasNext()){
	    Entry entry =(Entry)it.next();
	    entry.accept(this);
	}
    }
    int getSize(){
	return size;
    }
}

