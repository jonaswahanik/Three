public class Fish {
    String breed;
    int depth;
    int length;
    int weight;
    double growth;
    int pop;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getGrowth() {
        return growth;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public Fish(String breed, int depth, int length, int weight, double growth, int pop) {
        this.breed = breed;
        this.depth = depth;
        this.length = length;
        this.weight = weight;
        this.growth = growth;
        this.pop = pop;
    }
    public int projectedPop (int years) {
        if(growth >= 1) {
            return (int) (pop + (growth * pop * years));
        }
        return (int) (pop - (growth * pop * years));
    }
    public boolean goodCatch () {
        return length > 32 && weight > 7;
    }
}
