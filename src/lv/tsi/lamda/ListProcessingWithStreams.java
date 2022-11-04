package lv.tsi.lamda;

import java.util.ArrayList;
import java.util.Arrays;

public class ListProcessingWithStreams {

    public static void main(String[] args) {
        ArrayList<String> elemList = new ArrayList<>(Arrays.asList("a1", "c3", "a2", "a3", "b3",
                "b2", "c1", "c2", "b1"));
        System.out.println("The first element: " + elemList.get(0));


        elemList.replaceAll(String::toUpperCase);
        System.out.print("Elements with upper-case: ");
        elemList.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
        elemList.replaceAll(String::toLowerCase);


        System.out.print("\nElements starts with 'b': ");
        elemList.stream()
                .filter(name -> name.startsWith("b"))
                .forEach(name -> System.out.print(name + " "));


        System.out.print("\nSorted elements in upper-case which start with 'c': ");
        elemList.stream()
                .filter(name -> name.startsWith("c"))
                .map(name -> name.toUpperCase())
                .sorted()
                .forEach(name -> System.out.print(name + " "));
    }
}
