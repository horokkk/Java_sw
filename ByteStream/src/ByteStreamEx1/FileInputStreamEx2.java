package ByteStreamEx1;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx2 {
    public static void main(String[] args) {
        String fileName = "c:/Temp/outputByteStream";
        FileInputStream fis = null;
        try{
            //읽을 파일의 경로를 지정
            fis = new FileInputStream(fileName); //에러 발생 가능

            int data;
            //파일에서 데이터를 하나씩 읽어온다. -1은 파일의 끝을 의미
            while((data = fis.read())!=-1){
                //읽어온 데이터를 문자로 변환하여 출력
                System.out.print((char)data);  //그냥 data 하면 바이너리로 출력, (char)data 하면 문자로 출력
            }
        }catch(IOException e){
            //파일 입출력 예외를 처리
            e.printStackTrace();
        }finally{
            try{
                if(fis!=null){
                    System.out.println(fileName + "데이터를 성공적으로 출력했습니다.");
                    fis.close();
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
