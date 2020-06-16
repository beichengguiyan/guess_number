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
//        assert result.equals("4A0B");
        Assert.assertThat(result, is("4A0B"));
    }
}
