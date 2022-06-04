package chapter02.movie.pricing;

import chapter02.movie.DiscountCondition;
import chapter02.movie.DiscountPolicy;
import chapter02.movie.Money;
import chapter02.movie.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
