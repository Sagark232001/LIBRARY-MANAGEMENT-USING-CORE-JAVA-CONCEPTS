package edu.qsp.lms.model;

public class Book {
	private String bookAuthor;
	private String bookName;
	private double bookPrice;
	private String publication;
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication=publication;
	}
	@Override
	public String toString() {
		return "Book [bookAuthor=" + bookAuthor + ", bookName=" + bookName + ", bookPrice=" + bookPrice
				+ ", Publication=" + publication + "]";
	}
	
	
	
}
