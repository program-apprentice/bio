package com.bioservice.app;

import com.bioservice.app.resource.HealthCheckResource;

//import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;


public class BioApplication extends ResourceConfig {
    public BioApplication() {
        // resource
        register(HealthCheckResource.class);

//        registerClasses(MultiPartFeature.class);
    }
}
