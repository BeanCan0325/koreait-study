package kr.co.koreait;

public class Ex26_1_BookInfo {
	
	private String title;
	private String author;
	
	Ex26_1_BookInfo(){
	}
	
	Ex26_1_BookInfo(String title, String author){
		this.title = title;
		this.author = author;
	}
	
//	----- getter
	
	String getTitle() {
		return title;
	}
	
	String getAuthor() {
		return author;
	}
//	------- add()
	void add(String title, String author) {
		this.title = title;
		this.author = author;
	}

}
