import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        long a = System.nanoTime();
        int[] mas = new int[1000000];
        for(int i = 0; i < mas.length; i++){
            mas[i] = i;
        }
        long b = System.nanoTime();
        System.out.println(b-a);
//        System.runFinalizersOnExit();

        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("our.props");
        props.load(fis);
        fis.close();
        System.out.println(props.getProperty("name"));

        Instant date = Instant.ofEpochMilli(System.currentTimeMillis());
        System.out.println(date);
        Duration day = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(day);
        Instant date2 = date.plus(day);
        System.out.println(date2);
        System.out.println(date2.toEpochMilli());
        System.out.println(Instant.EPOCH);
        System.out.println(date2.isBefore(date));
    }
}
