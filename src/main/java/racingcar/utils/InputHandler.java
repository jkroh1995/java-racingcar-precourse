package racingcar.utils;

import racingcar.utils.validators.NamesValidator;
import racingcar.utils.validators.RoundsValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class InputHandler {

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public String[] getNames(){
        try{
            String names = inputView.readNames();
            new NamesValidator(names);
            return names.split(",");
        }catch (IllegalArgumentException e){
            outputView.printError(e.getMessage());
            return getNames();
        }
    }

    public int getRounds() {
        try{
            String rounds = inputView.readRounds();
            new RoundsValidator(rounds);
            return Integer.parseInt(rounds);
        }catch (IllegalArgumentException e){
            outputView.printError(e.getMessage());
            return getRounds();
        }
    }
}
