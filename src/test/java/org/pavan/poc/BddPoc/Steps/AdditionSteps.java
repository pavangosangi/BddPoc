package org.pavan.poc.BddPoc.Steps;

import net.thucydides.core.annotations.Step;

public class AdditionSteps {
	
	private int result;
	private int a;
	private int b;
	
	@Step
	public void add() {
		this.result = this.a+this.b;
	}

	public int getResult() {
		return result;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}
