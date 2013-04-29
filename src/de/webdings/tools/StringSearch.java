/* Stringsearch.java - Copyright (c) 2005 by Stefan Thesing
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
package de.webdings.tools;

/**
 * StringSearch offers some basic search functions with Strings.
 * 
 * @author Stefan Thesing<br>
 * Website: <a href="http://www.webdings.de">http://www.webdings.de</a>
 * @version 1.0 23.05.2005
 */
public class StringSearch {
    /**
     * Returns <code>true</code> if <code>s</code> contains 
     * <code>search</code> as a substring. StringSearch 
     * is not case sensitive.
     * 
     * @param s String that is searched
     * @param search String that is searched for
     * @return <code>true</code> if <code>s</code> contains <code>search</code>
     */
    public static boolean stringContains(String s, String search) {
		//Case1: search has the same length as s
		if(search.length() == s.length()) {
			return s.equalsIgnoreCase(search);
		}
		//Case2: search is shorter than s.
		//Compare all possible substrings of s that have the same
		//length as search, to search
		if(search.length() < s.length()) {
			String sub;
			for(int i=0; i<=s.length()-search.length(); ++i) {
				sub = s.substring(i, i+search.length());
				if(sub.equalsIgnoreCase(search)){
					return true;
				}
			}
		}
		//Case3: search is longer than s, ergo: s cannot contain search
		return false;
	}
	
	/**
	 * Does the same as {@link #stringContains(String, String) stringContains()},
	 * but it's case sensitive.
	 * @param s String that is searched
     * @param search String that is searched for
     * @return <code>true</code> if <code>s</code> contains <code>search</code>
     */
	public static boolean stringContainsCaseSensitive(String s, String search) {
//		Case1: search has the same length as s
		if(search.length() == s.length()) {
			return s.equals(search);
		}
		//Case2: search is shorter than s.
		//Compare all possible substrings of s that have the same
		//length as search, to search
		if(search.length() < s.length()) {
			String sub;
			for(int i=0; i<=s.length()-search.length(); ++i) {
				sub = s.substring(i, i+search.length());
				if(sub.equals(search)){
					return true;
				}
			}
		}
		//Case3: search is longer than s, ergo: s cannot contain search
		return false;
	}
}
