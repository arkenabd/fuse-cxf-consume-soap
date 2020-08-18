
package org.mycompany.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({ "intA", "intB" })
public class AddPojo {

	@JsonProperty("intA")
	private Integer intA;
	@JsonProperty("intB")
	private Integer intB;

	@JsonProperty("intA")
	public Integer getIntA() {
		return intA;
	}

	@JsonProperty("intA")
	public void setIntA(Integer intA) {
		this.intA = intA;
	}

	@JsonProperty("intB")
	public Integer getIntB() {
		return intB;
	}

	@JsonProperty("intB")
	public void setIntB(Integer intB) {
		this.intB = intB;
	}

	public void assignValue(int intA, int intB, Exchange exchange) {
		List<Integer> params = new ArrayList<Integer>();
		params.add(intA);
		params.add(intB);
		exchange.getIn().setBody(params);
	}
}