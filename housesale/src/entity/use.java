package entity;

public class use {
private int id;
private String password;
public use() {

}
public use(int id, String password) {
	super();
	this.id = id;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
