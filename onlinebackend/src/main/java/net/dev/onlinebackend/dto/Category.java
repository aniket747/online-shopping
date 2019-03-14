package net.dev.onlinebackend.dto;

/**
 * @author aniket747
 * category class
 * DTO
 */
public class Category {

	/*private fields;*/
	private int id;
	private String name;
	private String desccription;
	private String imageURL;
	private boolean active = true; // admin will have right to deactivate the category,
									// as we are not going to delete any category directly.
	
	
	
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
	public String getDesccription() {
		return desccription;
	}
	public void setDesccription(String desccription) {
		this.desccription = desccription;
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
	
}
