package shoppingbackend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.springframework.stereotype.Component;


@Entity // use persistence class import and every entity need to have an id because it will be used in a query instead of the table name.
public class Category {
  /*creating private fields*/
	@Id //  due to @entity
	@GeneratedValue(strategy=GenerationType.IDENTITY) // for autoIncrement of the id field as IDENTITY
	private int id;
	private String name;
	private String description;
	
	@Column(name="img_URL")
	private String imageURL;
	
	@Column(name="is_active")
	private boolean active=true;
	
	
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", imageURL=" + imageURL
				+ ", active=" + active + "]";
	}
	
	
	
	
}
