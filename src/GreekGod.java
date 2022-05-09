import java.util.ArrayList;

public class GreekGod {
    String name;
    String weapon;
    String godOf;
    ArrayList majorTwelve;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getGodOf() {
        return godOf;
    }

    public void setGodOf(String godOf) {
        this.godOf = godOf;
    }

    public ArrayList getMajorTwelve() {
        return majorTwelve;
    }

    public void setMajorTwelve(ArrayList majorTwelve) {
        this.majorTwelve = majorTwelve;
    }

    public GreekGod(String name, String weapon, String godOf, ArrayList majorTwelve) {
        this.name = name;
        this.weapon = weapon;
        this.godOf = godOf;
        this.majorTwelve = majorTwelve;
    }
    public boolean isBigTwelve() {
        for (int i = 0; i < getMajorTwelve().size(); i++) {
            if (getMajorTwelve().get(i).equals(getName())) {
                return true;
            }
        }
        return false;
    }
    public boolean isSonOfCronus() {
        if(getName().equals("Zeus") || getName().equals("Poseidon") || getName().equals("Hades")) {
            return true;
        }
        return false;
    }
}
