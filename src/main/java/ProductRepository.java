public class ProductRepository {

    Product[] products = new Product[0];

    //Метод сохранение продукта
    public void addProduct(Product product) {
        Product[] add = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            add[i] = products[i];
        }
        add[add.length - 1] = product;
        products = add;
    }

    //Метод вывода всех товаров
    public Product[] findAll() {
        return products;
    }

    //Метод удаление добавленного товара
    public void removeByeID(int removeId) {
        Product[] add = new Product[products.length - 1];

        int result = 0;
        for (Product product : products) {
            if (product.getId() == removeId) {
                continue;
            } else {
                add[result] = product;
                result++;
            }
        }
        products = add;
    }
}