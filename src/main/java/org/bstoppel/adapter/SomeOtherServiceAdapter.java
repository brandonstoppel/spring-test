package org.bstoppel.adapter;

import org.bstoppel.onceler.RoundRobinData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeOtherServiceAdapter implements ServiceAdapter {

	private RoundRobinData data;

	public SomeOtherServiceAdapter() {

	}

	@Autowired
	public SomeOtherServiceAdapter(final RoundRobinData robinData) {
		data = robinData;
	}

	@Override
	public String getAdapterName() {
		// TODO Auto-generated method stub
		return "Some Other Service";
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return data.getData();
	}

	@Override
	public void setRoundRobinData(final RoundRobinData data) {
		// TODO Auto-generated method stub
		this.data = data;
	}

}
