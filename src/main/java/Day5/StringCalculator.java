package Day5;

public class StringCalculator {


    public static int add(String numbers) {

        if (numbers.length() == 0) {
            return 0;
        } else if (numbers.length() == 1) {
            return Integer.valueOf(numbers);
        } else {
            String[] splitNumbers = numbers.split(",");
            int sum = 0;
            for (int i = 0; i < splitNumbers.length; i++) {
                sum = sum + Integer.valueOf(splitNumbers[i]);
            }
            return sum;
        }
    }
}
