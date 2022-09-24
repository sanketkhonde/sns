package practice;

import java.util.HashMap;
import java.util.Set;

public class sanket {

	public static void main(String[] args) {

//HashMap<Integer,Integer>hm=new HashMap<Integer ,Integer>();
//
//
//for(int s:a) {
//	if(hm.containsKey(s))
//	hm.put(s,hm.get(s)+1);
//	else
//		
//		hm.put(s,1);
//}
//Set <Integer> ff=hm.keySet();
//for(int g:ff) {
//if(hm.get(g)==1)
//	
//	System.out.println(g);
//}
//




		int a[]= {1,2,3,2,1};

for (int i=0;i<a.length;i++) 
{
	int aq=1;
	for (int j=i+1;j<a.length;j++) 
	{
		if(a[i]==a[j]) 
		{
			
			aq++;
			a[j]='0';
			
		}	
	}
	if(aq==1 &&a[i]!='0')
	{
		System.out.println(a[i]);
		
	}
}













	}
	

}
