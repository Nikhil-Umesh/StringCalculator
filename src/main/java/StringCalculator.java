public class StringCalculator {
    public int add(String input) {
        String[] numbers = input.split(",|\n|;");

        if (input.isEmpty()) {
            return 0;
        } else if (numbers.length > 1) {
            return getSum(numbers);
        }
        return stringToInt(input);
    }

    private int getSum(String[] numbers) {
        int sum = 0;
        for (String currentNumber:numbers) {
            sum += stringToInt(currentNumber);
        }
        return sum;
    }

    private int stringToInt(String number) {
        return Integer.parseInt(number);
    }

}

