package homework.task1;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static homework.ComplexExamples.RAW_DATA;
import static homework.ComplexExamples.Person;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Raw data:");
        System.out.println();

        for (Person person : RAW_DATA) {
            System.out.println(person.getId() + " - " + person.getName());
        }

        System.out.println();
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Duplicate filtered, grouped by name, sorted by name and id:");
        System.out.println();

         Map<String, Long> personMap = Arrays.stream(RAW_DATA)
                 .distinct()
                 .collect(Collectors.groupingBy(Person::getName, Collectors.counting()));

        for (Map.Entry<String, Long> entry : personMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "\n" + "Value: " + entry.getValue());
        }



    }
}
