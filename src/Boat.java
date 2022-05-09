public class Boat {
    int length;
    boolean hasSail;
    int horsePower;
    int displacement;

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public Boat(int length, boolean hasSail, int horsePower, int displacement) {
        this.length = length;
        this.hasSail = hasSail;
        this.horsePower = horsePower;
        this.displacement = displacement;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isHasSail() {
        return hasSail;
    }

    public void setHasSail(boolean hasSail) {
        this.hasSail = hasSail;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public boolean isYacht() {
        return (getLength() > 40);
    }
    public int topSpeed() {
        return (int) (Math.sqrt(horsePower / displacement) * 150);
    }
}
