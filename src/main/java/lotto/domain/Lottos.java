package lotto.domain;

import static lotto.domain.Rank.createRankMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lottos {

    private final List<Lotto> lottos;

    public Lottos() {
        lottos = new ArrayList<Lotto>();
    }

    public Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public int size() {
        return lottos.size();
    }

    public Map<Rank, Integer> calculateResult(Lotto winLotto) {
        Map<Rank, Integer> result = createRankMap();
        lottos.stream()
            .map(lotto -> lotto.calculateWinCount(winLotto))
            .map(Rank::calculateLottoRank)
            .forEach(rank -> result.put(rank, result.get(rank) + 1));
        return result;
    }

    public void add(Lotto lotto) {
        lottos.add(lotto);
    }

    @Override
    public String toString() {
        return lottos.stream()
            .map(String::valueOf)
            .collect(Collectors.joining("\n"));
    }
}