package com.olbati;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsTest {

    RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void should_return_I_when_input_equals_1() {
        assertThat(romanNumerals.parseToRoman(1)).isEqualTo("I");
    }

    @Test
    public void should_return_II_when_input_equals_2() {
        assertThat(romanNumerals.parseToRoman(2)).isEqualTo("II");
    }

    @Test
    public void should_return_III_when_input_equals_3() {
        assertThat(romanNumerals.parseToRoman(3)).isEqualTo("III");
    }

    @Test
    public void should_return_IV_when_input_equals_4() {
        assertThat(romanNumerals.parseToRoman(4)).isEqualTo("IV");
    }

    @Test
    public void should_return_V_when_input_equals_5() {
        assertThat(romanNumerals.parseToRoman(5)).isEqualTo("V");
    }

    @Test
    public void should_return_VI_when_input_equals_6() {
        assertThat(romanNumerals.parseToRoman(6)).isEqualTo("VI");
    }

    @Test
    public void should_return_IX_when_input_equals_9() {
        assertThat(romanNumerals.parseToRoman(9)).isEqualTo("IX");
    }

    @Test
    public void should_return_XIX_when_input_equals_19() {
        assertThat(romanNumerals.parseToRoman(19)).isEqualTo("XIX");
    }

    @Test
    public void should_return_MMXVIII_when_input_equals_2018() {
        assertThat(romanNumerals.parseToRoman(2018)).isEqualTo("MMXVIII");
    }

    @Test
    public void should_return_MMDCCCLXXXVIII_when_input_equals_2888() {
        assertThat(romanNumerals.parseToRoman(2888)).isEqualTo("MMDCCCLXXXVIII");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_input_is_lower_than_1() {
        romanNumerals.parseToRoman(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_input_is_upper_than_3000() {
        romanNumerals.parseToRoman(3001);
    }

    @Test
    public void should_return_1_when_input_equals_I() {
        // Act
        int result = romanNumerals.parseToNumber("I");

        // Assert
        assertThat(result).isEqualTo(1);

    }

    @Test
    public void should_return_2_when_input_equals_II() {
        // Act
        int result = romanNumerals.parseToNumber("II");

        // Assert
        assertThat(result).isEqualTo(2);

    }

    @Test
    public void should_return_3_when_input_equals_III() {
        // Act
        int result = romanNumerals.parseToNumber("III");

        // Assert
        assertThat(result).isEqualTo(3);

    }

    @Test
    public void should_return_4_when_input_equals_IV() {
        // Act
        int result = romanNumerals.parseToNumber("IV");

        // Assert
        assertThat(result).isEqualTo(4);

    }

    @Test
    public void should_return_5_when_input_equals_V() {
        // Act
        int result = romanNumerals.parseToNumber("V");

        // Assert
        assertThat(result).isEqualTo(5);

    }

    @Test
    public void should_return_9_when_input_equals_IX() {
        // Act
        int result = romanNumerals.parseToNumber("IX");

        // Assert
        assertThat(result).isEqualTo(9);

    }

    @Test
    public void should_return_14_when_input_equals_XIV() {
        // Act
        int result = romanNumerals.parseToNumber("XIV");

        // Assert
        assertThat(result).isEqualTo(14);

    }

    @Test
    public void should_return_1919_when_input_equals_MCMXIX() {
        // Act
        int result = romanNumerals.parseToNumber("MCMXIX");

        // Assert
        assertThat(result).isEqualTo(1919);

    }

    @Test
    public void should_return_2888_when_input_equals_MMDCCCLXXXVIII() {
        assertThat(romanNumerals.parseToNumber("MMDCCCLXXXVIII")).isEqualTo(2888);
    }

}
