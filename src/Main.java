public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0]=new Magic(40,20);
        heroes[1]=new Medic (35,0,20);
        heroes[2]=new Warriror(40,30);
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic){
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
    }
}