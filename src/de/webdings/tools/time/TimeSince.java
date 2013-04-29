/* TimeSince.java - Copyright (c) 2005 by Stefan Thesing
DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
                    Version 2, December 2004 

 Copyright (C) 2004 Sam Hocevar <sam@hocevar.net> 

 Everyone is permitted to copy and distribute verbatim or modified 
 copies of this license document, and changing it is allowed as long 
 as the name is changed. 

            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
   TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION 

  0. You just DO WHAT THE FUCK YOU WANT TO.
*/
package de.webdings.tools.time;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * TimeSince is used to tell how much time has passed
 * between two points in time.
 * 
 * @author Stefan Thesing<br>
 * Website: <a href="http://www.webdings.de">http://www.webdings.de</a>
 * @version 1.0 23.05.2005
 */
public class TimeSince {
//  Operations
	/**
	 * Returns the timespan between two points in time
	 * in full milliseconds.
	 * @param start Beginning of the measured time-span.
	 * @param stop End of the measured time-span.
	 * @return Time-span in full milliseconds
	 */
	public long getMilliSecondsSince(GregorianCalendar start, GregorianCalendar stop) {
		return (stop.getTimeInMillis() - start.getTimeInMillis());
	}
	
	/**
	 * Returns the timespan between 
	 * 1. a specified past point of time and<br>
	 * 2. the moment this method is called (now) 
	 * in full milliseconds
	 * @param start past point
	 * @return Time-span in full milliseconds
	 */
	public long getMilliSecondsSince(GregorianCalendar start) {
		return this.getMilliSecondsSince(start, new GregorianCalendar());
	}
	
	/**
	 * Returns the timespan between two specified 
	 * points in time in full seconds.
	 * @param start Beginning of the measured time-span.
	 * @param stop End of the measured time-span.
	 * @return Time-span in full seconds
	 */
	public long getSecondsSince(GregorianCalendar start, GregorianCalendar stop) {
		return (this.getMilliSecondsSince(start, stop)/1000);
	}
	
	/**
	 * Returns the timespan between 
	 * 1. a specified past point of time and<br>
	 * 2. the moment this method is called (now) 
	 * in full seconds
	 * @param start past point
	 * @return Time-span in full seconds
	 */
	public long getSecondsSince(GregorianCalendar start) {
		return this.getSecondsSince(start, new GregorianCalendar());
	}
	
	/**
	 * Returns the timespan between two specified 
	 * points in time in full minutes
	 * @param start Beginning of the measured time-span.
	 * @param stop End of the measured time-span.
	 * @return Time-span in full minutes
	 */
	public long getMinutesSince(GregorianCalendar start, GregorianCalendar stop) {
		return (this.getSecondsSince(start, stop)/60);
	}
	
	/**
	 * Returns the timespan between 
	 * 1. a specified past point of time and<br>
	 * 2. the moment this method is called (now) 
	 * in full minutes
	 * @param start past point
	 * @return Time-span in full minutes 
	 */
	public long getMinutesSince(GregorianCalendar start) {
		return this.getMinutesSince(start, new GregorianCalendar());
	}
	
	/**
	 * Returns the timespan between two specified 
	 * points in time in full hours
	 * @param start Beginning of the measured time-span.
	 * @param stop End of the measured time-span.
	 * @return Time-span in full hours
	 */
	public long getHoursSince(GregorianCalendar start, GregorianCalendar stop) {
		return (this.getMinutesSince(start, stop)/60);
	}
	
	/**
	 * Returns the timespan between 
	 * 1. a specified past point of time and<br>
	 * 2. the moment this method is called (now) 
	 * in full hours
	 * @param start past point
	 * @return Time-span in full hours 
	 */
	public long getHoursSince(GregorianCalendar start) {
		return this.getHoursSince(start, new GregorianCalendar());
	}
	
	/**
	 * Returns the timespan between two specified 
	 * points in time in full days
	 * @param start Beginning of the measured time-span.
	 * @param stop End of the measured time-span.
	 * @return Time-span in full days
	 */
	public int getDaysSince(GregorianCalendar start, GregorianCalendar stop) {
		Long hours = new Long(this.getHoursSince(start, stop));
		return (hours.intValue()/24);
	}
	
