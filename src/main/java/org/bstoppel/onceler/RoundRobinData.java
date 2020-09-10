package org.bstoppel.onceler;

import java.util.Arrays;

import org.bstoppel.util.RoundRobininator;

public class RoundRobinData {
	private static final RoundRobinData INSTANCE = new RoundRobinData();

	private RoundRobininator<String> data;

	private RoundRobinData() {

	}

	public static RoundRobinData getInstance() {
		return INSTANCE;
	}


	public void setData(final String data) {
		final var array = data.split(",");
		this.data = new RoundRobininator<>(Arrays.asList(array));
	}

	public String getData() {
		return data.next();
	}
}
