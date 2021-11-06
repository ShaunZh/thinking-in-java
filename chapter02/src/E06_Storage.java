public class E06_Storage {
    public int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        E06_Storage storage = new E06_Storage();
        int length = storage.storage("abcde");
        System.out.println("length = " + length);
    }
}
