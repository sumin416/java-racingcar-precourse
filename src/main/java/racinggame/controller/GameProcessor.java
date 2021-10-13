package racinggame.controller;

import nextstep.utils.Console;
import racinggame.model.Car;
import racinggame.view.Script;

public class GameProcessor {

    Car[] cars;
    int count;

    public void gameStart() {
        System.out.println(Script.inputCarName.getMent());
        getCars();
        System.out.println(Script.inputCount.getMent());
        getCount();
    }

    private void getCars() {
        String[] carNameArr = Console.readLine().split(",");
        int carNum = carNameArr.length;
        cars = new Car[carNum];
        for (int i = 0; i < carNum; i++) {
            cars[i] = new Car(carNameArr[i], 0);
        }
    }

    private void getCount() {
        count = Integer.parseInt(Console.readLine());
    }

}
