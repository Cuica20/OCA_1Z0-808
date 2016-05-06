package com.nurkiewicz.rxjava;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.Observable;

import java.util.List;

@Ignore
public class R43_ListeningTest {

	private static final Logger log = LoggerFactory.getLogger(R43_ListeningTest.class);

	@Test
	public void subscribe() throws Exception {
		Observable.from(1, 2, 3, 4, 5).
				map(i -> i * 10).
				map(Object::toString).
				subscribe(log::debug);
	}

	@Test
	public void advancedSubscribe() throws Exception {
		Observable.from(1, 2, 3, 4, 5).
				map(i -> i * 10).
				subscribe(
						(Integer i) -> log.debug("Int: {}", i),
						(Throwable t) -> log.error("Error", t),
						() -> log.debug("Done"));
	}

	@Test
	public void toList() throws Exception {
		final Observable<Integer> from = Observable.from(1, 2, 3, 4, 5);
		final Observable<List<Integer>> listObservable = from.
				map(i -> i * 10).
				toList();
		listObservable.subscribe((List<Integer> i) ->
				log.debug("All: {}", i));
	}

	@Test
	public void blocking() throws Exception {
		Observable.from(1, 2, 3, 4, 5).
				map(i -> i * 10).
				toBlockingObservable().
				forEach(
						i -> log.debug("Int: {}", i));

	}

}
