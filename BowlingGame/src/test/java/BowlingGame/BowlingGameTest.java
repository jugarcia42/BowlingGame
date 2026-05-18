package BowlingGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Bowling Game")
public class BowlingGameTest {

    @Nested
    @DisplayName("Normal scores")
    class NormalScores {

        @ParameterizedTest(name = "{0} → {1}")
        @DisplayName("Simple frames without strikes or spares")
        @CsvSource({
                "'--|--|--|--|--|--|--|--|--|--',   0",
                "'1-|--|--|--|--|--|--|--|--|--',   1",
                "'11|--|--|--|--|--|--|--|--|--',   2",
                "'11|11|11|11|11|11|11|11|11|11', 20",
                "'1-|2-|3-|4-|5-|6-|7-|8-|9-|--', 45",
        })
        void normalFrames(String input, int expectedScore) {
            assertEquals(expectedScore, Bowling.score(input));
        }
    }

    @Nested
    @DisplayName("Strikes")
    class Strikes {

        @ParameterizedTest(name = "{0} → {1}")
        @DisplayName("Frames with strikes")
        @CsvSource({
                "'X|--|--|--|--|--|--|--|--|--',    10",
                "'X|11|--|--|--|--|--|--|--|--',    14",
                "'X|X|11|--|--|--|--|--|--|--',     35",
                "'X|X|X|11|--|--|--|--|--|--',      65",
        })
        void strikeFrames(String input, int expectedScore) {
            assertEquals(expectedScore, Bowling.score(input));
        }
    }

    @Nested
    @DisplayName("Spares")
    class Spares {

        @ParameterizedTest(name = "{0} → {1}")
        @DisplayName("Frames with spares")
        @CsvSource({
                "'-/|11|--|--|--|--|--|--|--|--',   13",
                "'-/|-/|11|--|--|--|--|--|--|--',   23",
                "'--|--|--|--|--|--|--|--|--|5/5',  15",
        })
        void spareFrames(String input, int expectedScore) {
            assertEquals(expectedScore, Bowling.score(input));
        }
    }

    @Nested
    @DisplayName("Mixed games")
    class MixedGames {

        @ParameterizedTest(name = "{0} → {1}")
        @DisplayName("Games combining strikes, spares and normal throws")
        @CsvSource({
                "'9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||',          90",
                "'5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5',         150",
                "'X|7/|9-|X|-8|8/|-6|X|X|X||81',              167",
                "'X|X|X|X|X|X|X|X|X|X||XX',                   300",
        })
        void mixedGames(String input, int expectedScore) {
            assertEquals(expectedScore, Bowling.score(input));
        }
    }
}