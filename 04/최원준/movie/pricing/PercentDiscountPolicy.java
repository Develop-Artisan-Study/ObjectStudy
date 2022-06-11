package chapter04.movie.pricing;

import chapter04.movie.DiscountCondition;
import chapter04.movie.DiscountPolicy;
import chapter04.movie.Money;
import chapter04.movie.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
