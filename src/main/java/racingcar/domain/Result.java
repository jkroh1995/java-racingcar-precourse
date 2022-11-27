package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Result {

    public List<String> makeWinners(Map<String, Integer> namePosition) {
        List<String> winners = new ArrayList<>();
        List<Integer> positionList = new ArrayList<>(namePosition.values());
        int maxScore = findMaxScore(positionList);
        makeWinnersList(namePosition, winners, maxScore);
        return winners;
    }

    private void makeWinnersList(Map<String, Integer> namePosition, List<String> winners, int maxScore) {
        for (String key : namePosition.keySet()) {
            Integer value = namePosition.get(key);
            if (value == maxScore) {
                winners.add(key);
            }
        }
    }

    private int findMaxScore(List<Integer> positionList) {
        int max = positionList.get(0);
        for (int index = 1; index < positionList.size(); index++) {
            if (positionList.get(index) > max) {
                max = positionList.get(index);
            }
        }
        return max;
    }
}
