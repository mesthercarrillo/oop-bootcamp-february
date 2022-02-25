package Day5;

public class StringCalculator {


    public static int add(String numbers) {
        if (numbers.length() == 0) {
            return 0;
        } else if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        } else {
            String[] splitNumbers = numbers.split(",");
            int sum = 0;
            for (String splitNumber : splitNumbers) {
                sum = sum + Integer.parseInt(splitNumber);
            }
            return sum;
        }
    }
}
