public class Boat extends Vehicule {
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);

    }
    public String doStuff() {
        return "BOOOOBOBOBOBOAAAAT " + this.getBrand() + " " + "je dis ce que je veux car je suis un bateau et les bateaux c'est libre";
    }
}