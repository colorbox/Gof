import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry{
    private String name;
    private ArrayList directory = new ArrayList();
    private Entry parent;
    public Directory(String name){
	this.name=name;
    }
    public String getName(){
	return name;
    }
    public Entry getParent(){
	return parent;
    }
    public void setParent(Entry parent){
	this.parent=parent;
    }
    public int getSize(){
	int size = 0;
	Iterator it = directory.iterator();
	while(it.hasNext()){
	    Entry entry = (Entry)it.next();
	    size += entry.getSize();
	}
	return size;
    }
    public Entry add(Entry entry){
	directory.add(entry);
	entry.setParent((Entry)this);
	return this;
    }
    protected void printList(String prefix){
	System.out.println(prefix+"/"+this);
	Iterator it = directory.iterator();
	while(it.hasNext()){
	    Entry entry = (Entry)it.next();
	    entry.printList(prefix + "/" + name);
	}
    }
}
