public class Main {
    public static void main(String[] args) {
        String str1 = "QWTYUIQWRFTGQWJKKMBQKMBQW";
        String str2 = "QW";

        int count = Character (str1, str2);
        System.out.println(count);
    }

    public static int Character (String str1, String str2){
        if (str2.isEmpty())
            throw new RuntimeException();
        return str1.split(str2, -1).length - 1;
    }
}