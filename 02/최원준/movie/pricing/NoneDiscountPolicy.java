package chapter02.movie.pricing;

import chapter02.movie.DiscountPolicy;
import chapter02.movie.Money;
import chapter02.movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
