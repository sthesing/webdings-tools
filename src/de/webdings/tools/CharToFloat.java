/* CharToFloat.java - Copyright (c) 2005 by Stefan Thesing
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
 * CharToFloat is used to convert textual representations
 * of float numbers to the primitive data type float.
 * 
 * @author Stefan Thesing<br>
 * Website: <a href="http://www.webdings.de">http://www.webdings.de</a>
 * @version 1.0.1 10.08.2005
 * 
 */
public class CharToFloat {
    /**
     * @param s A String representation of a float number
     * @return float value of the represented number
     */
    public static float convert(String s) throws NumberFormatException
    {
        Float f = new Float(s);
        return f.floatValue();
    }

    /**
     * @param c A char array representation of a float number
     * @return float value of the represented number
     */
    public static float convert(char[] c) throws NumberFormatException
    {
       int i;
       String s = new String();
       for(i=0;i<c.length;++i)
       {
         s = s + c[i];
       }
       return convert(s);
    }
    
    /**
     * @param s StringBuffer representation of a float number
     * @return float value of the represented number
     */
    public static float convert(StringBuffer s) throws NumberFormatException
    {
        return convert(new String(s));
    }
    
}
