package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "stork://backend/hello")
public interface Backend {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String hello();
}