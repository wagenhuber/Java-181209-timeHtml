import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("index.html");
        Date date = null;


        int i = 1;
        while (i != 0) {
            date = new Date();
            System.out.println(date.toString());
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append(date.toString());
            //fileWriter.write(date.toString());
            fileWriter.append(" -> created by Version 4" + System.lineSeparator());
            fileWriter.close();
            TimeUnit.SECONDS.sleep(10);

        }


    }

}
