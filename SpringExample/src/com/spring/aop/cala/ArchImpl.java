/**
 * 
 */
package com.spring.aop.cala;

/**
 * @author zhaocc
 *
 */
public class ArchImpl implements IArch {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.aop.cala.IArch#add(double, double)
	 */
	@Override
	public double add(double a, double b) {
		return a + b;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.aop.cala.IArch#sub(double, double)
	 */
	@Override
	public double sub(double a, double b) {
		return a - b;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.aop.cala.IArch#mul(double, double)
	 */
	@Override
	public double mul(double a, double b) {
		return a * b;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.aop.cala.IArch#div(double, double)
	 */
	@Override
	public double div(double a, double b) {
		return a / b;
	}

}
