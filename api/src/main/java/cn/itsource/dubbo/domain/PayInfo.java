package cn.itsource.dubbo.domain;

import java.io.Serializable;

public class PayInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id; // 支付id
	private String method; // 字符方式
	private Integer status; // 支付状态
	private String  userName;    // 支付人名称
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
}
