package chapter04.movie.pricing;

import chapter04.movie.DiscountCondition;
import chapter04.movie.DiscountPolicy;
import chapter04.movie.Money;
import chapter04.movie.Screening;

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
