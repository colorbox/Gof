public class InsertSorter implements Sorter{
    public void sort(Comparable[] data){
	for(int i=0;i<data.length -1;i++){
	    for(int j=0;j<data.length -1;j++){
		if(data[j].compareTo(data[j+1])>0){
		    change(data,j,j+1);
		}
	    }
	}
    }

    //change two element
    private void change(Comparable[] data,int left,int right){
	Comparable temp = data[left];
	data[left]=data[right];
	data[right]=temp;
    }
}
