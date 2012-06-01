import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Iterator;

public class FindFileVisitor extends Visitor{
    String extension;
    Pattern p ;
    Matcher m ;

    public FindFileVisitor(String extension){
	this.extension=extension;
	p=Pattern.compile("."+extension);
	System.out.println(extension);
    }
    public void visit(File file){
	m=p.matcher("^*"+file+"$");
	if(m.find()){
	    System.out.println(file);
	}
    }
    public void visit(Directory directory){
	Iterator it= directory.iterator();
	while(it.hasNext()){
	    Entry entry =(Entry)it.next();
	    entry.accept(this);
	}

    }

}

