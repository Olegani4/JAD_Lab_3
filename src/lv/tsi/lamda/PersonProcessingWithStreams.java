package lv.tsi.lamda;

import java.util.ArrayList;

public class PersonProcessingWithStreams {

    public static void main(String[] args) {
        ArrayList<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(new Person("Max", 28));
        listOfPersons.add(new Person("Peter", 22));
        listOfPersons.add(new Person("Anna", 28));
        listOfPersons.add(new Person("Lilianna", 16));
        listOfPersons.add(new Person("Pamela", 13));
        listOfPersons.add(new Person("David", 22));

        PersonEvaluator persEval = new PersonEvaluator(listOfPersons);
        persEval.findAndPrint("P");
        persEval.findAndPrint(18);
        persEval.groupAndPrint(new int[]{22, 13, 16});
        System.out.println("\nAverage age: " + persEval.getAverageAge());
    }
}
