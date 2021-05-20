package h11;

import h10.Human;
import h7.Bank.Gender;
import h7.Bank.PersonDiedException;

import java.util.ArrayList;

public class Person extends Human {

    private String name;
    private int age;
    private Gender gender;
    private ArrayList<HistoryRecord> historyRecords = new ArrayList<HistoryRecord>();

    public static final int numberOfPossibleGenders = Gender.values().length;


    public Person(String name, int age) {
        this(name, age, Gender.UNKNOWN);
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void haveBirthday() {
        if (this.age >= 130) throw new PersonDiedException();
        this.age++;
    }


    public Gender getGender() {
        return gender;

    }

    public String getName() {
        return name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return name + "(" + age + ")" + " is " + gender;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return this.age == person.getAge() &&
                this.name.equals(person.getName()) &&
                this.gender == person.gender;
    }

    @Override
    public int hashCode() {
        return this.age * name.hashCode() * gender.hashCode();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("method finalize is called.");
    }

    public String greet() {
        return " Hello, my name is " + this.name + ". Nice to meet you!.";
    }

    //H11

    public void addHistory(String descr) {
        historyRecords.add(new HistoryRecord(descr));

    }

    public void printHistory() {
        for (int i = 0; i < historyRecords.size(); i++) {
            System.out.println(historyRecords.get(i));
        }

    }

    public Human createSubHuman() {
        return new Human() {
            @Override
            public String greet() {
                return "Sub is the best.";
            }
        };
    }


    private class HistoryRecord {
        String description;

        public HistoryRecord(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }


}
