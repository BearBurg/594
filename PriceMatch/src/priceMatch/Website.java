package priceMatch;

public enum Website {
	AMAZON("Amazon"),TEXTBOOKS("Textbooks.com");
	
	private String websiteName;
	
	Website(String websiteName){
		this.websiteName = websiteName;
	}
	
	public String getWebsiteName(){
		return websiteName;
	}

}
