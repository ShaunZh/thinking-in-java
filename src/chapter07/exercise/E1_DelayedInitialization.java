package chapter07.exercise;

class Simple {
    String s;
    public Simple(String si) {
        s = si;
    }
    public String toString() {
        return s;
    }
    public void setString(String sNew) {
        s = sNew;
    }
}

class Secord {
    Simple simple;
    String s;
    public Secord(String si) {
        s = si;
    }

    public void check() {
        if (simple == null) {
            System.out.println("not initialization");
        } else {
            System.out.println("initialization");
        }
    }
    private Simple lazy() {
        if (simple == null) {
            System.out.println("Create Simple");
            simple = new Simple(s);
        }
        return simple;
    }
    public Simple getSimple() {
        return lazy();
    }
    public String toString() {
        return lazy().toString();
    }
    public void setSimple(String sNew) {
        lazy().setString(sNew);
    }
}


public class E1_DelayedInitialization {
    public static void main(String[] args) {
        Secord secord = new Secord("Init String");
        secord.check();
        System.out.println(secord.getSimple());
        secord.check();
        System.out.println(secord);
        secord.setSimple(("New String"));
        System.out.println(secord);
    }
}
