package chapter05.example;

public class E8_Burrito {
    E8_EnumSpiciness.Spiciness degree;
    E8_Burrito(E8_EnumSpiciness.Spiciness degree) {
        // 这里必须使用this.degree，否则会报错，为什么？
        this.degree = degree;
    }
    public void describe() {
        System.out.println("This burrito is ");
        switch (degree) {
            case NOT: System.out.println("not spicy at all."); break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot.");
        }
    }
    public static void main(String... args) {
        E8_Burrito
                plain = new E8_Burrito(E8_EnumSpiciness.Spiciness.NOT ),
                greenChile = new E8_Burrito(E8_EnumSpiciness.Spiciness.MEDIUM),
                jalapeno = new E8_Burrito(E8_EnumSpiciness.Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
