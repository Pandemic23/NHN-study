package DiceTest;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DiceCalculatorTest {
    static Stream<Arguments> diceValue() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(4, 5, 9),
                Arguments.of(6, 6, 12),
                Arguments.of(1, 1, 2),
                Arguments.of(3, 2, 5)
        );
    }

    @ParameterizedTest(name = "Dice {0} + Dice {1} = {2}")
    @MethodSource("diceValue")
    @DisplayName("DiceCalculator.addDice Param 테스트")
    void diceAddTest(int first, int second, int result) {
        Dice firstDice = new Dice(first);
        Dice secondDice = new Dice(second);

        Assertions.assertEquals(result, DiceCalculator.add(firstDice, secondDice));
    }


    @Test
    @DisplayName("DIceCalculator addDice 테스트")
    void diceAddTest() {
        Dice dice = new Dice(2);
        Assertions.assertFalse(DiceCalculator.odd(dice));

        Dice dice2 = new Dice(5);
        Assertions.assertTrue(DiceCalculator.odd(dice));
    }


    @Test
    @DisplayName("DiceCalculator.getIndexOf 테스트")
    void getIndexOfTest() {
        Dice dice = new Dice(5);
        String str = "a1b2c3d4";

        Assertions.assertEquals("a1b2c3", DiceCalculator.getIndexOf(str, dice.getNumber()));
    }

    @Test
    @DisplayName(("DiceCalculator.getIndexOf 테스트2"))
    void oddTest() {

        Dice dice = new Dice(2);
        Assertions.assertFalse(DiceCalculator.odd(dice));

        Dice dice2 = new Dice(5);
        Assertions.assertTrue(DiceCalculator.odd(dice2));
    }
}
