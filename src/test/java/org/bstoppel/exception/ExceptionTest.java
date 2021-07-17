package org.bstoppel.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

	private <T extends Exception> void excpetionTest(final Class<T> clazz) throws Exception {
		final var obj = clazz.getConstructor(String.class).newInstance("test");

		Assertions.assertEquals("test", obj.getMessage());
	}

	@Test
	public void serviceExceptionTest() throws Exception {
		excpetionTest(ServiceException.class);
	}

	@Test
	public void notImplementedExceptionTest() throws Exception {
		excpetionTest(NotImplementedException.class);
	}

}
