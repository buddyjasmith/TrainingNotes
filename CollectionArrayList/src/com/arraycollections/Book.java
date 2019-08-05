package com.arraycollections;

public class Book {
	private int bookID;
	private int bookPrice;
	public Book(int bookID, int bookPrice) {
		super();
		this.bookID = bookID;
		this.bookPrice = bookPrice;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookPrice=" + bookPrice + "]";
	}
	
}	
