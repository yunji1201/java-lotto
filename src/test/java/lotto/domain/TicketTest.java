package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TicketTest {
    @Test
    @DisplayName("한 장당 일치하는 당첨번호 개수")
    public void numberOfMatchingNumber() {
        Ticket ticket = Ticket.from(List.of(1, 2, 3, 44, 55, 66));

        WinningNumber winningNumber = WinningNumber.from(List.of(1, 2, 3, 4, 5, 6));
        assertThat(ticket.checkLotteryWinningStatus(winningNumber).getNumberOfMatching()).isEqualTo(3);

        winningNumber = WinningNumber.from(List.of(1, 2, 3, 44, 55, 66));
        assertThat(ticket.checkLotteryWinningStatus(winningNumber).getNumberOfMatching()).isEqualTo(6);
    }
}
