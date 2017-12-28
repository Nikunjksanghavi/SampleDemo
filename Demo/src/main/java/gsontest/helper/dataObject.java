package gsontest.helper;

import java.util.List;

public class dataObject {
	List<JsonRequestObject> data;

	public List<JsonRequestObject> getData() {
		return data;
	}

	public void setData(List<JsonRequestObject> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "dataObject [data=" + data + "]";
	}
}
