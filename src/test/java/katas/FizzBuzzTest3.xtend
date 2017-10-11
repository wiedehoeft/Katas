package katas

import org.junit.Before
import org.junit.Test

import static org.assertj.core.api.Assertions.assertThat

class FizzBuzzTest3 {

	var FizzBuzzConverter fizzBuzzConverter

	@Before
	def void before() {
		fizzBuzzConverter = new FizzBuzzConverter()
	}

	@Test
	def void testConversion() {
		assertThat(fizzBuzzConverter.printToFizzBuzz("1")).isEqualTo("1")
		assertThat(fizzBuzzConverter.printToFizzBuzz("3")).isEqualTo("Fizz")
		assertThat(fizzBuzzConverter.printToFizzBuzz("5")).isEqualTo("Buzz")
		assertThat(fizzBuzzConverter.printToFizzBuzz("15")).isEqualTo("FizzBuzz")
	}

	@Test
	def void printFizzBuzzString() {
		assertThat(fizzBuzzConverter.printToFizzBuzz("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15")).isEqualTo(
			"1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz")
	}

	static class FizzBuzzConverter {

		def String printToFizzBuzz(String input) {
			return input.withoutBlanks.map [
				it.asInteger.convert
			].join(" ")
		}

		private def withoutBlanks(String string) {
			string.split(" ")
		}

		private def asInteger(String string) {
			Integer.parseInt(string)
		}

		private def String convert(int i) {

			if (i % 3 == 0 && i % 5 == 0) {
				return "FizzBuzz"
			}

			if (i % 3 == 0) {
				return "Fizz"
			}
			if (i % 5 == 0) {
				return "Buzz"
			}
			return "" + i
		}
	}
}
