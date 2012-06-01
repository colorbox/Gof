package game;
import java.util.*;
import java.io.*;

public class Gamer{
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();
    private static String[] fruitsname={
	"りんご","ぶどう","ばなな","みかん",
    };
    public Gamer(int money){
	this.money=money;
    }
    public int getMoney(){
	return money;
    }
    public void bet(){
	int dice = random.nextInt(6)+1;
	if(dice == 1){
	    money += 100;
	    System.out.println("所持金増加");
	}else if(dice == 2){
	    money /=2;
	    System.out.println("所持金半減");
	}else if(dice == 6){
	    String f = getFruit();
	    System.out.println("フルーツ("+f+")をもらいました");
	    fruits.add(f);
	}else{
	    System.out.println("何も起こらなかった。");
	}
    }
    //mementoを作成
    public Memento createMemento(){
	Memento m = new Memento(money);
	Iterator it = fruits.iterator();
	while(it.hasNext()){
	    String f = (String)it.next();
	    if(f.startsWith("おいしい")){
		m.addFruit(f);
	    }
	}

	ObjectOutputStream out = null;
	//書き込み
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("game.dat")));
            //このメソッドでファイルに直列化
            out.writeObject(m);
            out.flush();
        }catch (InvalidClassException e) {
            //(java.io.ObjectStreamExceptionのサブクラス)
            //直列化で使用されるクラスになんらかの不具合があった場合
            System.out.println("直列化に失敗 - " + e);

        }catch (NotSerializableException e) {
            //(java.io.ObjectStregameamExceptionのサブクラス)
            //直列化の対象が java.io.Serializableを実装していない場合
            System.out.println("直列化に失敗 - " + e);

        }catch (IOException e) {
            //基本となる OutputStream が例外をスローした場合
            System.out.println("直列化に失敗 - " + e);

        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {}
            }
        }
	return m;

    }
    //復元
    public void restoreMemento(){
	ObjectInputStream in = null;
	Memento memento = null;

        try {
            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("game.dat")));
            //このメソッドでファイル(とロードされているクラス)から復元
            memento = (Memento)in.readObject();
            System.out.println(memento);

        } catch (InvalidClassException e) {
            //(java.io.ObjectStreamExceptionのサブクラス)
            //クラスの直列化バージョンが、ストリームから読み込まれた
            //クラス記述子の直列化バージョンと一致しない場合
            //クラスに未知のデータ型が含まれている場合
            //クラスに、アクセス可能な引数なしのコンストラクタがない場合
            System.out.println( "復元に失敗 - " + e);

        } catch (StreamCorruptedException e) {
            //(java.io.ObjectStreamExceptionのサブクラス)
            //オブジェクトストリームから読み込まれた制御情報が、
            //内部整合性検査に違反していた場合にスローされます。
            System.out.println( "復元に失敗 - " + e);

        } catch (OptionalDataException e) {
            //(java.io.ObjectStreamExceptionのサブクラス)
            //プリミティブデータが読み込まれていないか、
            //またはデータの終わりがストリーム内の直列化オブジェクトに
            //あるため、オブジェクトの読み込み操作が失敗したことを示す例外
            System.out.println( "復元に失敗 - " + e);

        } catch (IOException e) {
            //入出力に関連した例外
            System.out.println( "復元に失敗 - " + e);

        } catch (ClassNotFoundException e) {
            //直列化されたオブジェクトのクラスが見つからなかった場合
            System.out.println( "復元に失敗 - " + e);

        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {}
            }
        }



	this.money = memento.money;
	this.fruits = memento.getFruits();

    }
    public String toString(){
	return "[money = "+money+", fruits = "+fruits+"]";
    }
    private String getFruit(){
	String prefix = "";
	if(random.nextBoolean()){
	    prefix = "おいしい";
	}
	return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}
