package lv.tsi.lamda;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonEvaluator {
    private ArrayList<Person> persons = new ArrayList<>();


    public PersonEvaluator(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public void findAndPrint(String startsWith) {
        System.out.print("Names starting from '" + startsWith + "': ");
        persons.stream()
                .filter(name -> name.getName().startsWith(startsWith))
                .forEach(name -> System.out.print(name.getName() + "; "));
    }

    public void findAndPrint(int ageMoreThan) {
        System.out.print("\nNames of people older than " + ageMoreThan + " years: ");
        persons.stream()
                .filter(name -> name.getAge() > ageMoreThan)
                .forEach(name -> System.out.print(name.getName() + "; "));
    }

    public void groupAndPrint(int[] ages) {
        Arrays.sort(ages);
        for (int i = 0; i < ages.length; i++) {
            System.out.print("\n" + (i + 1) + ". Age " + ages[i] + ": ");
            int finalI = i;
            persons.stream()
                    .filter(name -> name.getAge() == ages[finalI])
                    .forEach(name -> System.out.print(name.getName() + "; "));
        }
    }

    public double getAverageAge() {
        double averageAge = 0;
        for (int i = 0; i < persons.size(); i++) {
            averageAge += persons.get(i).getAge();
        }
        averageAge /= persons.size();
        return averageAge;
    }
}
