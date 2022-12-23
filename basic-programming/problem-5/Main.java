public class Main {
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }

    private static boolean palindrome(String value) {
        char c = 0;// Variabel untuk menampung nilai string to char
        char d = 0;// Variabel untuk menampung nilai reverse string to char

        for (int i = 0; i < value.length(); i++) {
            c = value.charAt(i);
            //just check System.out.print(c+" ");
        }

        StringBuilder sb = new StringBuilder(value);
        sb.reverse();
        for (int x = 0; x < sb.length(); x++) {
            d = sb.charAt(x);
            //just check System.out.print(d + " ");
        }
        if (c == d) {
            return true;
        } else {
            return false;
        }
    }
}