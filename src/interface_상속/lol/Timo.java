package interface_상속.lol;

public class Timo extends Champion {


    public Timo() {
        super("timo",

                new Skill() {
                    @Override
                    public void useSkill() {
                        System.out.println("q Skill");
                    }
                },
                new Skill() {
                    @Override
                    public void useSkill() {
                        System.out.println("w Skill");
                    }
                },
                new Skill() {
                    @Override
                    public void useSkill() {
                        System.out.println("e Skill");
                    }
                },
                new Skill() {
                    @Override
                    public void useSkill() {
                        System.out.println("r Skill");
                    }
                }
        );
    }
}
