package com.tmob.resource;


import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tmob.util.RecordType;

@Path("data")
public class SampleResource {
	
	final static String CLS = SampleResource.class.getName();
	final static String PKG = SampleResource.class.getPackageName();
	Logger _logger = Logger.getLogger(PKG);

	@GET
	@Path("recordtype/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRecord(@PathParam("id") String id) {
		if (_logger.isLoggable(Level.FINER)) {
			_logger.entering(CLS, PKG, id);
		}
		
		RecordType recType = fetchRecord(id);

		if (_logger.isLoggable(Level.FINER)) {
			_logger.exiting(CLS, PKG, recType);
		}
		
		return Response.ok(recType).build();
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	private RecordType fetchRecord(String id) {
		RecordType recType = new RecordType();
		
		return recType;
	}
}
