package br.com.juliocesar.restwithspringudemy.Math;

public class SimpleMath {

	public Double suma(double b, double c) {
		
		return  b + c;
	}

	public Double subtraction(double fristNumber, double secondNumber) {
		return fristNumber - secondNumber;
	}

	public Double multiplication(double fristNumber, double secondNumber) {
		return fristNumber * secondNumber;
	}

	public Double division(double fristNumber, double secondNumber) {
		return fristNumber / secondNumber;
	}

	public Double mean(double fristNumber, double secondNumber) {
		return (fristNumber + secondNumber) / 2;
	}

	public Double squareRoot(double fristNumber) {
		return (Double) Math.sqrt(fristNumber);
	}

	
}
