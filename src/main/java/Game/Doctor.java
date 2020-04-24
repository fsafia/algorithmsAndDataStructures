package Game;

class Doctor extends Hero {

    public Doctor(String name) {

        super(name);
        health = (int)(Math.random() * 50) + 51;
        damage = 0;
        addHeal = (int)(Math.random() * 20) + 101;
    }

    @Override
    void hit(Hero hero) {
        System.out.println("Доктор не может бить!");
    }

    @Override
    void healing(Hero hero) {
        hero.addHealth(addHeal);
    }
}