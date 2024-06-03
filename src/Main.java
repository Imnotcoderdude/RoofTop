import gameCharacter.MyOrc;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyOrc myOrc = new MyOrc();

        System.out.println("종족명 : "+myOrc.getRace());

        System.out.println(myOrc.getLevel());
    }
}