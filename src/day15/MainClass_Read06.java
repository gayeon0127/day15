package day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

//저장한 객체를 읽어오는 클래스
public class MainClass_Read06 implements CommonPath{
	public static void main(String[] args) throws Exception {
		// File path = new File("C:/오전취업반_허가연/test/test.txt");
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		// Object o = ois.readObject();
		// TestClass06 t = (TestClass06)o;
		// 결과값을 object타입으로 읽어옴
		TestClass06 t = (TestClass06)ois.readObject();
		// TestClass06의 기능을 사용하기 위해 TestClass06의 형태로 형 변환
		
		
		System.out.println("나이 : " + t.getName());
		System.out.println("이름 : " + t.getAge());
		
		ois.close();
		bis.close();
		fis.close();
	}
}
