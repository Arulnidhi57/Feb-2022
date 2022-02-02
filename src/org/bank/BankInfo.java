package org.bank;

public class BankInfo{
	
	    public static void main(String [] args){
	    String s = "Asif";
	    String  rev = "";
	    
	    for(int i=s.length()-1;i>=0;i--){
	        rev=rev+s.charAt(i);
	    }
	    System.out.println(rev);
	}
	}