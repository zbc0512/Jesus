/*
 * Holy Bible, Chinese Union Version (GB), Textfile 20010201.
 */
package io.zbc.jesus.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "HolyBibleHGB")
public class HolyBibleHGB {

	private String book;
	private String chapter;
	private String verse;
	private String scripture;

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public String getVerse() {
		return verse;
	}

	public void setVerse(String verse) {
		this.verse = verse;
	}

	public String getScripture() {
		return scripture;
	}

	public void setScripture(String scripture) {
		this.scripture = scripture;
	}

}
