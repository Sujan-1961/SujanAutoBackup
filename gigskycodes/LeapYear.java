package gigskycodes;

public class LeapYear {
          public static void main(String[] args) {
        	  //declare a input variable with input as year
			int year = 2000;
			//set the boolean of leap as false
			boolean leap = false;
			
			//check if the condition true, if divided by 4
			if (year%4==0) {
				//check if the condition true, if divided by 100
				if (year%100==0) {
					//check if the condition true, if divided by 400
					if (year%400==0) {
						leap = true;
					} else {
						//not a leap year
                           leap = false;
					}
					//if the yr is not century
				} else {
					//is a leap yr
                       leap = true;
				}
				//if the yr is not divisible by 400
				
			} else {
				//not a leap yr
                     leap = false;
			}
			//check whther it is leap yr or not
			if (leap) {
				System.out.println("It is a leap yr");
			} else {
                       System.out.println("Its not a leap year");
			}
		}
}
