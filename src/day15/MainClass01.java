package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass01 {
	public static void main(String[] args) throws FileNotFoundException {
		//window + E ; 폴더 열기
		
		// String path = "C:\\오전취업반_허가연\\test\\test.txt";
		// FileOutputStream fos = new FileOutputStream(path);
		/*
		 *  주어진 객체가 가리키는 파일을 쓰기 위한 객체를 생성
		 *  - 해당 위치에 파일이 없는 경우, 새 파일 생성
		 *  - 해당 위치에 파일이 있는 경우, 기존 파일 제거 후 새 파일 생성
		 */
		
		File path = new File("C:\\오전취업반_허가연\\test\\aaa.txt");
		path.mkdir();
		path.exists();
		path.delete();
		// file 이라는 class 형태를 사용 - 객체를 만들어서 객체 생성
		// 보통 이 방식을 이용함
		
		// 두 방식은 파일의 타입이 다르기때문에 서로 가진 기능이 다름
		
		
	}
}
