package br.com.juliocesar.restwithspringudemy.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationMethod  extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	public UnsuportedMathOperationMethod(String execption) {
		super(execption);
	}

	
	
}
