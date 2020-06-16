package com.twschool.practice;


import java.util.ArrayList;
import java.util.List;

public class GuessNumber {

    private static final int PLAY_TIMES = 6;
    private  List<String> resultList = new ArrayList<String>();

    public static void main(String[] args) {

    }

    //记录并历史数据
    public String playGame(String input) {
        return this.playGame(input,generateAnswer());
    }

    public String playGame(String input, String answer) {
        String result;
        if (!judgeInput(input)) {
            System.out.println("输入非法，请重新输入");
        }
        result = judgeNumberAndPosition(answer, input);
        resultList.add(result);
        return result;
    }
    //随机生成答案
    public String generateAnswer() {
        String answer = "";
        for (int i = 0; i < 4; ) {
            String number = String.valueOf((int) (Math.random() * 9));
            if (!answer.contains(number)) {
                answer = answer + number;
                i++;
            }
        }
        return answer;
    }

    //输入合法校验
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

    //数字位置正确性判断
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
