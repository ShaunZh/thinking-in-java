package chapter07.exercise;
import static hexon.util.Print.*;

class Villain  {
    private String name;
    protected void set(String nm) {name = nm;}
    public Villain(String name) {this.name = name;}
    public String toString() {
        return "I'm a Villain and my name is " + name;
    }
}

public class E15_Orc extends Villain {
    private int orcNumber;
    public E15_Orc(String name, int orcNumber) {
        super(name);
        // 因为形参名与字段名相同，所以，使用this以做区分
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        E15_Orc orc = new E15_Orc("Limburger", 12);
        print(orc);
        orc.change("Bob", 19);
        print(orc);
    }
}
