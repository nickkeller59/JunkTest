package com.tmob.rest.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.tmob.resource.SampleResource;
@ApplicationPath("samplerest")
public class SampleRestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
	    final Set<Class<?>> classes = new HashSet<>();
	    // register root resource
	    classes.add(SampleResource.class);
	    return classes;
	}
}
