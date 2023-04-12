package qsn.q10;

import java.util.ArrayList;
import java.util.List;

public class q10 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        Operation<Person> operation = (person -> {
            if (person.getAge() < 25) {
                person.setEligibleForDiscount(true);
            }
            return person;
        });

        List<Person> updatedPeople = people.stream()
                .map(operation::perform)
                .toList();

        System.out.println(updatedPeople);
        // [Person{name='Alice', age=25, eligibleForDiscount=false},
        // Person{name='Bob', age=30, eligibleForDiscount=false},
        // Person{name='Charlie', age=20, eligibleForDiscount=true}]
    }
}

interface Operation<T> {
    T perform(T t);
}

class Person {
    private String name;
    private int age;
    private boolean eligibleForDiscount;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isEligibleForDiscount() {
        return eligibleForDiscount;
    }

    public void setEligibleForDiscount(boolean eligibleForDiscount) {
        this.eligibleForDiscount = eligibleForDiscount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eligibleForDiscount=" + eligibleForDiscount +
                '}';
    }
}
