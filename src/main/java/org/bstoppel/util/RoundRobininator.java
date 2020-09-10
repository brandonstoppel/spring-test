package org.bstoppel.util;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobininator<T> {

	private final AtomicInteger counter = new AtomicInteger();
	private List<T> list;

	public RoundRobininator() {

	}

	public RoundRobininator(final List<T> list) {
		this.setList(list);
	}

	public void setList(final List<T> list) {
		// This ensures that we always start at zero.
		counter.set(list.size());
		this.list = Collections.unmodifiableList(list);
	}

	public T next() {
		final var choice = counter.incrementAndGet() % list.size();
		return list.get(choice);
	}
}
