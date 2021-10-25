import java.util.ArrayList;
import java.util.UUID;

public class AdminList {
  private static AdminList admins = null;

  private static ArrayList<Admin> adminsList = new ArrayList<>();

  private AdminList() {
    adminsList = DataLoader.loadAdmins();
  }
  public static AdminList getInstance() {
	if(admins == null) {
		admins = new AdminList();
	}
	
	return admins;
}

public ArrayList<Admin> getStudentList() {
	return adminsList;
}

public void addStudent(String id, String firstName, String lastName, String userName, String password, String email, String phoneNumber, String major) {
	adminsList.add(new Admin(id, firstName, lastName, userName, password, email, phoneNumber));
}

public void logout(){
	DataWriter.savePeople();
}
}