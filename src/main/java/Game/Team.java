package Game;

import java.util.ArrayList;

public class Team {
    String name;
    public ArrayList<Hero> arrayList;

    Team(Hero ... team){
        arrayList = new ArrayList<Hero>();
        for (Hero h : team ) {
            arrayList.add(h);
        }
    }

//    public boolean isLive() {
//        for (Hero h : arrayList) {
//            if (!h.isLive()) {
//                arrayList.remove(h);
//            }
//        }
//        return !arrayList.isEmpty();
//    }

    public void deleteDeadHero() {
        for (Hero h : arrayList) {
            if (!h.isLive()) {
                System.out.println(arrayList.remove(h));
            }
        }
    }

    //герой с минимальным здоровьем
    public Hero minHealingНего() {
        Hero minHealingHero = arrayList.get(0);
        for (Hero h : arrayList) {
            if (h.getHealth() < minHealingHero.getHealth()) {
                minHealingHero = h;
            }
        }
        return minHealingHero;
    }

    //герой с максимальным здоровьем
    public Hero maxHealingНего() {
        Hero maxHealingHero = arrayList.get(0);
        for (Hero h : arrayList) {
            if (h.getHealth() > maxHealingHero.getHealth()) {
                maxHealingHero = h;
            }
        }
        return maxHealingHero;
    }
}
