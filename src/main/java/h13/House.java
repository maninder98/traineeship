package h13;

import h10.Human;

public class House<T extends Human> {

    private T houseOwner;

    public House(T owner) {
        this.houseOwner = owner;
    }

    @Override
    public String toString() {
        return "This house is owned by [" + houseOwner + "] and it says [" + houseOwner.greet() + "].";
    }
}
