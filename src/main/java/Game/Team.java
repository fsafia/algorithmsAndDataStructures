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

    public void attack(Team otherTeam) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Doctor) { //если это доктор?
                arrayList.get(i).healing(minHealingНего()); //добавляет здоровье для героя с миним здоровьем
            } else { //если не докотор
                if (i < otherTeam.arrayList.size()) { //если во второй команде не меньше i - игроков
                    arrayList.get(i).hit(otherTeam.arrayList.get(i));
                } else {  // если во второй команде меньше i -игроков
                    arrayList.get(i).hit(otherTeam.maxHealingНего()); //удар по противнику с макс здоровьем
                }
            }
        }

        otherTeam.deleteDeadHero();
    }

    public void deleteDeadHero() {
        ArrayList<Hero> temp = new ArrayList<Hero>();
        for (Hero h : arrayList) {
            if (h.isLive()) {
                temp.add(h);
            }
        }
        arrayList = temp;
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

    public boolean isWin(Team teamOther) {
        return teamOther.arrayList.size() <= 0;
    }

    public boolean isDraw(Team otherTeam) {
        return  (this.arrayList.size() == 1 && this.arrayList.get(0) instanceof Doctor &&
                otherTeam.arrayList.size() == 1 && otherTeam.arrayList.get(0) instanceof Doctor);
    }

    public void info() {
        for (Hero h: arrayList) {
            h.info();
        }
    }
}
