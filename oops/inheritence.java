package oops;
class aplliances{
    public void counsumeElectricity() {
        System.out.println("aplliances counsume electricity");
    }
}
class fan extends aplliances{
    public void rotate(){
        System.out.println("fan rotate");
    }
}
class light extends aplliances{
    public void glow(){
        System.out.println("light glows");
    }
}
class cielingFan extends fan{
    public void hangs(){
        System.out.println("cieling hangs");
    }
}

public class inheritence {
    public static void main(String[] args) {
        fan f = new fan();
        f.counsumeElectricity();
        light l = new light();
        l.glow();
        cielingFan c = new cielingFan();
        c.hangs();
        c.rotate();

    }
}
