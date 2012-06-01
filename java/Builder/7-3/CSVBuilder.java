public class CSVBuilder extends Builder{
    private StringBuffer buffer = new StringBuffer();
    public void makeTitle(String title){
	buffer.append(title+",");
	buffer.append("\n");
    }
    public void makeString(String str){
	buffer.append(str+",");
    }
    public void makeItems(String[] items){
	for(int i=0;i<items.length;i++){
	    buffer.append(items[i]+",");
	}
	buffer.append("\n");
    }
    public void close(){
    }
    public String getResult(){
	return buffer.toString();
    }
}
