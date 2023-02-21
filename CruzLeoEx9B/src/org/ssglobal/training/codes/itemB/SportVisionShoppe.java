package org.ssglobal.training.codes.itemB;

public sealed abstract class SportVisionShoppe permits CyclingGlass, SwimmingGlass{
	protected String custOrderNo;
	protected String custOrderDate;
	protected float depositPymt;
	
	public abstract double calCharges();

	public String getCustOrderNo() {
		return custOrderNo;
	}

	public void setCustOrderNo(String custOrderNo) {
		this.custOrderNo = custOrderNo;
	}

	public String getCustOrderDate() {
		return custOrderDate;
	}

	public void setCustOrderDate(String custOrderDate) {
		this.custOrderDate = custOrderDate;
	}

	public float getDepositPymt() {
		return depositPymt;
	}

	public void setDepositPymt(float depositPymt) {
		this.depositPymt = depositPymt;
	}

}
