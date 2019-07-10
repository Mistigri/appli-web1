package com.gk.config;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class BalisesPerso extends SimpleTagSupport{
	
	private String firstName, lastName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().println("Bienvenue "+ getFirstName() + " "+ getLastName());
	}

}
