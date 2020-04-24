package Game;

import java.util.Random;

class Assasin extends Hero {

    int cricitalHit;
    Random random = new Random();

    public Assasin(String name) {
        super(name);
        health = (int)(Math.random() * 50) + 101;
        damage = (int)(Math.random() * 30) + 81;
        addHeal = 0;
        this.cricitalHit = random.nextInt(20);
    }

    @Override
    void hit(Hero hero) {
        if (hero != this) {
            if(health < 0) {
                System.out.println("Герой погиб и бить не может!");
            } else {
                hero.causeDamage(damage + cricitalHit);
            }
            System.out.println(this.name + " нанес урон " + hero.name);
        }
    }

    @Override
    void healing(Hero hero) {
        System.out.println("Убийцы не умеют лечить!");
    }
}