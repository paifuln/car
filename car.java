public class car{
    private int id;
    private String brand;
    private String model;
    private int release_year;
    private String color;
    private int price;
    private int register_number;

    public car(int id, String brand, String model, int release_year, String color, int price, int register_number){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.release_year = release_year;
        this.color = color;
        this.price = price;
        this.register_number = register_number;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getRelease_year() {
        return release_year;
    }
    public void setRelease_year(String release_year) {
        this.release_year = release_year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getRegister_number() {
        return register_number;
    }
    public void setRegister_number(String register_number) {
        this.register_number = register_number;
    }
}