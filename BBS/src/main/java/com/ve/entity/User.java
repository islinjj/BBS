package com.ve.entity;

/**
 * 用户信息表
 * 
 * @author thinkpad_ljj
 *
 */
public class User {
	public static final byte USER_LOCK = 1;
	public static final byte USER_UNLOCK = 0;

	String uid;
	String password;
	String uname;
	String photo;
	String phonenumber;
	String email;
	Byte locked;/* 用户的状态，默认为'0',即未被封锁 */

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Byte getLocked() {
		return locked;
	}

	public void setLocked(Byte locked) {
		this.locked = locked;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", password=" + password + ", uname=" + uname + ", phonenumber=" + phonenumber
				+ "]";
	}

}
