import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class testUrl {
    public static void main(String[] args) {
       
        try{
          int limit = 10;
          int offset = 0;
          final String TOKEN = "Token 7d29e9dc5e427bf56ab9f783e7f015ffef6258e7";
          String apiUrl = "http://dronesim.facets-labs.com/api/dronedynamics/";
          String urlWithParams = apiUrl + "?limit=" + limit + "&offset=" + offset;
          URL url = new URL (urlWithParams) ;
          HttpURLConnection con = (HttpURLConnection) url.openConnection();
          con.setRequestProperty("Authorization", "Basic" + TOKEN);
          con.setRequestMethod("GET");
          //con.setRequestProperty ("group27", "certainty-garden-wok-epiphany-judiciary-bacterium-entomb") ;
          int responseCode = con.getResponseCode () ;
          System.out.println(responseCode); 

        }catch (Exception e) {
         // Behandlung der Ausnahme
         e.printStackTrace(); 
       }  
    }
}