	/**
	 * Returns the timespan between 
	 * 1. a specified past point of time and<br>
	 * 2. the moment this method is called (now) 
	 * in full days
	 * @param start past point
	 * @return Time-span in full days 
	 */
	public int getDaysSince(GregorianCalendar start) {
		return this.getDaysSince(start, new GregorianCalendar());
	}

	/**
	 * Returns the timespan between two specified 
	 * points in time in full weeks
	 * @param start Beginning of the measured time-span.
	 * @param stop End of the measured time-span.
	 * @return Time-span in full weeks
	 */
	public int getWeeksSince(GregorianCalendar start, GregorianCalendar stop) {
		return this.getDaysSince(start, stop)/7;
	}
	
	/**
	 * Returns the timespan between 
	 * 1. a specified past point of time and<br>
	 * 2. the moment this method is called (now) 
	 * in full weeks
	 * @param start past point
	 * @return Time-span in full weeks 
	 */
	public int getWeeksSince(GregorianCalendar start) {
		return this.getWeeksSince(start, new GregorianCalendar());
	}
	
	/**
	 * Returns the timespan between two specified 
	 * points in time in full months
	 * @param start Beginning of the measured time-span.
	 * @param stop End of the measured time-span.
	 * @return Time-span in full months
	 */
	public int getMonthsSince(GregorianCalendar start, GregorianCalendar stop) {
		GregorianCalendar startClone = new GregorianCalendar
			(start.get(Calendar.YEAR), start.get(Calendar.MONTH), 
					start.get(Calendar.DAY_OF_MONTH));
		start = startClone;
		int months = 0;
		while(start.get(Calendar.MONTH) != stop.get(Calendar.MONTH)) {
			   start.roll(Calendar.MONTH, true);
			   if(start.getTime().compareTo(stop.getTime())<0){
			    ++months;
			   }
			   start.roll(Calendar.MONTH, true);
			   if(start.getTime().compareTo(stop.getTime())>0) {
			    start.roll(Calendar.MONTH, false);
			    break;
			   }
			   start.roll(Calendar.MONTH, false);
			  }
		return months+(this.getYearsSince(start, stop)*12);
	}
	
	/**
	 * Returns the timespan between 
	 * 1. a specified past point of time and<br>
	 * 2. the moment this method is called (now) 
	 * in full months
	 * @param start past point
	 * @return Time-span in full months 
	 */
	public int getMonthsSince(GregorianCalendar start) {
		return this.getMonthsSince(start, new GregorianCalendar());
	}
	
	/**
	 * Returns the timespan between two specified 
	 * points in time in full years
	 * @param start Beginning of the measured time-span.
	 * @param stop End of the measured time-span.
	 * @return Time-span in full years
	 */
	public int getYearsSince(GregorianCalendar start, GregorianCalendar stop) {
		GregorianCalendar startClone = new GregorianCalendar
		(start.get(Calendar.YEAR), start.get(Calendar.MONTH), 
				start.get(Calendar.DAY_OF_MONTH));
	    start = startClone;
		int years = 0;
		while(start.get(Calendar.YEAR) != stop.get(Calendar.YEAR)) {
			   start.roll(Calendar.YEAR, true);
			   if(start.getTime().compareTo(stop.getTime())<0){
			    ++years;
			   }
			   start.roll(Calendar.YEAR, true);
			   if(start.getTime().compareTo(stop.getTime())>0) {
			    start.roll(Calendar.YEAR, false);
			    break;
			   }
			   start.roll(Calendar.YEAR, false);
			  }
		return years;
	}	
	
	/**
	 * Returns the timespan between 
	 * 1. a specified past point of time and<br>
	 * 2. the moment this method is called (now) 
	 * in full years
	 * @param start past point
	 * @return Time-span in full years 
	 */
	public int getYearsSince(GregorianCalendar start) {
		return this.getYearsSince(start, new GregorianCalendar());
	}
	
