package com.firecode.practice;

public enum CrunchifyEnumCompany {
	 
	GOOGLE("G"), YAHOO("Y"), EBAY("E"), PAYPAL("P");
 
	private String companyLetter;
	private int i=2;
 
	private CrunchifyEnumCompany(String s) {
		System.out.println("creating instace of "+this);
		companyLetter = s;
	}
 
	public String getCompanyLetter() {
		return companyLetter;
	}

	public static void main(String[] args) {
		System.out.println("Get enum value for Comapny 'eBay': "
				+ CrunchifyEnumCompany.EBAY.getCompanyLetter());
		
		CrunchifyEnumCompany go=CrunchifyEnumCompany.GOOGLE;
		
		trying t = new trying();
		t.tr();
		
	}




}


class trying {
	
	int a=2;
	boolean s=true;
	
	public void tr()
	{
		
		if(!s)
		{
			System.out.println("if exec"+s);
		}
		else System.out.println("no if"+s);
	}
	
	
}