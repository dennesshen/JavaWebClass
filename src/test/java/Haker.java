
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.IOUtils;


public class Haker {
    public static void main(String[] args) throws MalformedURLException, IOException {
        String path = "http://localhost:8080/JavaWeb20210531/controller/bmi_session";
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        //塞入一個Header
        conn.setRequestProperty("Cookie", "JSESSIONID=8565EA0FCC1478BBDC263235319B8380");
        conn.connect();
        InputStream is = conn.getInputStream();
        System.out.println(IOUtils.toString(is,"utf-8"));

                
    }
    
}
