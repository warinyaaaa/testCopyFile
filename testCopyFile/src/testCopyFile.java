import java.io.*;
public class testCopyFile {
    public static void main(String[] args){
        var source = new File("test.txt");
        var newFile = new File("text.txt");
        try{
            var so = new FileInputStream(source);
            var file = new FileOutputStream(newFile);
            byte[] buff = new byte[1024];
            int length;
            while ((length = so.read(buff)) > 0){
                file.write(buff, 0, length);
            }
        } catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
