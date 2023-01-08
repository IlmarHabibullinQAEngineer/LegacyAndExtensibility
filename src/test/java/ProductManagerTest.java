import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    //Поиск товара по критериям.
    @Test
    public void searchByProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Java Эффективное программирование", 1_200, "Джошуа Блох");
        Book book2 = new Book(2, "Java Чистый код", 1_300, "Роберт Мартин");
        Book book3 = new Book(3, "Изучаем Python", 1_000, "Марк Лутц");
        Smartphone phone1 = new Smartphone(4, "Galaxy S-23", 25_000, "Samsung");
        Smartphone phone2 = new Smartphone(5, "Galaxy S-23 Ultra", 25_000, "Samsung");
        Smartphone phone3 = new Smartphone(6, "13 Pro", 45_000, "iPhone");
        Smartphone phone4 = new Smartphone(7, "13 Pro Max", 45_000, "iPhone");

        //Добавление товара через менеджер
        manager.addProduct(book1);
        manager.addProduct(book2);
        manager.addProduct(book3);
        manager.addProduct(phone1);
        manager.addProduct(phone2);
        manager.addProduct(phone3);
        manager.addProduct(phone4);


        //Проверка
        Product[] expected = {phone3, phone4};
        Product[] actual = manager.searchBy("Pro");

        Assertions.assertArrayEquals(expected, actual);
    }

    Product product = new Product(1, "Java", 1000);

    //Внесение изменений в id
    @Test
    public void changeId(){
        product.setId(2);

        Assertions.assertEquals(2, product.getId());
    }

    //Внесение изменений в name
    @Test
    public void changeName(){
        product.setName("Python");

        Assertions.assertEquals("Python", product.getName());
    }

    //Внесение изменений в price
    @Test
    public void changePrice(){
        product.setPrice(1_000);

        Assertions.assertEquals(1_000, product.getPrice());
    }

    //BOOK
    //Внесение изменений в authorBook
    Book book = new Book(1, "Java", 300, "Bloh");
    @Test
    public void changeAuthorBook(){
        book.setAuthorBook("Block");

        Assertions.assertEquals("Block", book.getAuthorBook());
    }

    //Smartphone
    //Внесение изменений в manufacturerSmartphone
    Smartphone smart = new Smartphone(1, "Galaxy S-23", 45_000, "Samsung");
    @Test
    public void changeManufacturerSmartphone(){
        smart.setManufacturerSmartphone("Sams");

        Assertions.assertEquals("Sams", smart.getManufacturerSmartphone());
    }
}