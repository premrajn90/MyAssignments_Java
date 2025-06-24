package week3.day1;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("To connect database with JavaDatabase");
		
	}

	@Override
	public void disconnect() {
		System.out.println("To disconnect database with JavaDatabase");
		
	}

	@Override
	public void exucuteUpdate() {
		System.out.println("To update and execute Java database");
		
	}
      public static void main(String[] args) {
    	  JavaConnection db = new JavaConnection();
    	  db.connect();
    	  db.exucuteUpdate();
    	  db.disconnect();
}
}
