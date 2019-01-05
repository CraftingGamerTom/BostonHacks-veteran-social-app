package hack.veteran_app.common.veteran_app_common.entities.lists;

import java.util.List;

import hack.veteran_app.common.veteran_app_common.entities.User;

public class UserList {

	private List<User> users;

	public UserList(List<User> users) {
		super();
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
