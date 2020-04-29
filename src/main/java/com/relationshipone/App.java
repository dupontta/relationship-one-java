package com.relationshipone;

import com.fasterxml.jackson.annotation.JsonProperty;

public class App {
	@JsonProperty("id")
	private int id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("documentationUrl")
	private String documentationUrl;
	@JsonProperty("globalId")
	private String globalId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocumentationUrl() {
		return documentationUrl;
	}

	public void setDocumentationUrl(String documentationUrl) {
		this.documentationUrl = documentationUrl;
	}

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}
	
	@Override
	public String toString() {
		String str = "App Name: " + this.name;
		if (this.documentationUrl != null && this.documentationUrl != "") {
			str += "\nDocumentation URL: " + this.documentationUrl;
		}
		return str;
	}

}
