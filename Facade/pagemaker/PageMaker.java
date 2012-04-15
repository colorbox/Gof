package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.*;

public class PageMaker{
    private PageMaker(){}
    public static void makeWelcomePage(String mailaddr,String filename){
	try{
	    Properties mailprop = Database.getProperties("maildata");
	    String username=mailprop.getProperty(mailaddr);
	    HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
	    writer.title("Welcome to "+username+"'s page!");
	    writer.paragraph(username+"のページへようこそ。");
	    writer.paragraph("I'm waiting your mail.");
	    writer.mailto(mailaddr,username);
	    writer.close();
	    System.out.println(filename+" is created for "+mailaddr+"("+username+")");
	}catch(IOException e){
	    e.printStackTrace();
	}
    }
    public static void makeLinkPage(String filename){
	try{
	    Properties mailprop = Database.getProperties("maildata");
	    System.out.println(mailprop.getProperty("unko"));
	    HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
	    Set states = mailprop.keySet();
	    Iterator it = states.iterator();
	    String username;
	    String mailaddr;
	    writer.title("Link Page");
	    while(it.hasNext()){
		mailaddr=(String)it.next();
		username=mailprop.getProperty(mailaddr);
		//System.out.println(mailaddr+","+username);
		writer.mailto(mailaddr,username);
	    }
	    
	    writer.close();
	    System.out.println(filename+" is created.");
	}catch(IOException e){
	    e.printStackTrace();
	}
    }
}
