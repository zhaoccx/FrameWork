/**
 * 
 */
package com.spring.demo.spel;

/**
 * @author zhaocc
 *
 */
public class Fash {
	private String coler;
	private int size;

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
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * 
	 */
	public Fash() {
		super();
	}

	/**
	 * @param coler
	 * @param size
	 */
	public Fash(String coler, int size) {
		super();
		this.coler = coler;
		this.size = size;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fash [coler=" + coler + ", size=" + size + "]";
	}

}
