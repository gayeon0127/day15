package day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:/오전취업반_허가연/test/test.txt");
		FileOutputStream fos = new FileOutputStream(path); 
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		// 보조스트림 
		
		System.out.println("출력 내용 입력");
		String n = new Scanner(System.in).next();
		
		dos.writeUTF(n);
		
		dos.close();
		bos.close();
		fos.close();
		// 열린 역순으로 닫아줌
		
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		String s = dis.readUTF();
		System.out.println("가져온 내용 : " + s);
		
		dis.close();
		bis.close();
		fis.close();
		
		// 직렬화 ; 객체를 다른 저장소에 저장하는 것 
		// 데이터 베이스에 객체 형식을 저장할 수 없기 때문에 객체를 byte로 변환하는 과정
		// .객체스트림 ; 역직렬화
	}
}
