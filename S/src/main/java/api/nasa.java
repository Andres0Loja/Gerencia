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
public class nasa {
    public void listar(){
        try {
            String endpoint = "https://api.nasa.gov/planetary/apod?api_key=BNnOMpUYGOuT2y8VzMDYzeuqD7ZDmMlZclTCGO7T";
            
            String url = endpoint;
            
            System.out.println(url);
            HttpClientBuilder hcBuilder = HttpClients.custom();
            HttpClient client = hcBuilder.build();
            HttpGet request = new HttpGet(url);
            //Setting header parameters
            request.addHeader("Content-Type", "application/json");
            request.addHeader("Accept", "application/json");
            
            //Executing the call
            HttpResponse response = client.execute(request);
            System.out.println("\nSending 'Get' to " + url);
            System.out.println("HTTP Response: " + response.getStatusLine().getStatusCode());
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            //Reading the response
            StringBuilder result = new StringBuilder();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            System.out.println(result.toString());
            String string = result.toString();
            String[] parts = string.split("url");
            String part1 = parts[0]; // 123
            String part2 = parts[1]; // 654321
            
            String[] partes = part2.split("h");
            String parte1 = partes[0]; // 123
            String parte2 = partes[1]; // 654321
            
            String[] partes2 = parte2.split("0");
            String parte1s = partes2[0]; // 123
            
            URL url2 = null;
            try {
                url2 = new URL("h" + parte1s + "0");
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
        } catch (IOException ex) {
            Logger.getLogger(nasa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
