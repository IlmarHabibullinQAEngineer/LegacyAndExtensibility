import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    //Сохранение
    //Сохранение одного продукта.
    @Test
    public void addOneProductInRepository() {
        ProductRepository repo = new ProductRepository();
        Book book1 = new Book(1, "Harry Potter1", 1_200, "RowLings");

        //Добавление
        repo.addProduct(book1);

        //Проверка
        Product[] expected = {book1};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    //Сохранение нескольких продуктов.
    @Test
    public void addThreeProductInRepository() {
        ProductRepository repo = new ProductRepository();
        Book book1 = new Book(1, "Harry Potter1", 1_200, "RowLings");
        Book book2 = new Book(2, "Harry Potter2", 1_300, "RowLings");
        Smartphone phone1 = new Smartphone(3, "A-10", 25_000, "Samsung");

        //Добавление
        repo.addProduct(book1);
        repo.addProduct(book2);
        repo.addProduct(phone1);

        //Проверка
        Product[] expected = {book1, book2, phone1};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    //Удаление товаров, граничные значения.
    //Удаление одного товара в середине.
    @Test
    public void removeOneCenterProductInRepository() {
        ProductRepository repo = new ProductRepository();
        Book book1 = new Book(1, "Harry Potter1", 1_200, "RowLings");
        Book book2 = new Book(2, "Harry Potter2", 1_300, "RowLings");
        Smartphone phone1 = new Smartphone(3, "A-10", 25_000, "Samsung");

        //Добавление
        repo.addProduct(book1);
        repo.addProduct(book2);
        repo.addProduct(phone1);

        //Удаление
        repo.removeByeID(2);

        //Проверка
        Product[] expected = {book1, phone1};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    //Удаление граничных значений в начале 1-2.
    //Удаление граничных значений в начале id-1.
    @Test
    public void removeOneProductInRepository() {
        ProductRepository repo = new ProductRepository();
        Book book1 = new Book(1, "Harry Potter1", 1_200, "RowLings");
        Book book2 = new Book(2, "Harry Potter2", 1_300, "RowLings");
        Smartphone phone1 = new Smartphone(3, "A-10", 25_000, "Samsung");
        Smartphone phone2 = new Smartphone(4, "12", 45_000, "iPhone");

        //Добавление
        repo.addProduct(book1);
        repo.addProduct(book2);
        repo.addProduct(phone1);
        repo.addProduct(phone2);

        //Удаление
        repo.removeByeID(1);

        //Проверка
        Product[] expected = {book2, phone1, phone2};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    //Удаление граничных значений в начале id-2.
    @Test
    public void removeTwoProductInRepository() {
        ProductRepository repo = new ProductRepository();
        Book book1 = new Book(1, "Harry Potter1", 1_200, "RowLings");
        Book book2 = new Book(2, "Harry Potter2", 1_300, "RowLings");
        Smartphone phone1 = new Smartphone(3, "A-10", 25_000, "Samsung");
        Smartphone phone2 = new Smartphone(4, "12", 45_000, "iPhone");

        //Добавление
        repo.addProduct(book1);
        repo.addProduct(book2);
        repo.addProduct(phone1);
        repo.addProduct(phone2);

        //Удаление
        repo.removeByeID(2);

        //Проверка
        Product[] expected = {book1, phone1, phone2};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    //Удаление граничных значений в конце
    //Удаление граничных значений в конце id-3.
    @Test
    public void removeThreeProductInRepository() {
        ProductRepository repo = new ProductRepository();
        Book book1 = new Book(1, "Harry Potter1", 1_200, "RowLings");
        Book book2 = new Book(2, "Harry Potter2", 1_300, "RowLings");
        Smartphone phone1 = new Smartphone(3, "A-10", 25_000, "Samsung");
        Smartphone phone2 = new Smartphone(4, "12", 45_000, "iPhone");

        //Добавление
        repo.addProduct(book1);
        repo.addProduct(book2);
        repo.addProduct(phone1);
        repo.addProduct(phone2);

        //Удаление
        repo.removeByeID(3);

        //Проверка
        Product[] expected = {book1, book2, phone2};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    //Удаление граничных значений в конце id-4.
    @Test
    public void removeForProductInRepository() {
        ProductRepository repo = new ProductRepository();
        Book book1 = new Book(1, "Harry Potter1", 1_200, "RowLings");
        Book book2 = new Book(2, "Harry Potter2", 1_300, "RowLings");
        Smartphone phone1 = new Smartphone(3, "A-10", 25_000, "Samsung");
        Smartphone phone2 = new Smartphone(4, "12", 45_000, "iPhone");

        //Добавление
        repo.addProduct(book1);
        repo.addProduct(book2);
        repo.addProduct(phone1);
        repo.addProduct(phone2);

        //Удаление
        repo.removeByeID(4);

        //Проверка
        Product[] expected = {book1, book2, phone1};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    //Вывод всех товаров
    @Test
    public void showAllProduct() {
        ProductRepository repo = new ProductRepository();
        Book book1 = new Book(1, "Harry Potter1", 1_200, "RowLings");
        Book book2 = new Book(2, "Harry Potter2", 1_300, "RowLings");
        Smartphone phone1 = new Smartphone(3, "A-10", 25_000, "Samsung");
        Smartphone phone2 = new Smartphone(4, "12", 45_000, "iPhone");

        repo.addProduct(book1);
        repo.addProduct(book2);
        repo.addProduct(phone1);
        repo.addProduct(phone2);

        Product[] expected = {book1, book2, phone1, phone2};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}