package org.bstoppel.adapter;

import org.bstoppel.onceler.RoundRobinData;

public interface ServiceAdapter {
	String getAdapterName();

	String getData();

	void setRoundRobinData(RoundRobinData data);
}
