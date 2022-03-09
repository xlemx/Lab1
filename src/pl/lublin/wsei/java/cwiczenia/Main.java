package pl.lublin.wsei.java.cwiczenia;

public class Main {
    public static void main(String[] args) {
        System.out.printf("alfa\tsin(alfa)\n");
        int i;
        for (i = 0; i < 370; i += 10) {
        System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.02 * Math.PI));
        }
    }
}
