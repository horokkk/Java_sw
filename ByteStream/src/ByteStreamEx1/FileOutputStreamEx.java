package ByteStreamEx1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamEx {
    public static void main(String[] ars){
        Scanner key = new Scanner(System.in);
        //String data = "Hello, FileOutputStream!";//파일에 쓸 데이터
        String fileName = "c:/Temp/outputByteStream";
        FileOutputStream fos = null;
        try{
            //파일을 열거나 새로 생성하여 FileOutputStream  객체를 생성
            fos = new FileOutputStream(fileName); //에러 발생 가능

            while(true){
                System.out.print("data (quit) :");
                String data = key.nextLine(); //빈칸 포함
                if(data.equals("quit")) break;
                //********문자열 데이터를 바이트 배열로 변환해서 파일에 쓰기
                fos.write(data.getBytes());//메모리에 write 예시1
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(fos!=null){
                    //파일 스트림 닫기
                    fos.close(); // 저장, 에러 발생 가능
                    System.out.println(fileName + "데이터가 파일에 성공적으로 저장되었습니다.");
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
