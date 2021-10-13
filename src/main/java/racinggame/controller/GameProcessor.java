package racinggame.controller;

import nextstep.utils.Console;
import racinggame.exception.WrongInputException;
import racinggame.model.Car;
import racinggame.view.Script;

public class GameProcessor {

    Car[] cars;
    int count;

    public void gameStart() {
        do {
        } while (!getCars());
        do {
        } while (!getCount());
        play();
        end();
    }

    private boolean getCars() {
        try {
            System.out.println(Script.inputCarName.getMent());
            String[] carNameArr = Console.readLine().split(",");
            int carNum = carNameArr.length;
            cars = new Car[carNum];
            for (int i = 0; i < carNum; i++) {
                cars[i] = new Car(carNameArr[i], 0);
                cars[i].checkName();
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean getCount() {
        try {
            System.out.println(Script.inputCount.getMent());
            count = Integer.parseInt(Console.readLine());
            return true;
        } catch (Exception e) {
            new WrongInputException();
            return false;
        }
    }

    private void play() {
        System.out.println();
        System.out.println(Script.playResult.getMent());

        int playCount = 0;
        do {
            moveCars();
            printCarPos();
            System.out.println();
        } while (++playCount < count);
    }

    private void moveCars() {
        for (int i = 0; i < cars.length; i++) {
            cars[i].move();
        }
    }

    private void printCarPos() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getName() + " : " + printPos(cars[i].getPos()));
        }
    }

    private String printPos(int pos) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pos; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

    private void end() {
        System.out.println("최종 우승자는 " + getWinners() + " 입니다.");
    }

    private String getWinners() {
        StringBuilder sb = new StringBuilder();
        int winPos = -1;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPos() > winPos) {
                winPos = cars[i].getPos();
                sb.setLength(0);
                sb.append(cars[i].getName());
            } else if (cars[i].getPos() == winPos) {
                sb.append(",");
                sb.append(cars[i].getName());
            }
        }
        return sb.toString();
    }
}
