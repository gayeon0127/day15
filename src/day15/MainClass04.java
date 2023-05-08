package day15;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * output input ; 기본스트림 - 한번에 하나씩 접근에서 사용 = 비효율적
 *  => 보조스트림 이용 ; 기본스트림을 바탕으로 만들어지는 스트림
 */



public class MainClass04 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/오전취업반_허가연/test/test.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 데이터 입출력시 한 바이트가 아니라 주어진 사이즈 만큼의 버퍼 크기대로 한번에 출력할 수 있는 클래스
		// OutputStream 객체가 출력할 때마다 실제 데이터 대상에서 출력을 행할 때 발생하는 오버헤드를 줄일 수 있음
		for(char i = 'A';i<'D';i++) {
			Thread.sleep(2000);
			// fos.write(i);
			bos.write(i);
		}
		bos.flush();
		// 해당하는 스트림에 저장된 내용을 비워라 = 이어쓰기 가능
		// 버퍼에 저장된 내용을 출력하여 파일 생성시, flush() 메서드를 사용하여 버퍼에 있던 내용을 모두 출력해줘야 함.
		bos.write("안녕하세요".getBytes());
		bos.close();
		// 스트림 종료 = 이어쓰기 불가
		fos.close();
	}
}
