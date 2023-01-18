package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// #1 Class' Atributes
	private Integer id;
	private String name;


	// #2 Constructors 
	public Department() {
		
	}
	
	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// #3 Getters and Setters
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	// #4 HashCode & Equals  
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}
	
	// #5 toString
	
	@Override
	public String toString() {
		return "Department -> Id = " + id + ", Name = " + name;
	}

	// #6 Serializable
		// implements Serializable
	
	
	
	
}
