/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.claro;

import java.util.Enumeration;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Javier
 */
@Path("claro")
public class ClaroResource {

    @Context
    private UriInfo context;
    private static String headers = "";

    /**
     * Creates a new instance of ClaroResource
     */
    public ClaroResource() {
    }

    /**
     * Retrieves representation of an instance of demo.claro.ClaroResource
     * @return an instance of java.lang.String
     */
    @GET
   @Path("headers")

    @Produces(MediaType.TEXT_PLAIN)
    public Response getXml(@Context HttpHeaders headers) {
        
        String retorno = "";
        String userAgent ="";
    for(String header : headers.getRequestHeaders().keySet()){
        userAgent = headers.getRequestHeader(header).get(0);

	System.out.println(header+ " : " + userAgent);
        retorno+= header+ " : " + userAgent + "\n";
        
        
        
        
        
        
}

        
        
  return Response.status(201).entity(retorno).build();

    
        
    }

    /**
     * PUT method for updating or creating an instance of ClaroResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
