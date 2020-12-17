/**
 * 
 */
package br.com.juliocesar.restwithspringudemy.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.juliocesar.restwithspringudemy.Math.SimpleMath;
import br.com.juliocesar.restwithspringudemy.conversores.NumberConverter;
import br.com.juliocesar.restwithspringudemy.exeption.UnsuportedMathOperationMethod;

@RestController
public class GreetingController {

	private SimpleMath matha = new SimpleMath();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationMethod("somente numeros");
		}
		return matha.suma(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/raiz/{numberOne}", method = RequestMethod.GET)
	public Double raiz(@PathVariable("numberOne") String numberOne) throws Exception {
		if (!NumberConverter.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationMethod("somente numeros");
		}
		return matha.squareRoot(NumberConverter.convertToDouble(numberOne));

	}

}
