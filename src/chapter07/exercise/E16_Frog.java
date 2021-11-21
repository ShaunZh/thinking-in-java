package chapter07.exercise;

class Amphibian {
    Amphibian() {
        System.out.println("Amphibian");
    }
    static void dance(Amphibian am, String name) {
        am.play(name);
    }
    public void play(String music) {
        System.out.println("play " + music);
    }
}

public class E16_Frog extends Amphibian{
    int songCount = 0;
    E16_Frog() {
        System.out.println("E16_Frog");
    }
    public void play(String music) {
        songCount++;
        System.out.println("music " + music + "; count + " + songCount);
    }
    public static void main(String[] args) {
        E16_Frog f = new E16_Frog();
        Amphibian.dance(f, "Yesterday");  // 向上转型，将Frog的实例对象作为参数传给Amphibian.dance
    }
}
