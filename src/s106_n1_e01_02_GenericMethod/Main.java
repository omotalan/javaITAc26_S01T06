package s106_n1_e01_02_GenericMethod;

public class Main {

    public static void main(String[] args) {
        String el1 = "Elemento 1";
        String el2 = "Elemento 2";
        String el3 = "Elemento 3";

        NoGenericMethods method1 = new NoGenericMethods(el1, el2, el3);

        NoGenericMethods method2 = new NoGenericMethods(el2, el1, el3);

        System.out.println(
                method1.getElement1() + ", "
                + method1.getElement2() + ", "
                + method1.getElement3()
        );

        System.out.println(
                method2.getElement1() + ", "
                + method2.getElement2() + ", "
                + method2.getElement3()
        );
    }
}
