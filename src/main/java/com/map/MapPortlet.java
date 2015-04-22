package com.map;

import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.ProcessEvent;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class MapPortlet
 */
public class MapPortlet extends MVCPortlet {
	@ProcessEvent(qname = "{http://proliferay.com/events}search-city")
	public void myEvent(EventRequest request, EventResponse response) {
		Event event = request.getEvent();
		// Get data from the event
		String sampleText = (String) event.getValue();
		System.out.println("MapPortlet: " + sampleText);
		// Set the text in response to display in UI
		response.setRenderParameter("sampleText", sampleText);
	}
}
