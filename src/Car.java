public class Car extends Vehicule {
    public Car(String brand, int kilometers) {
        super(brand, kilometers);

    }
    public String doStuff() {
        return "VROOOOOOOOOOUM " + this.getBrand() + " CRRRRIIIIIIIIIIII";
    }
}