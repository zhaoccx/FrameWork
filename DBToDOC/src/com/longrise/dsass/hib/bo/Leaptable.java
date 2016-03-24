package com.longrise.dsass.hib.bo;

import java.sql.Timestamp;

/**
 * Leaptable entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
public class Leaptable implements java.io.Serializable{
	// Fields
	private String		id;
	private String		dbname;
	private String		name;
	private String		cnname;
	private String		enname;
	private String		code;
	private String		tabletype;
	private String		viewquery;
	private String		schemaname;
	private String		orderexpression;
	private Integer		gislayermode;
	private String		linkedlayer;
	private Integer		autoareacontrol;
	private String		remarks;
	private Integer		gislayertype;
	private String		gislayericon;
	private String		leapprojectid;
	private Integer		cloudappid;
	private String		creator;
	private Timestamp	createtime;
	private String		updater;
	private Timestamp	updatetime;
	private String		categoryname;
	private String		ownersys;

	// Constructors
	/** default constructor */
	public Leaptable(){
	}

	/** minimal constructor */
	public Leaptable(String id){
		this.id = id;
	}

	/** full constructor */
	public Leaptable(String id, String dbname, String name, String cnname, String enname, String code, String tabletype, String viewquery, String schemaname, String orderexpression, Integer gislayermode, String linkedlayer, Integer autoareacontrol, String remarks, Integer gislayertype, String gislayericon, String leapprojectid, Integer cloudappid, String creator, Timestamp createtime,
			String updater, Timestamp updatetime, String categoryname, String ownersys){
		this.id = id;
		this.dbname = dbname;
		this.name = name;
		this.cnname = cnname;
		this.enname = enname;
		this.code = code;
		this.tabletype = tabletype;
		this.viewquery = viewquery;
		this.schemaname = schemaname;
		this.orderexpression = orderexpression;
		this.gislayermode = gislayermode;
		this.linkedlayer = linkedlayer;
		this.autoareacontrol = autoareacontrol;
		this.remarks = remarks;
		this.gislayertype = gislayertype;
		this.gislayericon = gislayericon;
		this.leapprojectid = leapprojectid;
		this.cloudappid = cloudappid;
		this.creator = creator;
		this.createtime = createtime;
		this.updater = updater;
		this.updatetime = updatetime;
		this.categoryname = categoryname;
		this.ownersys = ownersys;
	}

	// Property accessors
	public String getId(){
		return this.id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getDbname(){
		return this.dbname;
	}

	public void setDbname(String dbname){
		this.dbname = dbname;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getCnname(){
		return this.cnname;
	}

	public void setCnname(String cnname){
		this.cnname = cnname;
	}

	public String getEnname(){
		return this.enname;
	}

	public void setEnname(String enname){
		this.enname = enname;
	}

	public String getCode(){
		return this.code;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getTabletype(){
		return this.tabletype;
	}

	public void setTabletype(String tabletype){
		this.tabletype = tabletype;
	}

	public String getViewquery(){
		return this.viewquery;
	}

	public void setViewquery(String viewquery){
		this.viewquery = viewquery;
	}

	public String getSchemaname(){
		return this.schemaname;
	}

	public void setSchemaname(String schemaname){
		this.schemaname = schemaname;
	}

	public String getOrderexpression(){
		return this.orderexpression;
	}

	public void setOrderexpression(String orderexpression){
		this.orderexpression = orderexpression;
	}

	public Integer getGislayermode(){
		return this.gislayermode;
	}

	public void setGislayermode(Integer gislayermode){
		this.gislayermode = gislayermode;
	}

	public String getLinkedlayer(){
		return this.linkedlayer;
	}

	public void setLinkedlayer(String linkedlayer){
		this.linkedlayer = linkedlayer;
	}

	public Integer getAutoareacontrol(){
		return this.autoareacontrol;
	}

	public void setAutoareacontrol(Integer autoareacontrol){
		this.autoareacontrol = autoareacontrol;
	}

	public String getRemarks(){
		return this.remarks;
	}

	public void setRemarks(String remarks){
		this.remarks = remarks;
	}

	public Integer getGislayertype(){
		return this.gislayertype;
	}

	public void setGislayertype(Integer gislayertype){
		this.gislayertype = gislayertype;
	}

	public String getGislayericon(){
		return this.gislayericon;
	}

	public void setGislayericon(String gislayericon){
		this.gislayericon = gislayericon;
	}

	public String getLeapprojectid(){
		return this.leapprojectid;
	}

	public void setLeapprojectid(String leapprojectid){
		this.leapprojectid = leapprojectid;
	}

	public Integer getCloudappid(){
		return this.cloudappid;
	}

	public void setCloudappid(Integer cloudappid){
		this.cloudappid = cloudappid;
	}

	public String getCreator(){
		return this.creator;
	}

	public void setCreator(String creator){
		this.creator = creator;
	}

	public Timestamp getCreatetime(){
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime){
		this.createtime = createtime;
	}

	public String getUpdater(){
		return this.updater;
	}

	public void setUpdater(String updater){
		this.updater = updater;
	}

	public Timestamp getUpdatetime(){
		return this.updatetime;
	}

	public void setUpdatetime(Timestamp updatetime){
		this.updatetime = updatetime;
	}

	public String getCategoryname(){
		return this.categoryname;
	}

	public void setCategoryname(String categoryname){
		this.categoryname = categoryname;
	}

	public String getOwnersys(){
		return this.ownersys;
	}

	public void setOwnersys(String ownersys){
		this.ownersys = ownersys;
	}
}