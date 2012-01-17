public class Main{
    public static void main(String[] args){
	BookShelf bookShelf=new BookShelf(4);
	bookShelf.appendBook(new Book("Statistics"));
	bookShelf.appendBook(new Book("design pattern"));
	bookShelf.appendBook(new Book("An introductionto C"));
	bookShelf.appendBook(new Book("object oriented programing"));
	Iterator it = bookShelf.iterator();
	while(it.hasNext()){
	    Book book = (Book)it.next();
	    System.out.println(book.getName());
	}
    }
}
