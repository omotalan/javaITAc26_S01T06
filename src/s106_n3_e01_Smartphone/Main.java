package s106_n3_e01_Smartphone;

public class Main {

    public static void main(String[] args) {
        Smartphone smarty = new Smartphone();
        Landline oldie = new Landline();

        System.out.println("--- Calling usePhone from Smartphone instance ---");
        GenericUtils.usePhone(smarty);

        System.out.println("\n--- Calling useSmartphone ---");
        GenericUtils.useSmartphone(smarty);

        //System.out.println("--- Calling useSmartphone from Landline instance ---");
        //System.out.println("(IT WILL NOT WORK - 'inference variable T has incompatible bounds')");
        //GenericUtils.useSmartphone(oldie);
    }

}
