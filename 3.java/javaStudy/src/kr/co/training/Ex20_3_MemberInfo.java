package kr.co.training;

public class Ex20_3_MemberInfo {

//	- private 변수 name, age, addr, isStudent를 가진다.
//	- geter/setter
//	- isStudent는 boolean
	public  Ex20_3_MemberInfo(String name, int age, String addr, boolean isStudent) {
		this.name =name;
		this.age = age;
		this.addr = addr;
		this.isStudent = isStudent;
	}
	
	private String name;
	private int age; 
	private String addr;
	private boolean isStudent;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAddr(String addr) {
		this.addr  = addr;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setIsStudent(boolean isStudent) {
		this.isStudent = isStudent;
	}
}
