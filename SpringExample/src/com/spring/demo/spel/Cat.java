/**
 * 
 */
package com.spring.demo.spel;

/**
 * @author zhaocc
 *
 */
public class Cat {
	private String coler;

	private int weight;

	private double oooo;

	/**
	 * @return the coler
	 */
	public String getColer() {
		return coler;
	}

	/**
	 * @param coler
	 *            the coler to set
	 */
	public void setColer(String coler) {
		this.coler = coler;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the oooo
	 */
	public double getOooo() {
		return oooo;
	}

	/**
	 * @param oooo
	 *            the oooo to set
	 */
	public void setOooo(double oooo) {
		this.oooo = oooo;
	}

	/**
	 * 
	 */
	public Cat() {
		super();
	}

	/**
	 * @param coler
	 * @param weight
	 */
	public Cat(String coler, int weight) {
		super();
		this.coler = coler;
		this.weight = weight;
	}

	/**
	 * @param coler
	 * @param weight
	 * @param oooo
	 */
	public Cat(String coler, int weight, double oooo) {
		super();
		this.coler = coler;
		this.weight = weight;
		this.oooo = oooo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat [coler=" + coler + ", weight=" + weight + ", oooo=" + oooo + "]";
	}

}
