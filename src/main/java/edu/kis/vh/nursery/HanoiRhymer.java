package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalrejected = 0;

    public int reportRejected() {
        return totalrejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalrejected++;
        else
            super.countIn(in);
    }
}
