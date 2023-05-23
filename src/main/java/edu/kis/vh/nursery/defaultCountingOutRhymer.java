package edu.kis.vh.nursery;

/**
 * Klasa reprezentuje stos liczbowy z ograniczonym rozmiarem zmienną MAX_SIZE
 */
public class defaultCountingOutRhymer {

    private static final int EMPTY_RHYMER_INDICATOR = -1; //Wartość zwracana w przypadku pustego stosu
    private static final int DEFAULT_VALUE = -1; //Wartość początkowa licznkika stosu


    private static final int MAX_SIZE = 12; //Maksymalny rozmiar stosu
    private static final int CAPACITY = MAX_SIZE -1; //Pojemność stosu
    private final int[] numbers = new int[MAX_SIZE]; //Tablica przechowująca liczby na stosie

    /**
     * Zwraca watrtość jaka jest zwracana podczas gdy stos jest pusty
     *
     * @return Wartość zwracana gdy stos jest pusty
     */
    public static int getEmptyRhymerIndicator() {
        return EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Zwraca wartość początkowej licznika stosu
     *
     * @return wartość początkowa licznika stosu
     */
    public static int getDefaultValue() {
        return DEFAULT_VALUE;
    }

    /**
     * Zwraca maksymalny rozmiar stosu
     *
     * @return Maksymalny rozmiar stosu
     */
    public static int getMaxSize() {
        return MAX_SIZE;
    }

    /**
     *  Zwraca pojemność stosu
     *
     * @return Pojemność stosu
     */
    public static int getCAPACITY() {
        return CAPACITY;
    }

    /**
     *  Zwraca ilość elementów na stosie
     *
     * @return ilość elementów na stosie
     */
    public int getTotal() {
        return total;
    }

    private int total = EMPTY_RHYMER_INDICATOR;

    /**
     * Dodawaanie liczby na stos
     *
     * @param in liczba do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdzenie czy stos jest pusty
     *
     * @return Wartość logiczna czy stos jest pusty
     */
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Zwraca informacje czy stos jest pełny
     *
     * @return Wartość logiczna czy pełny
     */
    public boolean isFull() {
        return total == CAPACITY;
    }

    /**
     * Zwraca ostatnio dodaną liczbe na stosie bez zmniejszenia ilości liczb na stosie
     *
     * @return ostatnia liczba ze stosu
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total];
    }

    /**
     * Zdejmuje ostatni element ze stosu
     *
     * @return ostatni element ze stosu
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

    /**
     * Zwraca tablice liczb na stosie
     *
     * @return tablica liczb na stosie
     */
    public int[] getNumbers() {
        return numbers;
    }
}
