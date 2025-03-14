public class ExampleCasting {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;

        double result = num1 / num2;
        double result2 = (double) num1 / num2;

        System.out.println(result);
        System.out.println(result2);
    }
}
