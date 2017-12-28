package gsontest.helper;

import java.util.List;

import gsontest.entity.SpaClass;

public class JsonRequestObject {
	SpaClass spaClass;
	List<SpaClass> spaClassList;
	
	public SpaClass getSpaClass() {
		return spaClass;
	}
	public void setSpaClass(SpaClass spaClass) {
		this.spaClass = spaClass;
	}
	public List<SpaClass> getSpaClassList() {
		return spaClassList;
	}
	public void setSpaClassList(List<SpaClass> spaClassList) {
		this.spaClassList = spaClassList;
	}
	@Override
	public String toString() {
		return "JsonRequestObject [spaClass=" + spaClass + ", spaClassList=" + spaClassList + "]";
	} 
}
