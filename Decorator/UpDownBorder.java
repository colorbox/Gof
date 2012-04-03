public class UpDownBorder extends Border{
    private char BorderChar;
    public UpDownBorder(Display display,char ch){
	super(display);
	this.BorderChar=ch;
    }
    public int getColumns(){
	return display.getColumns();
    }
    public int getRows(){
	return 2+display.getRows();
    }
    public String getRowText(int row){
	if(row==0||row==display.getRows()+1){
	    return makeLine();
	}else{
	    return display.getRowText(row-1);
	}
    }
    private String makeLine(){
	StringBuffer buf =new StringBuffer();
	for(int i=0;i<this.getColumns();i++){
	    buf.append(BorderChar);
	}
	return buf.toString();
    }
    
}

