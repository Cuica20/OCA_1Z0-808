package com.nurkiewicz.java8.holidays;

import org.junit.Test;

import java.util.Locale;

import static org.fest.assertions.api.Assertions.assertThat;

public class HolidaysFactoryTest {

	@Test
	public void shouldReturnPolishHolidays() {
		//given
		final Locale poland = new Locale("pl", "PL");

		//when
		final Holidays holidays = HolidaysFactory.of(poland);

		//then
		assertThat(holidays).isInstanceOf(PolishHolidays.class);
	}

	@Test
	public void shouldReturnAmericanHolidays() {
		//given
		final Locale america = Locale.US;

		//when
		final Holidays holidays = HolidaysFactory.of(america);

		//then
		assertThat(holidays).isInstanceOf(AmericanHolidays.class);
	}

}