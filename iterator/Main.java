public class Main{
    public static void main(String[] args){
	BookShelf bookShelf=new BookShelf();
	bookShelf.appendBook(new Book("Statistics"));
	bookShelf.appendBook(new Book("design pattern"));
	bookShelf.appendBook(new Book("An introductionto C"));
	bookShelf.appendBook(new Book("object oriented programing"));
	bookShelf.appendBook(new Book("q"));
	bookShelf.appendBook(new Book("w"));
	bookShelf.appendBook(new Book("e"));
	bookShelf.appendBook(new Book("r"));
	bookShelf.appendBook(new Book("t"));
	bookShelf.appendBook(new Book("y"));
	Iterator it = bookShelf.iterator();
	while(it.hasNext()){
	    Book book = (Book)it.next();
	    System.out.println(book.getName());
	}
    }
}
