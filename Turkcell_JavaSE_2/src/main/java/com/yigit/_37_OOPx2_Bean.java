package com.yigit;

import java.io.Serializable;
import java.util.Objects;

// Bena = POJO Plain Old Java Object + constructor + serializable + toString
// Javada bütün class'larýn atasý objedir
public class _37_OOPx2_Bean implements Serializable {
	
	// serializable : Java'ya burda diyoruz ki bütün iþleri san veriyoruz sen kendi
		// serialVersionUID oluþtur.
	private static final long serialVersionUID = 1L;
	
	// Nesne deðiþkenleri
	private String name;
	private String surname;
	
	public String getName() {
		return name;
	}
	
	// parametresiz constructor
	public _37_OOPx2_Bean() {
		
	}
	
	// parametreli constructor
	public _37_OOPx2_Bean(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	
	public _37_OOPx2_Bean(String name) {
		this.name = name;
	}
	
	// toString()==> bu class new ile oluþturduðumuzda classý çaðýrdýðýmýzda
	// verilerin hepsi gelir
	@Override
	public String toString() {
		return "_37_OOPx2_Bean [name=" + name + ", surname=" + surname + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, surname);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		_37_OOPx2_Bean other = (_37_OOPx2_Bean) obj;
		return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}
	
	// Method -1
	public void fullName() {
		System.out.println(this.name + this.surname);
	}
	
	// getter and setter
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
