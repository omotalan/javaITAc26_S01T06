package s106_n3_e01_Smartphone;

public class Smartphone implements Phone {

    public Smartphone() {
    }

    @Override
    public void call() {
        System.out.println("Making a phone call from the smartphone...");
    }

    public void takePhoto() {
        System.out.println("Taking a photo with the smartphone camera!");
    }
}
