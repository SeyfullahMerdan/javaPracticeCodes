package day11_dateTime;

import java.time.LocalDate;
import java.time.Month;

public class Q4 {

	public static void main(String[] args) {
		
		  /*
        What is the output of the following code?
       Asagidaki code'un  ciktisi  nedir?
       */

       LocalDate date = LocalDate.of(2018, Month.APRIL, 30);    //  2021 MAY 2
       date.plusDays(2);
       date.plusYears(3);

       System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
/*
           A. 2018 APRIL 2
           B. 2018 APRIL 30
           C. 2018 MAY 2
           D. 2021 APRIL 2
           E. 2021 APRIL 30
           F. 2021 MAY 2
           G. A runtime exception is thrown.
*/
      //B
		
	
	}

}
