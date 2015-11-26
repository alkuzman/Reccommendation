package mk.ukim.finki.iis.model;

public class User {
	
	private Long id;
	private String name;
	private String url;
	private String country;
	
	public User(){
		
	}
	public User(Long id, String name, String url, String country) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.country = country;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
