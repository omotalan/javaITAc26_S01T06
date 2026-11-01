package s106_n1_e01_02_GenericMethod;

import static s106_n1_e01_02_GenericMethod.GenericMethods.printAll;
import static s106_n1_e01_02_GenericMethod.GenericMethods.printElements;

public class Main {

    public static void main(String[] args) {
        // Exercici 1
        String el1 = "Elemento 1";
        String el2 = "Elemento 2";
        String el3 = "Elemento 3";

        NoGenericMethods method1 = new NoGenericMethods(el1, el2, el3);

        NoGenericMethods method2 = new NoGenericMethods(el2, el1, el3);

        System.out.println("\n Exercici 1:");
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

        // Exercici 2
        System.out.println("\n Exercici 2:");
        Person person = new Person("Tsubasa", "Ozora", 12);
        int intUno = 30;

        printElements(person.toString(), el2, intUno);

        printElements(el2, person.toString(), intUno);

        printAll(intUno, person.toString(), el2);
    }
}
