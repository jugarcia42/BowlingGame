package BowlingGame;

import java.util.ArrayList;
import java.util.List;

public class Bowling {

    static int score(String game) {
        List<Integer> rollValues = getRollValues(game);
        return calculateTotalScore(rollValues);
    }

    private static List<Integer> getRollValues(String game) {
        List<Integer> rollValues = new ArrayList<>();
        String[] frames = game.split("\\|");

        for (String frame : frames) {
            addFrameRollValues(frame, rollValues);
        }

        return rollValues;
    }

    private static void addFrameRollValues(String frame, List<Integer> rollValues) {
        for (int rollIndexInFrame = 0; rollIndexInFrame < frame.length(); rollIndexInFrame++) {
            char currentRollChar = frame.charAt(rollIndexInFrame);
            char previousRollChar = (rollIndexInFrame > 0) ? frame.charAt(rollIndexInFrame - 1) : ' ';
            rollValues.add(charToValue(currentRollChar, previousRollChar));
        }
    }

    private static int charToValue(char currentRollChar, char previousRollChar) {
        if (currentRollChar == 'X') return 10;
        if (currentRollChar == '-') return 0;
        if (currentRollChar == '/') return 10 - charToValue(previousRollChar, ' ');
        return Character.getNumericValue(currentRollChar);
    }

    private static int calculateTotalScore(List<Integer> rollValues) {
        int totalScore = 0;
        int currentRollIndex = 0;

        for (int frameNumber = 0; frameNumber < 10; frameNumber++) {
            if (isStrike(rollValues, currentRollIndex)) {
                totalScore += 10 + bonusRollValue(rollValues, currentRollIndex + 1)
                        + bonusRollValue(rollValues, currentRollIndex + 2);
                currentRollIndex += 1;
            } else if (isSpare(rollValues, currentRollIndex)) {
                totalScore += 10 + bonusRollValue(rollValues, currentRollIndex + 2);
                currentRollIndex += 2;
            } else {
                totalScore += rollValues.get(currentRollIndex) + rollValues.get(currentRollIndex + 1);
                currentRollIndex += 2;
            }
        }

        return totalScore;
    }

    private static boolean isStrike(List<Integer> rollValues, int currentRollIndex) {
        return rollValues.get(currentRollIndex) == 10;
    }

    private static boolean isSpare(List<Integer> rollValues, int currentRollIndex) {
        return rollValues.get(currentRollIndex) + rollValues.get(currentRollIndex + 1) == 10;
    }

    private static int bonusRollValue(List<Integer> rollValues, int bonusRollIndex) {
        if (bonusRollIndex >= rollValues.size()) return 0;
        return rollValues.get(bonusRollIndex);
    }
}