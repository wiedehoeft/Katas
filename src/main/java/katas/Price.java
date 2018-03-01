package katas;

public enum Price {

  CATEGORY_A(2.00, 1.75, 2), CATEGORY_B(1.50, 1.50, 3);

  private final double basePrice;
  private final double additionalPrice;
  private final int daysDiscounted;

  Price(double basePrice, double additionalPrice, int daysDiscounted) {
    this.basePrice = basePrice;
    this.additionalPrice = additionalPrice;
    this.daysDiscounted = daysDiscounted;
  }

  public double getBasePrice() {
    return basePrice;
  }

  public double getAdditionalPrice() {
    return additionalPrice;
  }

  public int getDaysDiscounted() {
    return daysDiscounted;
  }
}
