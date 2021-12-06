package com.api;

public class GPDeserialize {

	private String xmlns;
	private String series;
	private String url;
	private String limit;
	private String offset;
	private String total;
	private String CircuitTable;
	
	public String getXmlns() {
		return xmlns;
	}
	
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	
	public String getSeries() {
		return series;
	}
	
	public void setSeries(String series) {
		this.series = series;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getLimit() {
		return limit;
	}
	
	public void setLimit(String limit) {
		this.limit = limit;	
	}
	
	public String getOffset() {
		return offset;
	}
	
	public void setOffset(String offset) {
		this.offset = offset;
	}
	
	public String getTotal() {
		return total;
	}
	
	public String getCircuitTable() {
		return CircuitTable;
	}
	
	public void setCircuitTable(String CircuitTable) {
		this.CircuitTable = CircuitTable;
	}
	
}
