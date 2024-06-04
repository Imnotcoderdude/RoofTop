package interface_상속.gameCharacter;

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
    public String setWeapon() {
        return "";
    }

    @Override
    public String setSkill() {
        return "";
    }

}
