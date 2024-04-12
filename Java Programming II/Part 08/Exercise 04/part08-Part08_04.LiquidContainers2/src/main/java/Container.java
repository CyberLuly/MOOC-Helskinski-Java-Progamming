public class Container {

    private int liquid;
    private int maxAmount;
    private int minAmount;

    public Container() {
        this.maxAmount = 100;
        this.minAmount = 0;
    }

    public int contains() {
        return this.liquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.liquid += amount;
            if (this.liquid > maxAmount) {
                this.liquid = maxAmount;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.liquid -= amount;
            if (this.liquid < minAmount) {
                this.liquid = minAmount;
            }
        }
    }

    @Override
    public String toString() {
        return contains() + "/100";
    }


}

