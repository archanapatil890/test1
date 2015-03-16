package gs.dzee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name="MEMBER")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})  
public class Member implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5055553831730735624L;
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
