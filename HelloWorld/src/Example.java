public class Example {
    public static void main(String[] args) {
        int one[] = new int[3];

        for (int i = 0; i < one.length; i++) {
            one[i] = 10 * i;
        }

        String two[] = {"하나", "둘", "셋"};
        for (String str : two) {
            System.out.println(str);
        }

        int j = 0;
        while (j < two.length) {
            System.out.println(one[j]);
            j++;
        }

    }
}
