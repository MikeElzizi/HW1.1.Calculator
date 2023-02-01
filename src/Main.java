public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); //было деление на ноль, отсюда и была ошибка.
        // Подправил переменную devide в классе Calculator
        calc.println.accept(c);
    }
}