package chapter02.movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