	/**
	 * Returns the timespan between two specified 
	 * points in time as an array containing
	 * <table>
	 * <tr><th>Index</th><th>Information</th></tr>
	 * <tr><td>0</td><td>full years</td></tr>
	 * <tr><td>1</td><td>full months</td></tr>
	 * <tr><td>2</td><td>full days</td></tr>
	 * @param start Beginning of the measured time-span.
	 * @param stop End of the measured time-span.
	 * @return Time-span in full years, full months, full days as
	 * an array containing <code>int</code>s.
	 */
	public int[] getDaysMonthsYearsSince(GregorianCalendar start, GregorianCalendar stop) {
		GregorianCalendar startClone = new GregorianCalendar
		(start.get(Calendar.YEAR), start.get(Calendar.MONTH), 
				start.get(Calendar.DAY_OF_MONTH));
		start = startClone;
		int years=0, months=0, days=0;
		while(start.get(Calendar.YEAR) != stop.get(Calendar.YEAR)) {
			   start.roll(Calendar.YEAR, true);
			   if(start.getTime().compareTo(stop.getTime())<0){
			    ++years;
			   }
			   start.roll(Calendar.YEAR, true);
			   if(start.getTime().compareTo(stop.getTime())>0) {
			    start.roll(Calendar.YEAR, false);
			    break;
			   }
			   start.roll(Calendar.YEAR, false);
			  }
			  while(start.get(Calendar.MONTH) != stop.get(Calendar.MONTH)) {
			   start.roll(Calendar.MONTH, true);
			   if(start.getTime().compareTo(stop.getTime())<0){
			    ++months;
			   }
			   start.roll(Calendar.MONTH, true);
			   if(start.getTime().compareTo(stop.getTime())>0) {
			    start.roll(Calendar.MONTH, false);
			    break;
			   }
			   start.roll(Calendar.MONTH, false);
			  }
			  while(start.get(Calendar.DAY_OF_MONTH) != stop.get(Calendar.DAY_OF_MONTH)) {
			   start.roll(Calendar.DAY_OF_MONTH, true);
			   if(start.getTime().compareTo(stop.getTime())<0){
			    ++days;
			   }
			   start.roll(Calendar.DAY_OF_MONTH, true);
			   if(start.getTime().compareTo(stop.getTime())>0) {
			    start.roll(Calendar.DAY_OF_MONTH, false);
			    break;
			   }
			   start.roll(Calendar.DAY_OF_MONTH, false);
			  }
			  int[] array = new int[3];
			  array[0] = years;
			  array[1] = months;
			  array[2] = days;
			  return array;
	}

	/**
	 * Returns the timespan between 
	 * 1. a specified past point of time and<br>
	 * 2. the moment this method is called (now) 
	 * as an array containing
	 * <table>
	 * <tr><th>Index</th><th>Information</th></tr>
	 * <tr><td>0</td><td>full years</td></tr>
	 * <tr><td>1</td><td>full months</td></tr>
	 * <tr><td>2</td><td>full days</td></tr>
	 * @param start past point
	 * @return Time-span in full years, full months, full days as
	 * an array containing <code>int</code>s. 
	 */
	public int[] getDaysMonthsYearsSince(GregorianCalendar start) {
		return this.getDaysMonthsYearsSince(start, new GregorianCalendar());
	}

	/**
	 * Returns the timespan between two specified 
	 * points in time as a String in the following form:
	 * <p><code>42 years, 5 months, 23 days</code></p>
	 * @param start Beginning of the measured time-span.
	 * @param stop End of the measured time-span.
	 * @return Time-span in full years, full months 
	 * and full days as a String
	 */
	public String getDaysMonthsYearsSinceAsString(GregorianCalendar start, GregorianCalendar stop) {
		int[] value = this.getDaysMonthsYearsSince(start, stop);
		return value[0] + " years, " + value[1] + " months, " + value[2] + " days";
	}
	
	/**
	 * Returns the timespan between 
	 * 1. a specified past point of time and<br>
	 * 2. the moment this method is called (now) 
	 * as a String in the following form:
	 * <p><code>42 years, 5 months, 23 days</code></p>
	 * @param start past point
	 * @return Time-span in full years, full months 
	 * and full days as a String
	 */
	public String getDaysMonthsYearsSinceAsString(GregorianCalendar start) {
		return this.getDaysMonthsYearsSinceAsString(start, new GregorianCalendar());
	}
}
