package day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class MainClass02 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:/오전취업반_허가연/test/test.txt");
		// File 클래스 : 파일 및 디렉토리를 관리할 수 있도록 기능을 제공해주는 클래스
		
		FileOutputStream fos = new FileOutputStream(path, true); 
		// ,true ; 이어쓰기
		fos.write(97); // 아스키코드 소문자 a
		fos.write(65); // 아스키코드 소문자 A
		fos.write('B');
		// 해당 위치에 쓰는 것 
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		// 주어진 객체가 가리키는 파일을 읽기 위한 객체를 생성.
		System.out.println(fis.read());
		// 한번에 하나씩 읽어옴
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		fis.close();
	}
}
