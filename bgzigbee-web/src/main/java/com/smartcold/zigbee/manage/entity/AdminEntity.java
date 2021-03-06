package com.smartcold.zigbee.manage.entity;

import java.util.Date;

/**
 * 
 *@author Kaiqiang Jiang
 *@date:2016-6-22 上午11:02:18
 *@Description: Admin Entity
 */
public class AdminEntity {
	private int id;
	private String adminname;
	private String adminpwd;
	private String telephone;
	private String email;
	private Date addtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpwd() {
		return adminpwd;
	}
	public void setAdminpwd(String adminpwd) {
		this.adminpwd = adminpwd;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	
}
