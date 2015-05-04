package cn.itcast.ssh.domain;

public class Person {
	private Long pid;
	private String pname;
	private String psex;
	
	public Person(){}
	
	
	
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
	
	
}
