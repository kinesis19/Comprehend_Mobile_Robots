public class Array {
    public static void main(String[] args) {
        // Array
        int[] studentHeight = {170, 180, 173, 175, 177};

        double sum = 0;

        for(int i = 0; i < studentHeight.length; i++) {
            System.out.println(studentHeight[i]);
            sum += studentHeight[i];
        }

        double avg = 0.0;
        avg = sum / (double)studentHeight.length;
        System.out.println("Avg is: " + avg);
    }
}
