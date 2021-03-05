package com.au.ticket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tickets {

    @Id
    @GeneratedValue
    @Column(name = "ticket_id")
    private Integer ticketid;
    
    @Column(name="user_id")
    private Integer userid;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "desc")
    private String desc;
    
    @Column(name = "comments")
    private String comments;
    
    @Column(name = "status")
    private String status;
    
    @Column(name="estimated_time")
    private Integer estimatedtime;

	public Integer getTicketid() {
		return ticketid;
	}

	public void setTicketid(Integer ticketid) {
		this.ticketid = ticketid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getEstimatedtime() {
		return estimatedtime;
	}

	public void setEstimatedtime(Integer estimatedtime) {
		this.estimatedtime = estimatedtime;
	}

	public Tickets() {
		super();
	}
    
  
    

	

	
    
}
