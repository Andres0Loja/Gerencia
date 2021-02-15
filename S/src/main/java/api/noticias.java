/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

/**
 *
 * @author aloja
 */
public class noticias {

    public void listar(String nombre) throws IOException {
        String endpoint = "https://api.nytimes.com/svc/search/v2/articlesearch.json?q="+nombre+"&api-key=DqOX8sKqDPPwLJ89Kq1eG04TCLEo3WLZ";
        String url = endpoint;
        System.out.println(url);
        HttpClientBuilder hcBuilder = HttpClients.custom();
        HttpClient client = hcBuilder.build();
        HttpGet request = new HttpGet(url);
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Accept", "application/json");
        HttpResponse response = client.execute(request);
        System.out.println("\nSending 'Get' to " + url);
        System.out.println("HTTP Response: " + response.getStatusLine().getStatusCode());
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        StringBuilder result = new StringBuilder();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        System.out.println(result.toString());
        String string = result.toString();
        String[] parts = string.split("images");
        System.out.println(parts.length);
        String part1 = parts[0];
        String part2 = parts[1];
        String[] parte = part2.split("jpg");
        String parte1 = parte[0];

        URL url2 = null;
        try {
            url2 = new URL("https://www.nytimes.com/images/" + parte1 + "jpg");
            try {
                Desktop.getDesktop().browse(url2.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }

    }
}
