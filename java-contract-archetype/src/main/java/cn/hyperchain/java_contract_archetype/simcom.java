package cn.hyperchain.java_contract_archetype;
import java.util.*;

public class simcom {
	
		public static void main(String[] args) {
		    	double amt, rate, tym, sim,com;
		    	Scanner sc=new Scanner (System. in);
		    	System.out.printf("Enter the amount:\n");
		    	amt=sc.nextDouble();
		    	System. out. printf("Enter the No.of years:\n");
		    	tym=sc.nextDouble();
		    	System. out. printf("Enter the Rate of  interest:\n");
		    	rate=sc.nextDouble();
		    	sim=(amt * tym * rate)/100;
		    	com=amt * Math.pow(1.0+rate/100.0,tym) - amt;
		    	System.out.printf("Simple Interest="+sim+"\n");
		    	System.out. printf("Compound Interest="+com);
		}
	
}
