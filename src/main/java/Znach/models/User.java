package Znach.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class User {

	@Id
	  @GeneratedValue
	  private Long id;
	
    @NotNull
    @Size(min=2, max=30)
    private String first_name;
    
    @NotNull
    @Size(min=2, max=30)
    private String last_name;
    
    @NotNull
    @Column(unique = true)
    private String email;
    
    @NotNull
    private String pass;

    public User() {}
    
	public User(String first_name, String last_name, String email, String pass) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.pass = pass;
	}

	public Long getId() {
		return id;
	}


	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

 
    
  
    
    
}