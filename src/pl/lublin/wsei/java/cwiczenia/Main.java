package pl.lublin.wsei.java.cwiczenia;
public class Main {

    public static void main(String[] args) {
        System.out.print("arg\t\t\tlog2(arg)\t\t\tsum(arg)\n");
        double LOG2 = Math.log(2);
        int i = 1;
        while (i < 10) {
            double x = i;
            i = i * 2;

            System.out.printf("%f\t%f\t\n", x, Math.log(x) / LOG2);
        }
    }
}