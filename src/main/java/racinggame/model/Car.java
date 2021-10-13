package racinggame.model;

import nextstep.utils.Randoms;
import racinggame.exception.WrongInputException;

public class Car {
    private String name;
    private int pos;

    public Car(String name, int pos) {
        this.name = name;
        this.pos = pos;
    }

    public void move() {
        if (Randoms.pickNumberInRange(0, 9) >= 4) {
            ++pos;
        }
    }

    public void checkName() throws WrongInputException {
        if (name.length() > 5) throw new WrongInputException();
    }

    public String getName() {
        return name;
    }

    public int getPos() {
        return pos;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", pos=" + pos +
                '}';
    }
}
