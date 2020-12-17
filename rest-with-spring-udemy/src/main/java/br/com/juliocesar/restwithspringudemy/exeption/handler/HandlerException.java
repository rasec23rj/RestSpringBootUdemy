package br.com.juliocesar.restwithspringudemy.exeption.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.juliocesar.restwithspringudemy.exeption.ExceptionRespose;
import br.com.juliocesar.restwithspringudemy.exeption.UnsuportedMathOperationMethod;

@ControllerAdvice
@RestController
public class HandlerException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionRespose> handleAllExecptions(Exception ex, WebRequest request) {
		ExceptionRespose exceptionRespose = new ExceptionRespose(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(exceptionRespose, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UnsuportedMathOperationMethod.class)
	public final ResponseEntity<ExceptionRespose> handleBadExecptions(Exception ex, WebRequest request) {
		ExceptionRespose exceptionRespose = new ExceptionRespose(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(exceptionRespose, HttpStatus.BAD_REQUEST);
	}

}
