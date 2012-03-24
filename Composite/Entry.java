public abstract class Entry{
    public abstract String getName();
    public abstract int getSize();
    public abstract Entry getParent();
    public abstract void setParent(Entry parent);
    public Entry add(Entry entry)throws FileTreatmentException{
	throw new FileTreatmentException();
    }
    public String printWorkingDirectory(){
	if(getParent()!=null){
	    return getParent().printWorkingDirectory()+"/" + getName();
	}else{
	    return "/" + getName();
	}
    }

    protected abstract void printList(String prefix);

    public String toString(){
	return getName()+"("+getSize()+")";
    }
}
