/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import model.DataFactory;

/**
 *
 * @author Iman Hosseini
 * 
 */
@Path("members")
public class MemberRest {
    
    @Context
    private UriInfo context;

    
    @GET
    @Produces("application/json")
    public Response getMembers() {
        DataFactory DF = new DataFactory();
        return Response.status(Response.Status.OK).entity(DF.getMembersAsJson()).build();
    }
}
