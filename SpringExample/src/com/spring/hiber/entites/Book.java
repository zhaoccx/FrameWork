/**
 * 
 */
package com.spring.hiber.entites;

/**
 * @author zhaocc
 *
 */
public class Book {
	private Integer id;
	private String bookName;
	private String isbn;
	private int price;
	private int stock;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * @param bookName
	 *            the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn
	 *            the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock
	 *            the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * 
	 */
	public Book() {
		super();
	}

	/**
	 * @param id
	 * @param bookName
	 * @param isbn
	 * @param price
	 * @param stock
	 */
	public Book(Integer id, String bookName, String isbn, int price, int stock) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.isbn = isbn;
		this.price = price;
		this.stock = stock;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", isbn=" + isbn + ", price=" + price + ", stock=" + stock + "]";
	}

}
