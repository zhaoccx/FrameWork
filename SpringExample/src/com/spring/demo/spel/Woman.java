/**
 * 
 */
package com.spring.demo.spel;

/**
 * @author zhaocc
 *
 */
public class Woman {
	private String name;
	private String coler;
	private Cat cat;
	private Fash fash;
	private double cyscole;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

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
	 * @return the cat
	 */
	public Cat getCat() {
		return cat;
	}

	/**
	 * @param cat
	 *            the cat to set
	 */
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	/**
	 * @return the fash
	 */
	public Fash getFash() {
		return fash;
	}

	/**
	 * @param fash
	 *            the fash to set
	 */
	public void setFash(Fash fash) {
		this.fash = fash;
	}

	/**
	 * @return the cyscole
	 */
	public double getCyscole() {
		return cyscole;
	}

	/**
	 * @param cyscole
	 *            the cyscole to set
	 */
	public void setCyscole(double cyscole) {
		this.cyscole = cyscole;
	}

	/**
	 * 
	 */
	public Woman() {
		super();
	}

	/**
	 * @param name
	 * @param coler
	 * @param cat
	 * @param fash
	 */
	public Woman(String name, String coler, Cat cat, Fash fash) {
		super();
		this.name = name;
		this.coler = coler;
		this.cat = cat;
		this.fash = fash;
	}

	/**
	 * @param name
	 * @param coler
	 * @param cat
	 * @param fash
	 * @param cyscole
	 */
	public Woman(String name, String coler, Cat cat, Fash fash, double cyscole) {
		super();
		this.name = name;
		this.coler = coler;
		this.cat = cat;
		this.fash = fash;
		this.cyscole = cyscole;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Woman [name=" + name + ", coler=" + coler + ", cat=" + cat + ", fash=" + fash + ", cyscole=" + cyscole + "]";
	}

}
