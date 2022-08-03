package phase1.project;

public class Longestincreasingsubsequence {
	static int increasingsubseq(int myarr[], int arrsize)
	   {
	      int seqarr[] = new int[arrsize];
	      int i, j, max = 0;
	      
	      for (i = 0; i < arrsize; i++)
	    	  
	         seqarr[i] = 1;
	      
	      for (i = 1; i < arrsize; i++)
	    	  
	      for (j = 0; j < i; j++)
	      
	    	  if (myarr[i] > myarr[j] && seqarr[i] < seqarr[j] + 1)
	    	  {
	               seqarr[i] = seqarr[j] + 1;
	    	  }
	      for (i = 0; i < arrsize; i++)
	    	  
	      if (max < seqarr[i])
	         max = seqarr[i];
	         return max;
	   }
	   
	   public static void main(String args[])
	   {
	      int myarr[] = {34, 100, 45, 198, 102, 505, 14, 95 };
	      int arrsize = myarr.length;
	      System.out.println("The Size of the longest increasing subsequence is " +  increasingsubseq(myarr, arrsize));
	   }

}
