package com.nurkiewicz.rxjava;

import com.nurkiewicz.rxjava.weather.Weather;
import com.nurkiewicz.rxjava.weather.WeatherStation;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.Observable;
import rx.Subscription;

import java.util.concurrent.TimeUnit;

@Ignore
public class R41_IntroductionTest {

	private static final Logger log = LoggerFactory.getLogger(R41_IntroductionTest.class);

	final WeatherStation station = WeatherStation.find("WAW");
	final Observable<Weather> observable = station.observations();

	/**
	 * Observable.subscribe()
	 */
	@Test
	public void subscribingToObservable() throws InterruptedException {
		final Subscription subscription =
				observable.subscribe((Weather w) ->
								log.debug("Weather changed: {}", w.getTemperature())
				);

		TimeUnit.SECONDS.sleep(10);
		subscription.unsubscribe();
	}

	/**
	 * - map() and filter()
	 * - show immutability
	 */
	@Test
	public void mapAndFilter() {
		final Observable<Float> temperatures = observable.
				map(Weather::getTemperature);

		final Observable<Float> highTemp = temperatures.filter(t -> t > 30.0);
		final Observable<Float> lowTemp = temperatures.filter(t -> t < 15.0);
	}

}

