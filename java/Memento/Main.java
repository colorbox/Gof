import game.Memento;
import game.Gamer;

public class Main{
    public static void main(String[] args){
	Gamer gamer = new Gamer(100);
	Memento memento = gamer.createMemento();
	for(int i=0;i<100;i++){
	    System.out.println("==="+i);
	    System.out.println("現状:"+gamer);

	    gamer.bet();

	    System.out.println("所持金は"+ gamer.getMoney() + "円になりました。");

	    if(gamer.getMoney()>memento.getMoney()){
		System.out.println("(だいぶ増えたので、現在の状況を保存しておこう)");
		gamer.createMemento();
	    }else if(gamer.getMoney()<memento.getMoney()/2){
		System.out.println("(だいぶ減ったので、以前の状況に復帰しよう)");
		gamer.restoreMemento();
	    }

	    try{
		Thread.sleep(25);
	    }catch(InterruptedException e){
	    }
	    System.out.println();
	}
    }
}
