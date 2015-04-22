package com.search;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;
import javax.xml.namespace.QName;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class SearchCityPortlet
 */
public class SearchCityPortlet extends MVCPortlet {
	@ProcessAction(name = "processEvent")
	public void process(ActionRequest request, ActionResponse response) {

		/**
		 * Get sample text from UI
		 */

		String sampleText = ParamUtil.getString(request, "sampleText", "Kyiv");
		System.out.println("SearchCityPortlet: " + sampleText);
		/**
		 * Refer portlet.xml
		 */
		QName qName = new QName("http://proliferay.com/events", "search-city");
		response.setEvent(qName, sampleText);
	}

}
