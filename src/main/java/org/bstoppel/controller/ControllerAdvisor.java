package org.bstoppel.controller;

import javax.servlet.http.HttpServletRequest;

import org.bstoppel.exception.NotImplementedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ControllerAdvisor {

	@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
	@ExceptionHandler(NotImplementedException.class)
	public void handleUnimplemented() {
		// Not implemented
	}

	@ExceptionHandler(Exception.class)
	public ModelAndView handleError(final HttpServletRequest req, final Exception ex) {
		final var mav = new ModelAndView();
		mav.addObject("exception", ex);
		mav.addObject("url", req.getRequestURL());
		mav.setViewName("error");
		return mav;
	}

}
