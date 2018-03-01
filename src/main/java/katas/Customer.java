package katas;

public class Customer {

  private static final double BASE_PRICE = 2.00;
  private static final int DAYS_DISCOUNTED = 2;
  private static final double ADDITIONAL_PRICE = 1.75;
  private double totalCharge;

  public void rentMovie(int days) {
    totalCharge += BASE_PRICE;

    if (days > DAYS_DISCOUNTED) {
      totalCharge += ADDITIONAL_PRICE * (days - DAYS_DISCOUNTED);
    }
  }

  public double getTotalCharge() {
    return totalCharge;
  }
}
