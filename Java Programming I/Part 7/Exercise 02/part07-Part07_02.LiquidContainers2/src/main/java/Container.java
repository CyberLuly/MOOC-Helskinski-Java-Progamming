public class Container {

    private int amountHeld;

    public Container() {
        amountHeld = 0;
    }

    public int contains() {
        return amountHeld;
    }

    public void add(int amount) {
        if (amount > 0) {
            amountHeld += amount;
        }
        if (amountHeld > 100) {
            amountHeld = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            amountHeld -= amount;
        }
        if (amountHeld < 0) {
            amountHeld = 0;
        }
    }

    @Override
    public String toString() {
        return amountHeld + "/100";
    }
}
