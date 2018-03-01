package katas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

  private Customer customer;

  @BeforeEach
  public void setUp() throws Exception {
    customer = new Customer();
  }

  @Test
  public void rentMovieCategoryAForADay() throws Exception {

    //When
    customer.rentMovie(1, Price.CATEGORY_A);

    //Then
    assertThat(customer.getTotalCharge()).isEqualTo(2.00);
  }

  @Test
  public void rentMovieCategoryAForMaxDaysWithBasePrice() throws Exception {

    //When
    customer.rentMovie(2, Price.CATEGORY_A);

    //Then
    assertThat(customer.getTotalCharge()).isEqualTo(2.00);
  }

  @Test
  public void testRentMovieCategoryAForFirstDayWithExtraCosts() throws Exception {

    //When
    customer.rentMovie(3, Price.CATEGORY_A);

    //Then
    assertThat(customer.getTotalCharge()).isEqualTo(3.75);
  }

  @Test
  public void testRentMovieCategoryAForAnyDaysWithExtraCosts() throws Exception {

    //When
    customer.rentMovie(5, Price.CATEGORY_A);

    //Then
    assertThat(customer.getTotalCharge()).isEqualTo(7.25);
  }

  @Test
  public void testRentMovieCategoryBForADay() throws Exception {

    //When
    customer.rentMovie(1, Price.CATEGORY_B);

    //Then
    assertThat(customer.getTotalCharge()).isEqualTo(1.50);
  }

  @Test
  public void rentMovieCategoryBForMaxDaysWithBasePrice() throws Exception {

    //When
    customer.rentMovie(3, Price.CATEGORY_B);

    //Then
    assertThat(customer.getTotalCharge()).isEqualTo(1.50);
  }

  @Test
  public void testRentMovieCategoryBForFirstDayWithExtraCosts() throws Exception {

    //When
    customer.rentMovie(4, Price.CATEGORY_B);

    //Then
    assertThat(customer.getTotalCharge()).isEqualTo(3.00);
  }

  @Test
  public void testRentMovieCategoryBForAnyDaysWithExtraCosts() throws Exception {

    //When
    customer.rentMovie(5, Price.CATEGORY_B);

    //Then
    assertThat(customer.getTotalCharge()).isEqualTo(4.50);
  }
}
