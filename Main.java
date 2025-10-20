public class Main {
    public static car[] getCarByBrend(car[] cars, String brand) {
        int count = 0;
        for (car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                count++;
            }
        }
        car[] result = new car[count];
        int index = 0;
        for (car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                result[index] = car;
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
    car[] cars = {
        new car(1, "Toyota", "Camry", 2015, "Red", 15000, "ABC123"),
        new car(2, "Honda", "Accord", 2010, "Blue", 12000, "DEF456"),
        new car(3, "Toyota", "Corolla", 2018, "White", 18000, "GHI789"),
        new car(4, "Ford", "Focus", 2012, "Black", 9000, "JKL012"),
        new car(5, "Toyota", "Hilux", 2020, "Silver", 25000, "MNO345")
    };

    car[] toyotas = getCarByBrend(cars, "Toyota");
    System.out.println("Машины марки Toyota:");
    for (car car : toyotas) {
        System.out.println(car.getModel() + " (" + car.getRelease_year() + ")");
    }
}
}