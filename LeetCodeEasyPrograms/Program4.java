package LeetCodeEasyPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program4 {
	
	    public List addTwoNumbers(ArrayList l1, ArrayList l2) {//  l1= {1,2,3,4},l2={4,5,6,7}
	    	List a=new ArrayList();
	    	for(int i=0;i<l1.size();i++) {
	    		int b=(int) l1.get(i)+(int) l2.get(i);
	    		a.add(i, b);
	    	}
			return a;
	        
	    }
	    public static void main(String[] args) {
	    	Program4 pp=new Program4();
	    pp.addTwoNumbers(new  ArrayList(),new ArrayList());

	    	
		}
	}

