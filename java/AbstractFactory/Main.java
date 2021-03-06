import factory.*;

public class Main{
    public static void main(String[] args){
	if(args.length != 1){
	    System.out.println("Usage java Main class.name.of.ConcreteFactory");
	    System.out.println("Example1:java Main listfactory.ListFactory");
	    System.out.println("Example2:java Main tablefactory.TableFactory");
	    System.exit(0);
	}
	Factory factory = Factory.getFactory(args[0]);



	/*
	Page page = factory.createYahooPage();
	page.output();
	*/

	
	Link asahi =factory.createLink("asahi","asahi link");
	Link yomiuri = factory.createLink("yomiuri","yomiuri link");

	Link us_yahoo = factory.createLink("US_Yahoo!","us_yahoo link");
	Link amazon = factory.createLink("amazon","amazon link");

	Link unko1 = factory.createLink("unko1","unko1 link");
	Link unko2 = factory.createLink("unko2","unko2 link");
	Link unko3 = factory.createLink("unko3","unko3 link");

	Tray traynews = factory.createTray("news paper");
	traynews.add(asahi);
	traynews.add(yomiuri);

	Tray trayweb = factory.createTray("web");
	trayweb.add(us_yahoo);
	trayweb.add(amazon);

	Tray trayunko = factory.createTray("unko");
	trayunko.add(unko1);
	trayunko.add(unko2);
	trayunko.add(unko3);

	Page page = factory.createPage("LinkPage","colorbox222@gmail.com");
	page.add(traynews);
	page.add(trayweb);
	page.add(trayunko);
	page.output();
	
    }
}
