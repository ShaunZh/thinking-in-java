package chapter08_polymorphism.shape;

import java.util.Random;

public class RandomShapeGenerator {
    private Random random = new Random(47); // 使用seed 47，每次通过random.nextInt(3)获得相同的随机数
    public Shape next() {
        switch (random.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

}
