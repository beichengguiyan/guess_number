package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class GuessNumberTest {

    @Test
    public void should_return_4A0B_when_given_1234_1234() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        String answer = "1234";
        String input ="1234";
        String result =null;

        // when
        result = guessNumber.judgeNumberAndPosition(answer,input);

        // then
        Assert.assertThat(result, is("4A0B"));
    }

    @Test
    public void should_return_0A0B_when_given_1234_5678() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        String answer = "1234";
        String input ="5678";
        String result =null;

        // when
        result = guessNumber.judgeNumberAndPosition(answer,input);

        // then
        Assert.assertThat(result, is("0A0B"));
    }

    @Test
    public void should_return_1A2B_when_given_1234_2436() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        String answer = "1234";
        String input ="2436";
        String result =null;

        // when
        result = guessNumber.judgeNumberAndPosition(answer,input);

        // then
        Assert.assertThat(result, is("1A2B"));
    }

    @Test
    public void should_return_0A1B_when_given_1234_2789() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        String answer = "1234";
        String input ="2789";
        String result =null;

        // when
        result = guessNumber.judgeNumberAndPosition(answer,input);

        // then
        Assert.assertThat(result, is("0A1B"));
    }

    @Test
    public void should_return_1A0B_when_given_1234_1789() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        String answer = "1234";
        String input ="1789";
        String result =null;

        // when
        result = guessNumber.judgeNumberAndPosition(answer,input);

        // then
        Assert.assertThat(result, is("1A0B"));
    }

    @Test
    public void should_return_0A4B_when_given_1234_4321() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        String answer = "1234";
        String input ="4321";
        String result =null;

        // when
        result = guessNumber.judgeNumberAndPosition(answer,input);

        // then
        Assert.assertThat(result, is("0A4B"));
    }

    @Test
    public void should_return_true_when_given_1234() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        String input ="1234";
        boolean result;

        // when
        result = guessNumber.judgeInput(input);

        // then
        Assert.assertThat(result, is(true));
    }

    @Test
    public void should_return_false_when_given_1233() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        String input ="1233";
        boolean result;

        // when
        result = guessNumber.judgeInput(input);

        // then
        Assert.assertThat(result, is(false));
    }

    @Test
    public void should_return_true_when_use_generateAnswer() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        String answer =null;
        boolean result;

        // when
        answer = guessNumber.generateAnswer();
        result = guessNumber.judgeInput(answer);

        // then
        Assert.assertThat(result, is(true));
    }


}
