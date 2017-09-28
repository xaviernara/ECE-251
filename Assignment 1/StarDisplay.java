public class StarDisplay {
public void displayStar(int number )
{
//extract each digit from the passed parameter, and
//call the method displayStarHelper(int i)
	int passExtract1;
	int passExtract2;
	int passExtract3;
	int passExtract4;
	int passExtract5;
	passExtract1=(number-(number%10000))/10000;
	passExtract2=((number-(number%1000))/1000)%10;
	passExtract3=(number%1000)/100;
	passExtract4=(number%100)/10;
	passExtract5=(number%10000)%1000%100%10;
	displayStarHelper(passExtract1);
	displayStarHelper(passExtract2);
	displayStarHelper(passExtract3);
	displayStarHelper(passExtract4);
	displayStarHelper(passExtract5);
}

public void displayStarHelper(int i)
{
	//display a banner based on the passed parameter.
//for (i=0 ,i++,i=5 )
	if ( i==0 )
	{ 	System.out.println("				");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("***			 ***");
		System.out.println("***			 ***");
		System.out.println("***			 ***");
		System.out.println("***			 ***");
		System.out.println("***			 ***");
		System.out.println("***			 ***");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("				");
	}

	else if (i ==1)
	{	System.out.println("				");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("				");
	}


	else if (i==2)
	{	System.out.println("			  ");
		System.out.println("******** 	**");
		System.out.println("******** 	**");
		System.out.println("** 	  ** 	**");
		System.out.println("** 	  ** 	**");
		System.out.println("** 	  ** 	**");
		System.out.println("** 	  ********");
		System.out.println("** 	  ********");
		System.out.println("				");
	}


	else if ( i==3)
	{	System.out.println("				");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("***	  ***	 ***");
		System.out.println("***	  ***	 ***");
		System.out.println("***	  ***	 ***");
		System.out.println("***	  ***	 ***");
		System.out.println("***	  ***	 ***");
		System.out.println("				");
	}


	else if ( i==4)
	{	System.out.println("				");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("	****		");
		System.out.println("	****		");
		System.out.println("	****		");
		System.out.println("	************");
		System.out.println("	************");
		System.out.println("				");
	}

	else if ( i==5)
	{	System.out.println("				");
		System.out.println("**      ********");
		System.out.println("**      ********");
		System.out.println("** 		** 	  **");
		System.out.println("** 		** 	  **");
		System.out.println("********** 	  **");
		System.out.println("********** 	  **");
		System.out.println("				");

	}


	else if ( i==6)
	{	System.out.println("				");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("** 	   **     **");
		System.out.println("** 	   **     **");
		System.out.println("********* 	  **");
		System.out.println("********* 	  **");
		System.out.println("				");
	}

	else if ( i==7)
	{	System.out.println("				");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("			 ***");
		System.out.println("			 ***");
		System.out.println("			 ***");
		System.out.println("			 ***");
		System.out.println("			 ***");
		System.out.println("				");
	}
	else if ( i==8)
	{	System.out.println("				");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("** 	   **     **");
		System.out.println("** 	   **     **");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("				");
	}


	else
	{	System.out.println("				");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("	***		 ***");
		System.out.println("	***		 ***");
		System.out.println("	***		 ***");
		System.out.println("	************");
		System.out.println("	************");
		System.out.println("				");
	}


}
 }