package racingcar.utils.validators;

public class RoundsValidator {

    private static final String ERROR_BLANK = "[ERROR] 이름을 입력해야 합니다.";
    private static final String ERROR_TYPE = "[ERROR] 횟수는 정수로만 입력해야 합니다.";
    private static final String ERROR_RANGE = "[ERROR] 횟수는 1회 이상이어야 합니다.";

    String rounds;

    public RoundsValidator(String rounds) {
        this.rounds = rounds;
        validate(rounds);
    }

    public void validate(String rounds){
        validateBlank(rounds);
        validteType(rounds);
        validateRange(rounds);
    }

    private void validateRange(String rounds) {
        int input = Integer.parseInt(rounds);
        if(input<1){
            throw new IllegalArgumentException(ERROR_RANGE);
        }
    }

    private void validteType(String rounds) {
        try{
            Integer.parseInt(rounds);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException(ERROR_TYPE);
        }
    }

    private void validateBlank(String rounds) {
        if(rounds.equals("")){
            throw new IllegalArgumentException(ERROR_BLANK);
        }
    }


}
