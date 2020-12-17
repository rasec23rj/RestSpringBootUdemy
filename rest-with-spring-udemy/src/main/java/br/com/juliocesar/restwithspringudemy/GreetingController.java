/**
 * 
 */
package br.com.juliocesar.restwithspringudemy;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jt
 *
 */

@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@RequestMapping(value="/sum/numberOne/numberTwo", method=RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new Exception();
		}
		Double sum = convertToDouble(numberOne)  + convertToDouble(numberTwo);
		return 1D;
	}

	private Double convertToDouble(String numberOne) {
		// TODO Auto-generated method stub
		return 1D;
	}

	private boolean isNumeric(String number) {
		// TODO Auto-generated method stub
		return false;
	}

}
