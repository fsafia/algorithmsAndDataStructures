package Game;

class Warrior extends Hero {

    public Warrior( String name) {
        super(name);
        health = (int)(Math.random() * 100) + 201;
        damage = (int)(Math.random() * 20) + 41;
        addHeal = 0;
    }

    @Override
    void hit(Hero hero) {
        if (hero != this) {
            if(health < 0) {
                System.out.println("Герой погиб и бить не может!");
            } else {
                hero.causeDamage(damage);
            }
            System.out.println(this.name + " нанес урон " + hero.name);
        }
    }

    @Override
    void healing(Hero hero) {
        System.out.println("Войны не умеют лечить!");
    }
}