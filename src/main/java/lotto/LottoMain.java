package lotto;

import java.util.List;
import lotto.domains.Lotto;
import lotto.domains.LottoGenerator;
import lotto.domains.LottoNumber;
import lotto.domains.LottoPurchasedAmount;
import lotto.domains.LottoStatistics;
import lotto.domains.LottoWinner;
import lotto.views.InputView;
import lotto.views.ResultView;

public class LottoMain {
    public static void main(String[] args) {
        try {
            LottoGenerator lottoGenerator = new LottoGenerator();
            InputView inputView = new InputView();

            List<Lotto> lottoList = lottoGenerator.purchaseByAuto(new LottoPurchasedAmount(inputView.inputPurchaseMoney()));
            inputView.printPurchasedLottoList(lottoList);

            Lotto lastWinnerLotto = new Lotto(inputView.inputLastWinner());
            LottoNumber bonusNumber = new LottoNumber(inputView.inputBonusNumber());
            LottoWinner lastWinner = new LottoWinner(lastWinnerLotto, bonusNumber);

            LottoStatistics statistics = new LottoStatistics(lottoList, lastWinner);
            new ResultView(statistics).printStatistics();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}