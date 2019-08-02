package com.mphasis.package1;

public class Book {
	//
	private int ISBN;
	private String bookTitle;
	private int bookPrice;
	//Parameterized constructor
	//Static Poly morphism: different constructors
	
	public Book() {
		super();
	}
	
	public Book(int iSBN, String bookTitle, int bookPrice) {
		super();	//Inheritance constructor
		this.ISBN = iSBN;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + ISBN + ", bookTitle = " + bookTitle
				+ ", bookPrice=" + bookPrice + "]";
	}

}
