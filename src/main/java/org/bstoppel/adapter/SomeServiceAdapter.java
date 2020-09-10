package org.bstoppel.adapter;

import org.bstoppel.onceler.RoundRobinData;

public class SomeServiceAdapter implements ServiceAdapter {

	@Override
	public String getAdapterName() {
		// TODO Auto-generated method stub
		return "Some Service";
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return "Some Data";
	}

	@Override
	public void setRoundRobinData(final RoundRobinData data) {
		// TODO Auto-generated method stub

	}

}
