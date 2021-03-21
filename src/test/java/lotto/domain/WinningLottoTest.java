package lotto.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class WinningLottoTest {

    @ParameterizedTest
    @CsvSource(value = {"'1,2,3,4,5,6,7':'6'", "'1,2,3':'3'"}, delimiter = ':')
    void 유효숫자_예외(String input, String bonusInput) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    new WinningLotto(input, bonusInput);
                });
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "7:false"}, delimiter = ':')
    void 당첨번호_포함(int input, boolean expected) {
        WinningLotto winningLotto = new WinningLotto("1,2,3,4,5,6", "7");

        assertThat(winningLotto.contains(new Number(input)))
                .isEqualTo(expected);
    }
}
