/**
 * 
 */
package com.spring.aop.cala;

/**
 * @author zhaocc
 *
 */
public class ArchImpllog implements IArch {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.aop.cala.IArch#add(double, double)
	 */
	@Override
	public double add(double a, double b) {
		System.err.println(" this add .............");
		return a + b;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.aop.cala.IArch#sub(double, double)
	 */
	@Override
	public double sub(double a, double b) {
		System.err.println(" this sub .............");
		return a - b;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.aop.cala.IArch#mul(double, double)
	 */
	@Override
	public double mul(double a, double b) {
		System.err.println(" this mul .............");
		return a * b;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.aop.cala.IArch#div(double, double)
	 */
	@Override
	public double div(double a, double b) {
		System.err.println(" this div .............");
		return a / b;
	}

}
