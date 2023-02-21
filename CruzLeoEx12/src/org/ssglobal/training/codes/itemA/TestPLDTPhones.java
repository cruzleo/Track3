package org.ssglobal.training.codes.itemA;

public class TestPLDTPhones {

	public static void main(String[] args) {
		PLDTPhones pp = new PLDTPhones();
		pp.addPhone("0934342");
		pp.addPhone("0978423");
		pp.addPhone("0945456");
		pp.addPhone("0975632");
		
		pp.displayPhoneNumbers();
		
		pp.removePhone("0934342");
		
		pp.displayPhoneNumbers();
		pp.updatePhone("0975632", "098888");
		pp.displayPhoneNumbers();

	}

}
