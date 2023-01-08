public class Book extends Product {

    //Переменные
    private String authorBook;

    //Метод заполнения данных
    public Book(int id, String name, int price, String authorBook) {
        super(id, name, price);
        this.authorBook = authorBook;
    }

    //Getter Setter для authorBook
    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }
}
