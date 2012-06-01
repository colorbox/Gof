import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList implements Element{
    private ArrayList arr = new ArrayList();
    public void add(Entry entry){
	arr.add(entry);
    }
    public void accept(Visitor v){
	Iterator it = arr.iterator();
	while(it.hasNext()){
	    Entry en = (Entry)it.next();
	    en.accept(v);
	}

    }
}
