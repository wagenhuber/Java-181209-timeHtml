import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        Date date = new Date();
        File file = new File("index.html");
        System.out.println(date.toString());
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(date.toString());
        fileWriter.write(" -> created by Version 1");
        fileWriter.close();
    }

}
