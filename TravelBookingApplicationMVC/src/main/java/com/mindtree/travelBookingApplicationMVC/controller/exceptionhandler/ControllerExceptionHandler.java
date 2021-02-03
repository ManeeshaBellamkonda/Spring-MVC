package com.mindtree.travelBookingApplicationMVC.controller.exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.travelBookingApplicationMVC.controller.AppController;
import com.mindtree.travelBookingApplicationMVC.exception.ApplicationException;
import com.mindtree.travelBookingApplicationMVC.exception.BookingAlreadyDoneException;

@ControllerAdvice(assignableTypes = AppController.class)
public class ControllerExceptionHandler extends ApplicationException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ExceptionHandler(BookingAlreadyDoneException.class)
	public ModelAndView serviceExceptionHandler(Exception e,Throwable t)
	{
		ModelAndView modelView=new ModelAndView();
		modelView.addObject("alert",e.getMessage());
		modelView.setViewName("booking");
		return modelView;
		
	}
}
