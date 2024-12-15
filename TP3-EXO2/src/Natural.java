public class Natural {
	
    int value;

    public Natural(int value) {
        this.value = value;
    }

    public double inverse() {
        return 1.0 / value;
    }

    public Natural inv() {
        return new Natural((int) (1.0 / value));
    }

    public int power(int x) {
        return (int) Math.pow(value, x);
    }

    public boolean isPrime() {
        if (value < 2) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public Natural absoluteValue() {
        return new Natural(Math.abs(value));
    }

    public double rootSquare() {
        return Math.sqrt(value);
    }

    public Natural factorial() {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return new Natural(result);
    }

    public double sin() {
        return Math.sin(value);
    }
}

