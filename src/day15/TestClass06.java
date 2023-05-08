package day15;

import java.io.Serializable;

public class TestClass06 implements Serializable{
									// 직렬화 ; 객체를 byte형식으로 변환
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
