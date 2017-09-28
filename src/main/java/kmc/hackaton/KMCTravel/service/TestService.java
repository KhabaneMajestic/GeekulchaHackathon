package kmc.hackaton.KMCTravel.service;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestService {

    public void GetApiResult() throws MalformedURLException {

        final String uri = "http://www.mocky.io/v2/59cbaab42600004c0f6b75a6";

        URL url = new URL(uri);

        String result = null;

        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                System.out.println("HTTP code message : " + conn.getResponseMessage());
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());

            }

            System.out.println("HTTP code : " + conn.getResponseCode());

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            while ((output = br.readLine()) != null) {

                System.out.println(output);
                result = output;
            }
            conn.disconnect();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
