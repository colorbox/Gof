public class File extends Entry{
    private String name;
    private int size;
    private Entry parent;
    public File(String name, int size){
	this.name=name;
	this.size=size;
    }
    public Entry getParent(){
	return parent;
    }
    public String getName(){
	return name;
    }
    public int getSize(){
	return size;
    }
    public void setParent(Entry parent){
	this.parent=(Entry)parent;
    }
    protected void printList(String prefix){
	System.out.println(prefix+"/"+this);
    }
}
