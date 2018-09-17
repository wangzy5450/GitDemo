package cn.tedu.spring.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionEntity {
	public String tag;
	
	public List<String> names;
	
	public Set<String> cities;
	
	public Map<String, String> session;
	
	public Map<String, String> getSession() {
		return session;
	}
	public void setSession(Map<String, String> session) {
		this.session = session;
	}
	
	public Set<String> getCities() {
		return cities;
	}
	public void setCities(Set<String> cities) {
		this.cities = cities;
	}
	
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
}
