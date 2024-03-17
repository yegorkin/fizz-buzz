public class Main {
    private static final int MAX_GAME_NUMBER = 100;
    private static final String[] MESSAGES = {"Fizz", "Buzz", "Goose", "Booze"};
    private static final int[] MULTIPLICITY = {3, 5, 7, 11};

    private void fizzBuzzPremium(int maximumNumber, String[] messages, int[] multiplicity) {
        if (messages.length != multiplicity.length) {
            throw new IllegalArgumentException();
        }
        int[] counters = new int[messages.length]; // Arrays.fill(counters, 0);
        StringBuilder lineStringBuilder = new StringBuilder();
        for (int i = 1; i <= maximumNumber; i++) {
            lineStringBuilder.setLength(0);
            for (int j = 0; j < counters.length; j++) {
                if (++counters[j] == multiplicity[j]) {
                    counters[j] = 0;
                    lineStringBuilder.append(messages[j]);
                }
            }
            if (lineStringBuilder.isEmpty()) {
                lineStringBuilder.append(i);
            }
            System.out.println(lineStringBuilder);
        }
    }

    public static void main(String[] args) {
        try {
            new Main().fizzBuzzPremium(MAX_GAME_NUMBER, MESSAGES, MULTIPLICITY);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
