package ctrl.json;

import java.util.ArrayList;

public class DHB {
	private String name;
	private String wx;
	private String bz;
	private ArrayList<String> phone;
	private ArrayList<String> qq;
	
	public DHB() {
		super();
	}
	public DHB(String name, String wx, String bz, ArrayList<String> phone, ArrayList<String> qq) {
		super();
		this.name = name;
		this.wx = wx;
		this.bz = bz;
		this.phone = phone;
		this.qq = qq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWx() {
		return wx;
	}
	public void setWx(String wx) {
		this.wx = wx;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public ArrayList<String> getPhone() {
		return phone;
	}
	public void setPhone(ArrayList<String> phone) {
		this.phone = phone;
	}
	public ArrayList<String> getQq() {
		return qq;
	}
	public void setQq(ArrayList<String> qq) {
		this.qq = qq;
	}
	@Override
	public String toString() {
		return "DHB [name=" + name + ", wx=" + wx +  ", phone=" + phone + ", qq=" + qq +", bz=" + bz + "]";
	}
	
}
