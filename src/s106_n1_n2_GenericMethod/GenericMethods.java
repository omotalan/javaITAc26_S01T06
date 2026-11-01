package s106_n1_n2_GenericMethod;

public class GenericMethods {

    public static <String, U, V> void printElements(String el1, U el2, V el3) {
        System.out.println("Element 1: " + el1);
        System.out.println("Element 2: " + el2);
        System.out.println("Element 3: " + el3);
        System.out.println("----------------------------------------");
    }

    @SafeVarargs
    public static <T> void printAll(T... items) {
        int counter = 0;
        for (T item : items) {
            counter++;
            System.out.println("Element" + counter + " : " + item);
        }
        System.out.println("----------------------------------------");
    }
}
