package katas;

public class Customer {

  private double totalCharge;

  public void rentMovie(int days, Price price) {
    totalCharge += price.getBasePrice();

    if (days > price.getDaysDiscounted()) {
      totalCharge += price.getAdditionalPrice() * (days - price.getDaysDiscounted());
    }
  }

  public double getTotalCharge() {
    return totalCharge;
  }
}
