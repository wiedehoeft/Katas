package katas;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

  enum TestParams {
    /*Category A */
    rentForOneDay(1, Price.CATEGORY_A, 2.00),
    rentForMaxDaysWithBasePrice(2, Price.CATEGORY_A, 2.00),
    rentForFirstDayWithExtraCosts(3, Price.CATEGORY_A, 3.75),
    rentForAnyDaysWithExtraCosts(5, Price.CATEGORY_A, 7.25),

    /*Category B */
    rentForOneDayB(1, Price.CATEGORY_B, 1.50),
    rentForMaxDaysWithBasePriceB(3, Price.CATEGORY_B, 1.50),
    rentForFirstDayWithExtraCostsB(4, Price.CATEGORY_B, 3.00),
    rentForAnyDaysWithExtraCostsB(5, Price.CATEGORY_B, 4.50);

    final int days;
    final Price price;
    final double expectedCharge;

    TestParams(int days, Price price, double expectedCharge) {
      this.days = days;
      this.price = price;
      this.expectedCharge = expectedCharge;
    }
  }

  @ParameterizedTest
  @EnumSource(TestParams.class)
  void rentMovies(TestParams testParams) {
    // Given
    Customer customer = new Customer();

    // When
    customer.rentMovie(testParams.days, testParams.price);

    // Then
    assertThat(customer.getTotalCharge()).isEqualTo(testParams.expectedCharge);
  }
}
