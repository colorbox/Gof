public class TextBuilder extends Builder{
    private String buffer = "";
    public void makeTitle(String title){
	buffer+="=====================================-\n";
	buffer+="\""+title+"\"";
	buffer+="\n";
    }
    public void makeString(String str){
	buffer+="■"+str+"\n";
	buffer+="\n";
    }
    public void makeItems(String[] items){
	for(int i=0;i<items.length;i++){
	    buffer+=" *"+items[i]+"\n";
	}
	buffer+="\n";
    }
    public void close(){
	buffer+="=====================================-\n";
    }
    public String getResult(){
	return buffer;
    }
}
