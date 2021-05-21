import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    String[] numOne = {"1","2","3","4","5","6","7","8","9","0"};
	    String[] numTwo = {"2","2","3","3","4","4"};
	    String[] numThree = {"1","2","3"};
	    String[] numFour = {"3","3","4","5","5","6"};
	    
	    
	    System.out.println("(1)"+Arrays.toString(numOne));
	    System.out.println("(2)"+Arrays.toString(numTwo));
	    System.out.println("(3)"+Arrays.toString(numThree));
	    System.out.println("(4)"+Arrays.toString(numFour));
	    int choice;
	    
	   System.out.println("Choice");
	    Scanner myObj = new Scanner(System.in);
	    choice = myObj.nextInt();
	     
	    switch(choice){
	    
	    case 1:
    	         for(int i=0;i<=numOne.length-5;i++)
    	    {
    	        numOne[i] = "#";
    	       
    	    }
    	     System.out.println("\n"+Arrays.toString(numOne));
    	        break;
	    case 2:
	            for(int i=0;i<=numTwo.length-5;i++)
    	    {
    	        numTwo[i] = "#";
    	       
    	    }
    	     System.out.println("\n"+Arrays.toString(numTwo));
    	        break;
	      case 3:
	            for(int i=0;i<=numThree.length-5;i++)
    	    {
    	        numThree[i] = "#";
    	       
    	    }
    	     System.out.println("\n"+Arrays.toString(numThree));
    	        break;
	    
	      case 4:
	            for(int i=0;i<=numFour.length-5;i++)
    	    {
    	        numFour[i] = "#";
    	       
    	    }
    	     System.out.println("\n"+Arrays.toString(numFour));
    	        break;
    	        
    	   default:
    	     System.out.println("Invalid Input");
    	   
	    }
	}
}
