import java.util.*;
public class evenandodd
{
	public static void main(String[] args) {
	    int [] a=new int[5];
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<a.length;i++)
	    {
		  a[i]=sc.nextInt();
	}
	int count1=0;
	int count2=0;
	for(int i=0;i<a.length;i++)
	{
	    if(a[i]%2==0){
	        count1+=1;
	    }
	    else if(a[i]%2!=0){
	        count2+=1;
	}
	}
	        System.out.println(count1);
	        System.out.println(count2);
}
	    }
	
	


