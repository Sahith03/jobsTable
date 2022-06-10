package com.example.demo.jobs;

import org.springframework.data.annotation.Id;

public class job {
	@Id
	public String _id;
	private String jobID;
	private String jobTitle;
	private String minsalary;
	private String maxsalary;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getJobID() {
		return jobID;
	}
	public void setJobID(String jobID) {
		this.jobID = jobID;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getMinsalary() {
		return minsalary;
	}
	public void setMinsalary(String minsalary) {
		this.minsalary = minsalary;
	}
	public String getMaxsalary() {
		return maxsalary;
	}
	public void setMaxsalary(String maxsalary) {
		this.maxsalary = maxsalary;
	}
}
