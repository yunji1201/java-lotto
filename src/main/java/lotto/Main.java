package lotto;

import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter(",\\s*|\r?\n");
        int money = InputView.inputPay(scanner);
        Customer customer = new Customer(money);
        customer.buyLotto();

        OutputView.showLottos(customer.getLottos());
        List<Integer> lastNumbers = InputView.lastWinNumbers(scanner);
        int bonusNumber = InputView.inputBonusNumber(scanner);
        WinNumber winNumber = new WinNumber(lastNumbers, bonusNumber);

        Map<KLottoRank, Integer> lottoResult = customer.checkLottoWin(winNumber);
        OutputView.LottoResult(lottoResult, customer);
        scanner.close();
    }
}