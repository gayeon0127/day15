package day15;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainClass06 implements CommonPath {
	public static void main(String[] args) throws Exception {
		TestClass06 t = new TestClass06();
		t.setName("홍길동");
		t.setAge(20);
		
		// File path = new File("C:/오전취업반_허가연/test/test.txt");
		// => 공통으로 사용하는 파일
		// ==> interface 파일로 공통파일을 형성하여 implements
		
		
		FileOutputStream fos = new FileOutputStream(path); 
		// FileOutputStream fos = new FileOutputStream(CommonPath.path); 
		
		// String path = CommonPath.path;
		// FileOutputStream fos = new FileOutputStream(path); 
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		// 스트림에 객체를 저장하는 기능이 없기 때문에 객체를 저장하는 스트림 이용
		oos.writeObject(t);
		// byte형식으로 객체 정보가 저장됨.
		oos.close();
		bos.close();
		fos.close();
	}
}
