package lotto.domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum Rank {

    LAST(0, 0),
    FOURTH(5_000, 3),
    THIRD(50_000, 4),
    SECOND(1_500_000, 5),
    FIRST(2_000_000_000, 6);

    private static final int DEFAULT_COUNT = 0;

    private final int winMoney;
    private final int winCount;

    Rank(int winMoney, int winCount) {
        this.winMoney = winMoney;
        this.winCount = winCount;
    }

    public int winMoney() {
        return this.winMoney;
    }

    public int winCount() {
        return this.winCount;
    }

    public static Rank calculateLottoRank(int winCount) {
        return Arrays.stream(values())
            .filter(rank -> rank.winCount == winCount)
            .findFirst()
            .orElse(Rank.LAST);
    }

    public static Map<Rank, Integer> createRankMap() {
        Map<Rank, Integer> rankMap = new HashMap<>();
        for (Rank rank : values()) {
            rankMap.put(rank, DEFAULT_COUNT);
        }
        return rankMap;
    }

}