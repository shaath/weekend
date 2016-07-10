package com.orgHrm.Tests;

import com.orgHrm.Master.orgMaster;

public class useregtest {

	public static void main(String[] args)
	{
		orgMaster om=new orgMaster();
		
		String res=om.org_Launch(om.url);
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Userreg("Venki CH", "Venki123456", "Venki123456", "Venki123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}

}
