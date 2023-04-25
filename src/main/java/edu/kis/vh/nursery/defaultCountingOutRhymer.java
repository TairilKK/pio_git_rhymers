package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int DEFAULT_VALUE = -1;


    private static final int MAX_SIZE = 12;
    private static final int CAPACITY = MAX_SIZE -1;
    private final int[] numbers = new int[MAX_SIZE];

    public static int getEmptyRhymerIndicator() {
        return EMPTY_RHYMER_INDICATOR;
    }

    public static int getDefaultValue() {
        return DEFAULT_VALUE;
    }

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public int getTotal() {
        return total;
    }

    private int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}
