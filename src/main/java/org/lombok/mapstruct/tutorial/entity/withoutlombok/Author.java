package org.lombok.mapstruct.tutorial.entity.withoutlombok;

import java.io.Serializable;

public class Author implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String name;
    private String email;
    private char gender;

    public Author() {

    }

    public Author(String name, String email, char gender) {
	this.name = name;
	this.email = email;
	this.gender = gender;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public char getGender() {
	return gender;
    }

    public void setGender(char gender) {
	this.gender = gender;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Author other = (Author) obj;
	if (email == null) {
	    if (other.email != null)
		return false;
	} else if (!email.equals(other.email))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	return true;
    }

    public String toString() {
	return "Author [name:" + this.name + ", gender:" + this.gender + ", email:" + this.email + "]";
    }
}