package cn.tedu.spring.entity;

public class ValueBean {
	//值来自：CollectionEntity.tag
	public String tagValue;
	
	//值来自：CollectionEntity.names中的第3个元素
	public String nameValue;
	//值来自：CollectionEntity.names中的第4个元素
	public String cityValue;
	//值来自：CollectionEntity.session中的key=password的元素
	public String passwordValue;
	//值来自：CollectionEntity.session中的key:username的元素
	public String usernameValue;
	
	public String getTagValue() {
		return tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

	public String getNameValue() {
		return nameValue;
	}

	public void setNameValue(String nameValue) {
		this.nameValue = nameValue;
	}

	public String getCityValue() {
		return cityValue;
	}

	public void setCityValue(String cityValue) {
		this.cityValue = cityValue;
	}

	public String getPasswordValue() {
		return passwordValue;
	}

	public void setPasswordValue(String passwordValue) {
		this.passwordValue = passwordValue;
	}

	public String getUsernameValue() {
		return usernameValue;
	}

	public void setUsernameValue(String usernameValue) {
		this.usernameValue = usernameValue;
	}
	
	
}
