package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String PRINT_ROUNDS = "시도할 회수는 몇회인가요?";
    private static final String PRINT_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public String readNames(){
        System.out.println(PRINT_NAMES);
        return Console.readLine();
    }

    public String readRounds() {
        System.out.println(PRINT_ROUNDS);
        return Console.readLine();
    }
}
