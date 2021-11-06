public class E08_StaticInstance {
    static int psData = 57;

    public static void main(String[] args) {
        E08_StaticInstance si01 = new E08_StaticInstance();
        E08_StaticInstance si02 = new E08_StaticInstance();

        System.out.println(si01.psData + "==" + si02.psData);
        si01.psData++;
        System.out.println(si02.psData + "==" + si02.psData);
    }
}
