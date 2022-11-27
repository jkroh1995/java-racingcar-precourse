package racingcar.view;

import java.util.List;
import racingcar.domain.Car;

public class OutputView {

    private static final String RESULT_MESSAGE = "실행 결과";

    public void printError(String message) {
        System.out.println(message);
    }

    public void printResultMessage() {
        System.out.println(RESULT_MESSAGE);
    }

    public void printResult(List<Car> carList) {
        String position = "-";
        for(int i=0;i<carList.size();i++){
            System.out.print(carList.get(i).getName() + " : " );
            printMove(carList, position, i);
            System.out.println();
        }
        System.out.println();
    }

    private void printMove(List<Car> carList, String position, int i) {
        for(int j = 0; j< carList.get(i).getPosition(); j++){
            System.out.print(position);
        }
    }

    public void printWinners(List<String> winners) {
        System.out.print("최종 우승자 : ");
        StringBuilder winnersName = new StringBuilder();
        for(int i=0;i<winners.size();i++){
            winnersName.append(winners.get(i)).append(", ");
        }
        System.out.println(winnersName.substring(0, winnersName.length()-2));
    }
}
