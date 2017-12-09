package com.bioservice.app.resource;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Service
@Path("healthcheck")
public class HealthCheckResource {
    @GET
    public Response healthcheck() {
        return Response.ok("ok").build();
    }
}