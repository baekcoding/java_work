package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 파일 copy 연습
 */
public class MainClass09 {
	public static void main(String[] args) {
		//필요한 참조값을 담을 지역 변수를 미리 만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:/acorn202304/myFolder/1.jpg");
			fos = new FileOutputStream("C:\\acorn202304\\myfolder\\copied.jpg");
			//byte 알갱이를 읽어낼 배열을 미리 준비하기
			byte[] buffer = new byte[1024];
			//반복문 돌면서
			while(true) {
				//byte[] 배열을 전달해서 byte 알갱이를 한번에 1024개씩 읽어들인다ㅏ.
				int readedCount = fis.read(buffer);
				if (readedCount == -1) break;
				fos.write(buffer, 0, readedCount);
				fos.flush();
			}
			System.out.println("파일을 copy 했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null)fos.close();
				if(fis!=null)fos.close();
			} catch (Exception e2) {}
		}
	}
}
