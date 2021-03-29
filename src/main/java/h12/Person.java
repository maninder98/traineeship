package h12;

import h10.Human;
import h7.Bank.Gender;
import h7.Bank.PersonDiedException;

public class Person extends Human {

    private String name;
    private int age;
    private Gender gender;

    public static final int numberOfPossibleGenders = Gender.values().length;


    public Person(String name, int age) {
        this(name, age, Gender.UNKNOWN);
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @MyAnnotation
    public void haveBirthday() {
        if (this.age >= 130) throw new PersonDiedException();
        this.age++;
    }

    @MyAnnotation2
    public Gender getGender() {
        return gender;

    }

    @MyAnnotation
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
}
