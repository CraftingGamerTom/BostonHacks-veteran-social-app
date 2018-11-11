package hack.veteran_app.common.veteran_app_common.entities;

public class User {
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private long id;
	private String password;
	private char[] bio;
	
	/**
	 * Represent a user with firstName, lastName, email, id, password
	 * @param firstName 
	 * @param lastName
	 * @param email
	 * @param id
	 * @param password
	 */
	public User(String userName, String firstName, String lastName, String email, long id, String password) {
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.id = id;
		this.password = password;
		this.bio = new char[32];
	}
	
	/**
	 * Return the user first name
	 * @return the user first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Return the user last name
	 * @return the user last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Return the user email
	 * @return the user email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Return the user id
	 * @return the user id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Return the user password
	 * @return the user password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Set the user first name
	 * @param the user first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Set the user last name
	 * @param the user last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Set the user email
	 * @param the user email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Set the user id
	 * @param the user id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Set the user password
	 * @param the user password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "User [name: " + firstName + " " + lastName + " User Name: " + userName + "]";
	}
	
	/** 
	 * Users are equal *only* if their user id are equal
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (userName != other.userName)
			return false;
		return true;
	}
}
