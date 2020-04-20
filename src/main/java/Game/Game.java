package Game;

import java.util.Random;

class Game {
    public static void main(String[] args) {

        Random randomStep = new Random();
        Random randomHealing = new Random();
        int round = 3;

        Hero[] team1 = new Hero[]{new Warrior("Тигрил")
                , new Assasin("Акали")
                , new Doctor( "Жанна")};

        for (Hero h :team1 ) {
            h.info();
        }


        Hero[] team2 = new Hero[]{new Warrior( "Минотавр")
                , new Assasin( "Джинкс")
                , new Doctor( "Зои")};

        for (Hero h :team2 ) {
            h.info();
        }




        for (int j = 0; j < round; j++) {
            for (int i = 0; i < team1.length; i++) {
                if(randomStep.nextInt(2) == 0) {
                    if(team1[i] instanceof Doctor) {
                        team1[i].healing(team1[randomHealing.nextInt(2)]);
                    } else {
                        team1[i].hit(team2[i]);
                    }
                } else {
                    if(team2[i] instanceof Doctor) {
                        team2[i].healing(team2[randomHealing.nextInt(2)]);
                    } else {
                        team2[i].hit(team1[i]);
                    }
                }
            }
        }

        //удаление из листа убитых героев циклом foreach и рповерить если 2 героя подряд стоят что будет.
        //если команда1 длина = 0, а команда2 больше нуля тогда победа ком2
        // если команда 2 длина == 0, а ком1 больше нуля, тогда победа ком1
        

        System.out.println("---------------");

        for (Hero t1: team1) {
            t1.info();
        }

        for (Hero t2: team2) {
            t2.info();
        }
    }
}