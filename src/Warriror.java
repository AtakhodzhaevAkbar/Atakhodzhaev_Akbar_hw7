public class Warriror extends Hero {
    public Warriror(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void applySuperAbility() {
        System.out.printf("Warrior Swung His Sword");
    }
}
