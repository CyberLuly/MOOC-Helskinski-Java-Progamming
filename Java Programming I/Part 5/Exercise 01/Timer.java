public class Timer {

    private ClockHand seconds;
    private ClockHand hundrethOfSecond;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundrethOfSecond = new ClockHand(100);
    }

    @Override
    public String toString() {
        return seconds + ":" + hundrethOfSecond;
    }

    public void advance() {
        this.hundrethOfSecond.advance();
        if (hundrethOfSecond.value() == 0) {
            this.seconds.advance();
        }

    }

}
