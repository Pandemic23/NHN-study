package Day3;

public class Dice {
    private int number;

    public Dice(int number) {
        this.number = number;
        if (number <= 0 || number >= 7) {
            throw new IllegalArgumentException("없는 눈의 갯수");
        }

    }

    public int getNumber() {
        return number;
    }
}
