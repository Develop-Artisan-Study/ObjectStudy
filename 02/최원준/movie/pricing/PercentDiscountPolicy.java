package chapter02.movie.pricing;

import chapter02.movie.DiscountCondition;
import chapter02.movie.DiscountPolicy;
import chapter02.movie.Money;
import chapter02.movie.Screening;

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
