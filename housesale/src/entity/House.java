package entity;

public class House {
private int houno;
private String type;

public House() {
	
}
public House(int houno, String type) {
	super();
	this.houno = houno;
	this.type = type;
}
public int getHouno() {
	return houno;
}
public void setHouno(int houno) {
	this.houno = houno;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
