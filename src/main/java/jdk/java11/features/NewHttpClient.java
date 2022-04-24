package jdk.java11.features;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class NewHttpClient {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient httpClient = HttpClient.newBuilder()
		         .version(HttpClient.Version.HTTP_2)
		         .connectTimeout(Duration.ofSeconds(10))
		         .build(); 
		         try {
		            HttpRequest request = HttpRequest.newBuilder()
		            .GET()
		            .uri(URI.create("https://developeronthego.pl"))
		            .build();                              
		            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString()); 

		         System.out.println("Status code: " + response.statusCode());                            
		      } catch (IOException | InterruptedException e) {
		         e.printStackTrace();
		      }
	}
}
