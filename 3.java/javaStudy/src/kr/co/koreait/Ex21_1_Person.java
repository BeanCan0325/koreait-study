package kr.co.koreait;

public class Ex21_1_Person {
	private int age;
	private String name;
	private String addr;
	private boolean isStudent;
	
//(개념)	
//	[Setter] 
//	- 반환타입은 일반적으로 void (반환필요없음)
//	- 메서드명: set필드명
//	- 매개변수에 받아서 필드에 집어넣는
	public void setAge(int age) {
		this.age = age;
	}
	
//	[Getter]
//	 - 메서드명 : get필드명
	public int getAge() {
		return age;
		}
		
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setIsStudent(boolean isStudent) {
		this.isStudent = isStudent;
	}
	
	public Boolean getIsStudent() {
		return isStudent;
	}

	}

