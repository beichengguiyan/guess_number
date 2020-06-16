package com.twschool.practice;


public class GuessNumber {

    public boolean judgeInput(String input) {
        if (input.length() != 4) {
            return false;
        }
        StringBuffer sb = new StringBuffer(input);
        String rs = sb.reverse().toString().replaceAll("(.)(?=.*\\1)", "");
        StringBuffer out = new StringBuffer(rs);
        String result = out.reverse().toString();
        if (result.length() != 4) {
            return false;
        }
        return true;
    }

    public String judgeNumberAndPosition(String answer, String input) {
        String[] answerArray = answer.split("");
        String[] inputArray = input.split("");
        int numberCount = 0;
        int positionCount = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < answerArray.length; j++) {
                if (inputArray[i].equals(answerArray[j])) {
                    if (i == j) {
                        positionCount++;
                    } else {
                        numberCount++;
                    }
                }
            }
        }
        return positionCount + "A" + numberCount + "B";
    }
}
