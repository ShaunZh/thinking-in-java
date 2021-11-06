public class E11_AllTheColorsOfTheRainbow {
    int anIntegerRepreentingColors;
    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepreentingColors = newHue;
    }

    public static void main(String[] args) {
        E11_AllTheColorsOfTheRainbow ac = new E11_AllTheColorsOfTheRainbow();
        ac.anIntegerRepreentingColors = 10;
        ac.changeTheHueOfTheColor(200);
    }
}
