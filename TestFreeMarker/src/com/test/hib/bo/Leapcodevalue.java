package com.test.hib.bo;

import java.sql.Timestamp;
import java.util.Comparator;

/**
 * Leapcodevalue entity. @author MyEclipse Persistence Tools
 */

public class Leapcodevalue implements Comparable<Leapcodevalue> {

	// Fields

	private String id;
	private String codetypename;
	private String codeid;
	private String codevalue;
	private String codeparentid;
	private String remarks;
	private Integer cloudappid;
	private String creator;
	private Timestamp createtime;
	private String updater;
	private Timestamp updatetime;
	private Integer orderid;

	// Constructors

	/** default constructor */
	public Leapcodevalue() {
	}

	/** minimal constructor */
	public Leapcodevalue(String id) {
		this.id = id;
	}

	/** full constructor */
	public Leapcodevalue(String id, String codetypename, String codeid,
			String codevalue, String codeparentid, String remarks,
			Integer cloudappid, String creator, Timestamp createtime,
			String updater, Timestamp updatetime, Integer orderid) {
		this.id = id;
		this.codetypename = codetypename;
		this.codeid = codeid;
		this.codevalue = codevalue;
		this.codeparentid = codeparentid;
		this.remarks = remarks;
		this.cloudappid = cloudappid;
		this.creator = creator;
		this.createtime = createtime;
		this.updater = updater;
		this.updatetime = updatetime;
		this.orderid = orderid;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodetypename() {
		return this.codetypename;
	}

	public void setCodetypename(String codetypename) {
		this.codetypename = codetypename;
	}

	public String getCodeid() {
		return this.codeid;
	}

	public void setCodeid(String codeid) {
		this.codeid = codeid;
	}

	public String getCodevalue() {
		return this.codevalue;
	}

	public void setCodevalue(String codevalue) {
		this.codevalue = codevalue;
	}

	public String getCodeparentid() {
		return this.codeparentid;
	}

	public void setCodeparentid(String codeparentid) {
		this.codeparentid = codeparentid;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getCloudappid() {
		return this.cloudappid;
	}

	public void setCloudappid(Integer cloudappid) {
		this.cloudappid = cloudappid;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public String getUpdater() {
		return this.updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Timestamp getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	@Override
	public int compareTo(Leapcodevalue o) {
		
		try {
			if (Integer.parseInt(this.codeid) > Integer.parseInt(o.getCodeid())) {
				return 1;
			} else {
				return 0;
			}
		} catch (NumberFormatException e) {
			return 0;
		}
	}

}