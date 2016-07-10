package com.orgHrm.Tests;

import com.orgHrm.Master.orgMaster;

public class empregTest {

	public static void main(String[] args) 
	{
		orgMaster om=new orgMaster();
		
		String res=om.org_Launch(om.url);
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Empreg("Venki", "CH");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}

}
