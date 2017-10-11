package katas;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class FizzBuzzTest {

	private static final String BLANK = " ";

	@Test
	public void testIsDividableByThree() throws Exception {
		assertThat(isDividableByThree(1)).isFalse();
		assertThat(isDividableByThree(3)).isTrue();
	}

	@Test
	public void testIsDividableByFive() throws Exception {
		assertThat(isDividableByFive(3)).isFalse();
		assertThat(isDividableByFive(5)).isTrue();
	}

	@Test
	public void testisDividableByThreeAndFive() throws Exception {
		assertThat(isDividableByThreeAndFive(3)).isFalse();
		assertThat(isDividableByThreeAndFive(5)).isFalse();
		assertThat(isDividableByThreeAndFive(15)).isTrue();
	}

	@Test
	public void testPrintFizz() throws Exception {
		assertThat(convertToFizzOrBuzz(1)).isEqualTo("1");
		assertThat(convertToFizzOrBuzz(3)).isEqualTo("Fizz");
		assertThat(convertToFizzOrBuzz(5)).isEqualTo("Buzz");
		assertThat(convertToFizzOrBuzz(15)).isEqualTo("FizzBuzz");
	}

	@Test
	public void testPrintEverything() throws Exception {
		assertThat(creaateFizzBuzzFrom("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15"))
				.isEqualTo("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz");
	}

	public String creaateFizzBuzzFrom(String input) {
		Integer[] inputAsDigits = createIntArrayFromUserInput(input);
		return convertToFizzOrBuzz(inputAsDigits);
	}

	private String convertToFizzOrBuzz(Integer[] inputAsDigits) {

		Stream<String> result = Arrays.asList(inputAsDigits).stream().map(i -> 
			convertToFizzOrBuzz(i) + " "
		);

		return result.collect(Collectors.joining()).trim();
	}

	private Integer[] createIntArrayFromUserInput(String input) {
		String[] inputAsStrings = input.split(BLANK);
		Integer[] inputAsDigits = new Integer[inputAsStrings.length];

		for (int i = 0; i < inputAsDigits.length; i++) {
			inputAsDigits[i] = Integer.parseInt(inputAsStrings[i]);
		}

		return inputAsDigits;
	}

	private String convertToFizzOrBuzz(int digit) {
		if (isDividableByThreeAndFive(digit)) {
			return "FizzBuzz";
		} else {
			if (isDividableByThree(digit)) {
				return "Fizz";
			}

			if (isDividableByFive(digit)) {
				return "Buzz";
			}
		}
		return "" + digit;
	}

	private boolean isDividableByThreeAndFive(int digit) {
		if (isDividableByThree(digit) && isDividableByFive(digit)) {
			return true;
		}
		return false;
	}

	private boolean isDividableByFive(int digit) {
		if (digit % 5 == 0) {
			return true;
		}
		return false;
	}

	private boolean isDividableByThree(int digit) {
		if (digit % 3 == 0) {
			return true;
		}
		return false;
	}
}
