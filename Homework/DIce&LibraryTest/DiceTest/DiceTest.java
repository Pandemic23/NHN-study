package Day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DiceTest {
    @Test
    @DisplayName("Dicd 객체 생성 테스트")
    void diceConstructorTest() {
        Dice dice = new Dice(4);

        Assertions.assertEquals(4, dice.getNumber());
    }

    @Test
    @DisplayName("Dice 객체 생성 반복 테스트")
    void diceIteratorTest() {
        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            Dice dice = new Dice(arr[i]);

            Assertions.assertEquals(arr[i], dice.getNumber());
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
    @DisplayName("Dice 객체 Param Test")
    void diceParamTest(int number) {
        Dice dice = new Dice(number);
        Assertions.assertEquals(number, dice.getNumber());
    }

    @Test
    @DisplayName("Dicd 객체 생성 테스트 (number : -1)")
    void nagativeDiceConstructor() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Dice(-1));
    }

    @Test
    @DisplayName("Dicd 객체 생성 테스트 (number : 7)")
    void overSixDice() {
        try {
            new Dice(7);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Dice(7));
    }
}

