package calculator;

public class Operand {
    private final int value;

    public Operand(String value) {
        this.value = Integer.parseInt(value);
    }

    public int getValue() {
        return value;
    }
}
