package racinggame.controller;

import nextstep.utils.Console;
import racinggame.model.Car;
import racinggame.view.Script;

public class GameProcessor {

    Car[] cars;

    public void gameStart() {
        System.out.println(Script.inputCarName.getMent());
        getCars();
    }

    private void getCars() {
        String[] carNameArr = Console.readLine().split(",");
        int carNum = carNameArr.length;
        cars = new Car[carNum];
        for (int i = 0; i < carNum; i++) {
            cars[i] = new Car(carNameArr[i], 0);
        }
    }

}
