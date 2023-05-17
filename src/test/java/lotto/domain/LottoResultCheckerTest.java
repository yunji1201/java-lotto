package lotto.domain;

import lotto.domain.enums.LottoRank;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LottoResultCheckerTest {


    @Test
    void 결과확인() {
        LottoTicket t1 = LottoTicket.createLottoTicketByManual(new ArrayList<>(Arrays.asList(1, 10, 20, 25, 30, 45)));
        LottoTicket t2 = LottoTicket.createLottoTicketByManual(new ArrayList<>(Arrays.asList(2, 10, 20, 25, 30, 45)));
        LottoTicket t3 = LottoTicket.createLottoTicketByManual(new ArrayList<>(Arrays.asList(1, 11, 20, 25, 30, 45)));
        LottoTicket t4 = LottoTicket.createLottoTicketByManual(new ArrayList<>(Arrays.asList(1, 11, 21, 25, 30, 45)));
        LottoTicket t5 = LottoTicket.createLottoTicketByManual(new ArrayList<>(Arrays.asList(1, 10, 20, 26, 31, 45)));
        LottoTicket t6 = LottoTicket.createLottoTicketByManual(new ArrayList<>(Arrays.asList(1, 10, 20, 26, 31, 44)));
        LottoTicket t7 = LottoTicket.createLottoTicketByManual(new ArrayList<>(Arrays.asList(2, 11, 21, 26, 31, 44)));
        LottoTicket t8 = LottoTicket.createLottoTicketByManual(new ArrayList<>(Arrays.asList(3, 10, 20, 25, 30, 45)));

        List<LottoTicket> lottoTickets = Arrays.asList(t1, t2, t3, t4, t5, t6, t7, t8);

        List<Integer> winningNumbers = Arrays.asList(1, 10, 20, 25, 30, 45);
        Integer bonusNumber = 3;
        WinningNumber winningNumber = new WinningNumber(winningNumbers, bonusNumber);

        LottoResultChecker lottoResultChecker = new LottoResultChecker(lottoTickets, winningNumber);

        Assertions.assertThat(lottoResultChecker.getRankCount(LottoRank.FIRST)).isEqualTo(1);
        Assertions.assertThat(lottoResultChecker.getRankCount(LottoRank.SECOND)).isEqualTo(1);
        Assertions.assertThat(lottoResultChecker.getRankCount(LottoRank.THIRD)).isEqualTo(2);
        Assertions.assertThat(lottoResultChecker.getRankCount(LottoRank.FOURTH)).isEqualTo(2);
        Assertions.assertThat(lottoResultChecker.getRankCount(LottoRank.FIFTH)).isEqualTo(1);

        Assertions.assertThat(lottoResultChecker.getTotalPrizeMoney()).isEqualTo(new Money(2_033_105_000L));
    }
}