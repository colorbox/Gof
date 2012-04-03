import java.util.*;

public class MultiStringDisplay extends Display{
    private ArrayList<String> StrArray=new ArrayList<String>();
    public MultiStringDisplay(String str){
	StrArray.add(str);
    }
    public void add(String str){
	StrArray.add(str);
	spaceChecker();
    }
    public int getColumns(){
	return longestString();
    }
    public int getRows(){
	return StrArray.size();
    }
    public String getRowText(int row){
	return StrArray.get(row);
    }
    private int longestString(){
	int num=0;
	for(int i=0;i<StrArray.size();i++){
	    if(num<StrArray.get(i).getBytes().length){
		num=StrArray.get(i).getBytes().length;
	    }
	}
	return num;
    }
    private String stringSpacer(String str,int SpaceNum){
	for(int i=0;i<SpaceNum;i++){
	    str+=" ";
	}
	return str;
    }
    private void spaceChecker(){
	int longnum=longestString();
	for(int i=0;i<StrArray.size();i++){
	    StrArray.set(i,stringSpacer(StrArray.get(i),longnum-StrArray.get(i).getBytes().length));
	}
    }

}
