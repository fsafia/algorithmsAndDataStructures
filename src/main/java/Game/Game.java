package Game;

import java.util.Random;

class Game {
    public static void main(String[] args) {

        Random randomStep = new Random();
        Hero[] team1 = new Hero[]{new Warrior("Тигрил")
                , new Assasin("Акали")
                , new Doctor("Жанна")};

        Hero[] team2 = new Hero[]{new Warrior("Минотавр")
                , new Assasin("Джинкс")
                , new Doctor("Зои")};

        Team t1 = new Team(team1);
        Team t2 = new Team(team2);
        t1.info();
        t2.info();

        while (!t1.arrayList.isEmpty() && !t2.arrayList.isEmpty()) {
            if (randomStep.nextInt(2) == 0) {  //получаем значение 0 или 1
                //значение =0 , атакует команда 1
                System.out.println("атакует команда 1");

                t1.attack(t2);
                t2.info();

                if (t1.isWin(t2)) {
                    System.out.println("Команда 1 победила!");
                    return;
                }
            } else {
                //значение =1 , атакует команда 2
                System.out.println("атакует команда 2");
                t2.attack(t1);
                t1.info();

                if (t2.isWin(t1)) {
                    System.out.println("Команда 2 победила!");
                    return;
                }
            }

            if (t1.isDraw(t2)) {  //ничья
                System.out.println("Ничья");
                return;
            }

            System.out.println("--------------------");

        }
    }






//        Team team = new Team();
//        ArrayList<Hero> team1 = new ArrayList<Hero>();
//        team1.add(new Warrior("Тигрил"));
//        team1.add(new Assasin("Акали"));
//        team1.add(new Doctor( "Жанна"));
//
//        ArrayList<Hero> team2 = new ArrayList<Hero>();
//        team1.add(new Warrior("Минотавр"));
//        team1.add(new Assasin("Джинкс"));
//        team1.add(new Doctor( "Зои"));
//
//
//
//            for (int i = 0; i < team1.size(); i++) {
//                if(randomStep.nextInt(2) == 0) {
//                    if(team1.get(i) instanceof Doctor) {
//                        team1.get(i).healing(team1.get(randomHealing.nextInt(2)));
//                    } else {
//                        team1.get(i).hit(team2.get(i));
//                    }
//                } else {
//                    if(team2.get(i) instanceof Doctor) {
//                        team2.get(i).healing(team2.get(randomHealing.nextInt(2)));
//                    } else {
//                        team2.get(i).hit(team1.get(i));
//                    }
//                }
//            }
//
//        for (Hero h : team1) {
//            if (!h.isLive()) {
//                team1.remove(h);
//            }
//        }
//
//        for (Hero h : team2) {
//            if (!h.isLive()) {
//                team2.remove(h);
//            }
//        }
        

        //удаление из листа убитых героев циклом foreach и рповерить если 2 героя подряд стоят что будет.
        //если команда1 длина = 0, а команда2 больше нуля тогда победа ком2
        // если команда 2 длина == 0, а ком1 больше нуля, тогда победа ком1
        

//        System.out.println("---------------");
//
//        for (Hero t1: team1) {
//            t1.info();
//        }
//
//        for (Hero t2: team2) {
//            t2.info();
//        }
//    }
}