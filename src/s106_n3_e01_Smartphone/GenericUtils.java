package s106_n3_e01_Smartphone;

public class GenericUtils {

    public static <T extends Phone> void usePhone(T phone)  {
        phone.call();
    }

    public static <T extends Smartphone> void useSmartphone(T smartphone)  {
        smartphone.call();
        smartphone.takePhoto();
    }
}
