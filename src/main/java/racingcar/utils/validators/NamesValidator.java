package racingcar.utils.validators;

public class NamesValidator {

    private static final String ERROR_DIVIDE = "[ERROR] 이름을 ','로 분류해주세요";
    private static final String ERROR_BLANK = "[ERROR] 이름을 입력해야 합니다.";
    private static final String ERROR_LENGTH = "[ERROR] 이름은 5글자 이하여야 합니다.";

    String names;

    public NamesValidator(String names){
        this.names = names;
        validate(names);
    }

    private void validate(String names) {
        validateBlank(names);
        validateDivide(names);
        validateLength(names);
    }

    private void validateLength(String names) {
        String[] tmpArray = names.split(",");
        for(int i=0;i<tmpArray.length;i++){
            if(tmpArray[i].length()>5){
                throw new IllegalArgumentException(ERROR_LENGTH);
            }
        }
    }

    private void validateDivide(String names) {
        String[] tmpArray = names.split(",");
        if (countChar(names, ',')+1 != tmpArray.length) {
            throw new IllegalArgumentException(ERROR_DIVIDE);
        }
    }

    private void validateBlank(String names) {
        if(names.equals("")){
            throw new IllegalArgumentException(ERROR_BLANK);
        }
    }

    private static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
