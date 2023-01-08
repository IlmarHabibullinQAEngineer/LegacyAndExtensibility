public class Smartphone extends Product {

    //Переменные
    private String manufacturerSmartphone;

    //Метод заполнения данных
    public Smartphone(int id, String name, int price, String manufacturerSmartphone) {
        super(id, name, price);
        this.manufacturerSmartphone = manufacturerSmartphone;
    }

    //Getter Setter для manufacturerSmartphone
    public String getManufacturerSmartphone() {
        return manufacturerSmartphone;
    }

    public void setManufacturerSmartphone(String manufacturerSmartphone) {
        this.manufacturerSmartphone = manufacturerSmartphone;
    }
}
