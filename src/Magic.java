public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic Casted a Fireball");
    }
}
