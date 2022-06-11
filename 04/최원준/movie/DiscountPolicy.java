package chapter04.movie;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
