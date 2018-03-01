package katas;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

  private Customer customer;

  @Before
  public void setUp() throws Exception {
    customer = new Customer();
  }

  @Test
  public void rentMovieForADay() throws Exception {

    //When
    customer.rentMovie(1);

    //Then
    assertThat(customer.getTotalCharge()).isEqualTo(2.00);
  }

  @Test
  public void rentMovieForMaxDaysWithBasePrice() throws Exception {

    //When
    customer.rentMovie(2);

    //Then
    assertThat(customer.getTotalCharge()).isEqualTo(2.00);
  }

  @Test
  public void testRentMovieForFirstDayWithExtraCosts() throws Exception {

    //When
    customer.rentMovie(3);
    //Then
    assertThat(customer.getTotalCharge()).isEqualTo(3.75);
  }

  @Test
  public void testRentMovieForAnyDaysWithExtraCosts() throws Exception {

    //When
    customer.rentMovie(5);
    //Then
    assertThat(customer.getTotalCharge()).isEqualTo(7.25);
  }
}
