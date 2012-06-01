import java.io.*;

public class HTMLBuilder extends Builder{
    private String filename;
    private PrintWriter writer;
    public void buildTitle(String title){
	filename = title+".html";
	try{
	    writer = new PrintWriter(new FileWriter(filename));
	}catch(IOException e){
	    e.printStackTrace();
	}
	writer.println("<html><head><title>"+title+"</title></head><body>");
	writer.println("<h1>"+title+"</h1>");
    }
    public void buildString(String str){
	writer.println("<p>"+str+"<p>");
    }
    public void buildItems(String[] items){
	writer.println("<ul>");
	for(int i=0;i<items.length;i++){
	    writer.println("<li>"+items[i]+"</li>");
	}
	writer.println("</ul>");
    }
    public void buildDone(){
	writer.println("</body></html>");
	writer.close();
    }
    public String getResult(){
	return filename;
    }
}
