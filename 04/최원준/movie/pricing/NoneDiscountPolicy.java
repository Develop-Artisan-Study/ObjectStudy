package chapter04.movie.pricing;

import chapter04.movie.DiscountPolicy;
import chapter04.movie.Money;
import chapter04.movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
