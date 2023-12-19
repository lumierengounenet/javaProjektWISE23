import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class LumiereGetRequest {
    final static String TOKEN = "Token 7d29e9dc5e427bf56ab9f783e7f015ffef6258e7";

    public static void main(String[] args) {

        try{
            URL url = new URL("http://dronesim.facets-labs.com/api/drones/?limit=10&offset=0");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("Authorization", TOKEN);
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
