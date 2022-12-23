public class Main {
    public static void main(String[] args) {
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);
    }

    private static void DrawXYZ(int n) {
        int parameter = 1;
        for (int i = 1; i <= n; i++) {
            for (int x = 0; x < n; x++) {
                if (parameter % 3 == 0) {
                    System.out.print('X');
                } else if (parameter % 2 == 0) {
                    System.out.print('Z');
                } else {
                    System.out.print('Y');
                }
                parameter++;
            }
            System.out.println();
        }
    }
}