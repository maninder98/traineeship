package h7.Bank;

public class Person {

    private String name;
    private int age;
    private Gender gender;

    public static final int numberOfPossibleGenders = Gender.values().length;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.UNKNOWN;
    }

    public void haveBirthday() {
        if (this.age >= 130) throw new PersonDiedException();
        this.age++;
    }


    public Gender getGender() {
        return gender;

    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }



}
