package s106_n1_e01_02_GenericMethod;

public class GenericMethods {

    public static <T, U, V> void printElements(T el1, U el2, V el3) {
        System.out.println("Element 1: " + el1);
        System.out.println("Element 2: " + el2);
        System.out.println("Element 3: " + el3);
        System.out.println("----------------------------------------");
    }
}
