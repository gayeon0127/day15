package day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainClass03 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:/오전취업반_허가연/test/test.txt");
		FileInputStream fis = new FileInputStream(path);
		
		while(true) {
			int ch = fis.read();
			if(ch==-1) {
				// -1 ; 파일의 끝에 자동으로 추가되는 값으로
				// 파일의 끝까지 읽었다면 break
				System.out.println("ch : " + ch);
				break;
			}
			System.out.println((char)ch);
		}
			
	}
}
