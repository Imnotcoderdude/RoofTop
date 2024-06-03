package gameCharacter;

public abstract class Character implements Ability, Weapon, Skill {

    public String getRace() {
        return "Orc,Human,Elf";
    }

    public String orcWeapon() {
        return "Axe,";
    }
}
