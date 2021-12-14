package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NumbersTest {

    @Test
    @DisplayName("주어진 문자열을 분리해서 숫자로 변환한다")
    void shouldSplitAndParse() {
        Numbers numbers = new Numbers(Arrays.asList(new Number("1"), new Number("3")));
        assertThat(new Numbers("1,3")).isEqualTo(numbers);
    }

    @Test
    @DisplayName("주어진 숫자의 합계를 구한다")
    void shouldSumNumbers() {
        Numbers numbers = new Numbers("3:5");
        numbers.sum();

        assertThat(numbers.result()).isEqualTo(new Number(8));
    }
}