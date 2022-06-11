package chapter04.movie;

public class Reservation {
    private Customer customer;
    private chapter04.movie.Screening Screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, chapter04.movie.Screening Screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.Screening = Screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public chapter04.movie.Screening getScreening() {
        return Screening;
    }

    public void setScreening(chapter04.movie.Screening screening) {
        Screening = screening;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public int getAudienceCount() {
        return audienceCount;
    }

    public void setAudienceCount(int audienceCount) {
        this.audienceCount = audienceCount;
    }
}
