package racinggame.model;

import nextstep.utils.Randoms;

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
