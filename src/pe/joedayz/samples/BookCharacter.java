package pe.joedayz.samples;

public class BookCharacter {
    private final String name;
    private final Integer age;
    private final Weapon mainWeapon;
    private final boolean human;

    public BookCharacter(String name, Integer age, Weapon mainWeapon, boolean human) {
        this.name = name;
        this.age = age;
        this.mainWeapon = mainWeapon;
        this.human = human;
    }

    public enum Weapon {SWORD, AXE, BOW, STAFF, RING}

    // getters, toString, equals and hashCode



    @Override
    public String toString() {
        return "BookCharacter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mainWeapon=" + mainWeapon +
                ", human=" + human +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Weapon getMainWeapon() {
        return mainWeapon;
    }

    public boolean isHuman() {
        return human;
    }
}
