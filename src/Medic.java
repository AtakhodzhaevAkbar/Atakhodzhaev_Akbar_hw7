public class Medic extends Hero{
    public int healPoint;
    public void increaseExperience(){
        healPoint = (int) (healPoint*1.1);
        System.out.println("Medic Heal Point Are Now:"+healPoint);
    }

    public Medic(int health, int damage, int healPoint) {
        super(health, damage);
        this.healPoint = healPoint;
    }

    public int getHealPoint() {
        return healPoint;
    }

    public void setHealPoint(int healPoint) {
        this.healPoint = healPoint;
    }

    public Medic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic Healed His Ally");
    }
}
