package priceMatch;

import java.net.URL;
import java.util.HashMap;

public class Book {
	private String ISBN;
	private String title;
	private String author;
	private HashMap<Website,Double> price;
	private HashMap<Website, URL> link;
	
	public Book(String iSBN) {
		super();
		this.ISBN = iSBN;
	}
	

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	public HashMap<Website, Double> getPrice() {
		return this.price;
	}


	public void setPrice(Website website, Double price) {
		this.price.put(website, price);
	}


	public HashMap<Website, URL> getLink() {
		return this.link;
	}


	public void setLink(Website website, URL link) {
		this.link.put(website, link);
	}
	
	public String getISBN(){
		return this.ISBN;
	}
	
	
	
	

}
