package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 3.0;

        double result = (9 * a * a - 5 * b + 2 + a - 7) * (a + b - 2 * a * b / 2);

        System.out.println("Result: " + result);
    }
}