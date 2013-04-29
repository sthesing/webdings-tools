/* TextFiles.java - Copyright (c) 2005 by Stefan Thesing
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
package de.webdings.tools.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * TextFiles is used to write and read text files from and
 * to strings.
 * 
 * @author Stefan Thesing<br>
 * Website: <a href="http://www.webdings.de">http://www.webdings.de</a>
 * @version 1.0 26.05.2005
 */
public class TextFiles {
    /**
     * Writes a specified String to a text file
     * with a specified file name.
     * @param fileName Name of the text file
     * @param content content to be written
     * @throws IOException
     */
    public static void writeToFile(String fileName, String content) throws IOException {
        File f = new File(fileName);
        FileWriter w = new FileWriter(f);
        w.write(content);
        w.close();
    }
    /**
     * Reads the contents of the specified file
     * and returns it as a String
     * @param fileName Name of the file to be read
     * @return the contents of the file as a String
     * @throws IOException
     * @throws IOException
     */
    public static String readFromFile(String fileName) 
    	throws IOException
    {    
            File f = new File(fileName);
            int fileSize = (int) f.length();
            int chars_gelesen = 0;
            FileReader r = new FileReader(f);
            char[] buffer = new char[fileSize];
            while (r.ready())
            {
                chars_gelesen +=
                r.read(buffer, chars_gelesen, 
                        fileSize - chars_gelesen);
            }
            r.close();
            String s = new String(buffer, 0, chars_gelesen);
            return s;
    }
}
