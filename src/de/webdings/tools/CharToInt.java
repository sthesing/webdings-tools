/* CharToInt.java - Copyright (c) 2005 by Stefan Thesing
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
 * CharToInt is used to convert textual represenations
 * of integer numbers into primitive data type int.
 * 
 * @author Stefan Thesing<br>
 * Website: <a href="http://www.webdings.de">http://www.webdings.de</a>
 * @version 1.0.1 10.08.2005
 */
public class CharToInt {
    /**
     * @param c A char representation of an int number
     * @return int value of the represented number
     * @throws NumberFormatException
     * @throws Exception if c is not a number character.
     */
    public static int convert(char c) throws NumberFormatException 
    {
        int ascii_wert = c;
        if(ascii_wert<48 || ascii_wert>57) {
          throw new NumberFormatException("Error: " + c + "is not a number!");
        } else {
          return ascii_wert-48;
        }
    }
    
    /**
     * @param s A char array representation of an int number
     * @return int value of the represented number
     * @throws NumberFormatException
     * @throws Exception if s contains a non-number character.
     */
    public static int convert(char[] s) throws NumberFormatException 
    {
        int i;
        int ergebnis = 0;
        for(i=0;i<s.length;++i) {
          ergebnis = ergebnis*10 + convert(s[i]);
        }
        return ergebnis;
    }
    
    /**
     * @param s A String representation of an int number
     * @return int value of the represented number
     * @throws NumberFormatException
     * @throws Exception if s contains a non-number character.
     */
    public static int convert(String s) throws NumberFormatException 
    {
        return convert(s.toCharArray());
    }
    
    /**
     * @param s A StringBuffer representation of an int number
     * @return int value of the represented number
     * @throws NumberFormatException
     * @throws Exception if s contains a non-number character.
     */
    public static int convert(StringBuffer s) throws NumberFormatException 
    {
        return convert(new String(s));
    }
}
