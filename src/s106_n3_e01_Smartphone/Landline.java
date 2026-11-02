package s106_n3_e01_Smartphone;

public class Landline implements Phone {

    @Override
    public void call() {
        System.out.println("Calling from an old landline...");
    }
}
