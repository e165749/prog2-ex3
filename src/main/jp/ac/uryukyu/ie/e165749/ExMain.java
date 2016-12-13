package jp.ac.uryukyu.ie.e165749;

import java.io.File;
/**
 *
 * Created by South on 2016/12/06.
 */
public class ExMain {

    public static void main(String[] args){
    FileReader();


    }



}
class FileReader(File file){
    public static void filereader(){

        try{
        File file = new File("South/IdeaProjects/prog2_ex3/src/main/map.txt");
        FileReader filereader = new FileReader(file);

        int ch = filereader.read();
        System.out.println((char)ch);
        }catch(FileNotFoundException e){
        System.out.println(e);
        }catch(IOException e){
        System.out.println(e);
        }

        }
}
//仕方ないなああ

//class Map
//class Player があると仮定

