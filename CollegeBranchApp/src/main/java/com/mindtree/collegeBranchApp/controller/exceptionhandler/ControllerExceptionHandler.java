package com.mindtree.collegeBranchApp.controller.exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.collegeBranchApp.controller.AppController;
import com.mindtree.collegeBranchApp.exception.ApplicationException;
import com.mindtree.collegeBranchApp.exception.BrandSizeExceededException;

@ControllerAdvice(assignableTypes = AppController.class)
public class ControllerExceptionHandler extends ApplicationException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ExceptionHandler(BrandSizeExceededException.class)
	public ModelAndView serviceExceptionHandler(Exception e,Throwable t)
	{
		ModelAndView modelView=new ModelAndView();
		modelView.addObject("alert",e.getMessage());
		modelView.setViewName("branch");
		return modelView;
		
	}
}
