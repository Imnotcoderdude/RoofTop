package interface_상속.lol;

public abstract class Champion {
    private String name;

    private Skill q;
    private Skill w;
    private Skill e;
    private Skill r;

    public Champion(String name, Skill q, Skill w, Skill e, Skill r) {
        this.name = name;
        this.q = q;
        this.w = w;
        this.e = e;
        this.r = r;
    }

    public Skill getQ() {
        return q;
    }

    public Skill getW() {
        return w;
    }

    public Skill getE() {
        return e;
    }

    public Skill getR() {
        return r;
    }
}
