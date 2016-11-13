package com.eric.jsongson.databinding;

import java.util.ArrayList;
import java.util.List;

class Albums {
	public String title;
	public String message;
	public List<String> errors = new ArrayList<String>();;
	public String total;
	public int total_pages;
	public int page;
	public String limit;
	public List<Dataset> dataset = new ArrayList<Dataset>();
}