package kms.Previous.exam.questions;

public class DandyNumber {
    public int solution(String s) {
        int maxDandyNumber = -1;

        for (int i = 0; i <= s.length() - 3; i++) {
            String substring = s.substring(i, i + 3);
            if (isDandyNumber(substring)) {
                int currentNumber = Integer.parseInt(substring);
                maxDandyNumber = Math.max(maxDandyNumber, currentNumber);
            }
        }
        if (maxDandyNumber == -1) {
            return -1;
        }
        if (maxDandyNumber == 0) {
            return 0;
        }
        return maxDandyNumber;
    }

    private boolean isDandyNumber(String number) {
        return number.charAt(0) == number.charAt(1) && number.charAt(1) == number.charAt(2);
    }
}

