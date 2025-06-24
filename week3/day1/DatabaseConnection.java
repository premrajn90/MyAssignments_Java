package week3.day1;

public interface DatabaseConnection {
	abstract void connect(); // to connect with jDBC
	abstract void disconnect(); // to disconnect with jdbc
	abstract void exucuteUpdate(); // to execute the updated data in jdbc
	
	
	

}
