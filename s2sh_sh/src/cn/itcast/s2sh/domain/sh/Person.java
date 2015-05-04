package cn.itcast.s2sh.domain.sh;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2307972695587073463L;
	private Long pid;
	private String pname; 
	
	public Person(){}
	
	public Person(String pname){
		this.pname = pname;
	}
	
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPsex() {
		return psex;
	}
	public void setPsex(String psex) {
		this.psex = psex;
	}
	private String psex;
}
