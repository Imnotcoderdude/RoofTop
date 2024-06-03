package gameCharacter;

public class MyOrc extends Character{


    @Override
    public String getRace() {
        return "Orc";
    }

    @Override
    public int getLevel() {
        return 100;
    }

    @Override
    public int getHp() {
        return 100;
    }

    @Override
    public int GetMp() {
        return 5;
    }

    @Override
    public int getDmg() {
        return 70;
    }

    @Override
    public int getAtkSpd() {
        return 20;
    }

    @Override
    public int getDef() {
        return 1;
    }

    @Override
    public Double getMissAtk() {
        return 0.05;
    }

    @Override
    public String status() {
        return "Alive";
    }

    @Override
    public String allRaceSkill() {
        return "";
    }

    @Override
    public String humanSkill() {
        return "";
    }

    @Override
    public String orcSkill() {
        return "";
    }

    @Override
    public String elfSkill() {
        return "";
    }

    @Override
    public String humanWeapon() {
        return "";
    }

    @Override
    public String orcWeapon() {
        return "ShortAxe";
    }

    @Override
    public String elfWeapon() {
        return "오크는 엘프의 무기는 사용할 수 없습니다.";
    }
}
