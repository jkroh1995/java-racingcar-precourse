package racingcar.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Result;
import racingcar.utils.InputHandler;
import racingcar.view.OutputView;

public class GameController {

    InputHandler inputHandler = new InputHandler();
    OutputView outputView = new OutputView();
    Cars cars = new Cars();
    Result result = new Result();

    public void run() {
        List<Car> carList = getCars();
        int round = inputHandler.getRounds();
        alertGameResult(carList, round);
        alertWinners(carList);
    }

    private List<Car> getCars() {
        String[] names = inputHandler.getNames();
        return cars.getCars(names);
    }

    private void alertWinners(List<Car> carList) {
        Map<String, Integer> namePosition = cars.makeNamePositionMap(carList);
        List<String> winners = result.makeWinners(namePosition);
        outputView.printWinners(winners);
    }

    private void alertGameResult(List<Car> carList, int round) {
        outputView.printResultMessage();
        for (int i = 0; i < round; i++) {
            doMove(carList);
            outputView.printResult(carList);
        }
    }

    private void doMove(List<Car> carList) {
        for (int carNum = 0; carNum < carList.size(); carNum++){
            carList.get(carNum).move();
        }
    }
}
