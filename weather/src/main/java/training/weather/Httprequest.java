/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.weather;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import java.io.IOException;


public class Httprequest {
        
    public Httprequest(){}
    
    public String requestToString(String URL) throws IOException{
        
        HttpRequestFactory rf = new NetHttpTransport().createRequestFactory();
        HttpRequest request = rf.buildGetRequest(new GenericUrl(URL));
        String requested = request.execute().parseAsString();
        return requested;
    }  
    
}
