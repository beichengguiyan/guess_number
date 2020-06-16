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
}
