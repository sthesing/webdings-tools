/* MailtoLinkEncoder.java - Copyright (c) 2005 by Stefan Thesing
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
import java.util.Random;
/**
 * MailToLinkEncoder is used encode the characters of an email address into browser-readable
 * mixed characters from decimal and hexadecimal html encodings. This is useful for 
 * mailto-links in html in order to make it harder for harvester programs that scan websites
 * for mailto-links and add them to spam-lists. 
 * 
 * @author Stefan Thesing<br>
 * Website: <a href="http://www.webdings.de">http://www.webdings.de</a>
 * @version 0.1 31.05.2005
 */
public class MailtoLinkEncoder {
    /**
     * @param eMailAdress
     * @return the encoded String
     * @throws Exception if the specified string contains characters that are not allowed in 
     * email addresses.
     */
    public static String encode(String eMailAdress) throws Exception {
        StringBuffer encoded = new StringBuffer();
        char[] array = eMailAdress.toCharArray();
        Random r = new Random();
        int encoding;
        String dec = new String();
        String hex = new String();
        for(int i=0;i<array.length;++i) {
          encoding = r.nextInt(3);
          if(array[i]== '-')
          {
              dec="&#45;";
              hex="&#x2D;";
          }
          else if(array[i]== '.')
          {
              dec="&#46;";
              hex="&#x2E;";
          } else if(array[i]== '0')
          {
              dec="&#48;";
              hex="&#x30;";
          } else if(array[i]== '1')
          {
              dec="&#49;";
              hex="&#x31;";
          } else if(array[i]== '2')
          {
              dec="&#50;";
              hex="&#x32;";
          } else if(array[i]== '3')
          {
              dec="&#51;";
              hex="&#x33;";
          } else if(array[i]== '4')
          {
              dec="&#52;";
              hex="&#x34;";
          } else if(array[i]== '5')
          {
              dec="&#53;";
              hex="&#x35;";
          } else if(array[i]== '6')
          {
              dec="&#54;";
              hex="&#x36;";
          } else if(array[i]== '7')
          {
              dec="&#55;";
              hex="&#x37;";
          } else if(array[i]== '8')
          {
              dec="&#56;";
              hex="&#x38;";
          } else if(array[i]== '9')
          {
              dec="&#57;";
              hex="&#x39;";
          } else if(array[i]== '@') 
          {
              dec="&#64;";
              hex="&#x40;";
          } else if(array[i]== 'A')
          {
              dec="&#65;";
              hex="&#x41;";
          } else if(array[i]== 'B')
          {
              dec="&#66;";
              hex="&#x42;";
          } else if(array[i]== 'C')
          {
              dec="&#67;";
              hex="&#x43;";
          } else if(array[i]== 'D')
          {
              dec="&#68;";
              hex="&#x44;";
          } else if(array[i]== 'E')
          {
              dec="&#69;";
              hex="&#x45;";
          } else if(array[i]== 'F')
          {
              dec="&#70;";
              hex="&#x46;";
          } else if(array[i]== 'G')
          {
              dec="&#71;";
              hex="&#x47;";
          } else if(array[i]== 'H')
          {
              dec="&#72;";
              hex="&#x48;";
          } else if(array[i]== 'C')
          {
              dec="&#67;";
              hex="&#x43;";
          } else if(array[i]== 'I')
          {
              dec="&#73;";
              hex="&#x49;";
          } else if(array[i]== 'J')
          {
              dec="&#74;";
              hex="&#x4A;";
          } else if(array[i]== 'K')
          {
              dec="&#75;";
              hex="&#x4B;";
          } else if(array[i]== 'L')
          {
              dec="&#76;";
              hex="&#x4C;";
          } else if(array[i]== 'M')
          {
              dec="&#77;";
              hex="&#x4D;";
          } else if(array[i]== 'N')
          {
              dec="&#78;";
              hex="&#x4E;";
          } else if(array[i]== 'O')
          {
              dec="&#79;";
              hex="&#x4F;";
          } else if(array[i]== 'P')
          {
              dec="&#80;";
              hex="&#x50;";
          } else if(array[i]== 'Q')
          {
              dec="&#81;";
              hex="&#x51;";
          } else if(array[i]== 'R')
          {
              dec="&#82;";
              hex="&#x52;";
          } else if(array[i]== 'S')
          {
              dec="&#83;";
              hex="&#x53;";
          } else if(array[i]== 'T')
          {
              dec="&#84;";
              hex="&#x54;";
          } else if(array[i]== 'U')
          {
              dec="&#85;";
              hex="&#x55;";
          } else if(array[i]== 'V')
          {
              dec="&#86;";
              hex="&#x56;";
          } else if(array[i]== 'W')
          {
              dec="&#87;";
              hex="&#x57;";
          } else if(array[i]== 'X')
          {
              dec="&#88;";
              hex="&#x58;";
          } else if(array[i]== 'Y')
          {
              dec="&#89;";
              hex="&#x59;";
          } else if(array[i]== 'Z')
          {
              dec="&#90;";
              hex="&#x5A;";
          } else if(array[i]== '_')
          {
              dec="&#95;";
              hex="&#x5F;";
          } else if(array[i]== 'a')
          {
              dec="&#97;";
              hex="&#x61;";
          } else if(array[i]== 'b')
          {
              dec="&#98;";
              hex="&#x62;";
          } else if(array[i]== 'c')
          {
              dec="&#99;";
              hex="&#x63;";
          } else if(array[i]== 'd')
          {
              dec="&#100;";
              hex="&#x64;";
          } else if(array[i]== 'e')
          {
              dec="&#101;";
              hex="&#x65;";
          } else if(array[i]== 'f')
          {
              dec="&#102;";
              hex="&#x66;";
          } else if(array[i]== 'g')
          {
              dec="&#103;";
              hex="&#x67;";
          } else if(array[i]== 'h')
          {
              dec="&#104;";
              hex="&#x68;";
          } else if(array[i]== 'i')
          {
              dec="&#105;";
              hex="&#x69;";
          } else if(array[i]== 'j')
          {
              dec="&#106;";
              hex="&#x6A;";
          } else if(array[i]== 'k')
          {
              dec="&#107;";
              hex="&#x6B;";
          } else if(array[i]== 'l')
          {
              dec="&#108;";
              hex="&#x6C;";
          } else if(array[i]== 'm')
          {
              dec="&#109;";
              hex="&#x6D;";
          } else if(array[i]== 'n')
          {
              dec="&#110;";
              hex="&#x6E;";
          } else if(array[i]== 'o')
          {
              dec="&#111;";
              hex="&#x6F;";
          } else if(array[i]== 'p')
          {
              dec="&#112;";
              hex="&#x70;";
          } else if(array[i]== 'q')
          {
              dec="&#113;";
              hex="&#x71;";
          } else if(array[i]== 'r')
          {
              dec="&#114;";
              hex="&#x72;";
          } else if(array[i]== 's')
          {
              dec="&#115;";
              hex="&#x73;";
          } else if(array[i]== 't')
          {
              dec="&#116;";
              hex="&#x74;";
          } else if(array[i]== 'u')
          {
              dec="&#117;";
              hex="&#x75;";
          } else if(array[i]== 'v')
          {
              dec="&#118;";
              hex="&#x76;";
          } else if(array[i]== 'w')
          {
              dec="&#119;";
              hex="&#x77;";
          } else if(array[i]== 'x')
          {
              dec="&#120;";
              hex="&#x78;";
          } else if(array[i]== 'y')
          {
              dec="&#121;";
              hex="&#x79;";
          } else if(array[i]== 'z')
          {
              dec="&#122;";
              hex="&#x7A;";
          } else {
              throw new Exception("This is no valid E-Mail address!");
          }
          
          if(encoding==0) {
              encoded.append(dec);
          } else if(encoding==1) {
              encoded.append(hex);
          } else {
              encoded.append(array[i]);
          }
        }
        return new String(encoded); 
    }
}
