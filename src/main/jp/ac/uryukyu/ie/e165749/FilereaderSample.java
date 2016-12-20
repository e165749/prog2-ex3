package jp.ac.uryukyu.ie.e165749;

/**
 * Created by South on 2016/12/20.
 */

//import宣言
import java.io.*;

class FileReaderSample{
    public static void main(String args[]){

        try{
            //FileReaderオブジェクトの生成

            FileReader fr = new FileReader(args[0]);

            //ファイルからi文字ずつデータを読み込みchar型にキャストして出力

            int i;
            while((i = fr.read()) !=-1){
                System.out.print((char)i);

            }

            //FileReaderのクローズ
            fr.close();
        }catch(IOException e){

            System.out.println("IOException : " + e);
        }
    }

}



