package ByteStreamEx1;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String fileName = "c:/Temp/outputByteStream2";
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(fileName);
            while(true){
                System.out.print("data (0:exit) : ");
                int data = key.nextInt();
                if(data == 0)break;
                fos.write(data); //메모리에 write 예시2 > 지금 바이너리 파일로 저장됨 ****얘는 read랑 다르게 그냥 data 하면 바이너리 파일로 저장됨. read()가 특이
            }
        }catch(IOException e){
            e.getStackTrace();
        }finally{
            try{
                if(fos!=null){
                    fos.close();
                    System.out.println(fileName + "데이터가 파일에 성공적으로 저장되었습니다.");
                }
            }catch(IOException ex){
                ex.getStackTrace();
            }
        }
    }
}
