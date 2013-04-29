/* CL.java - Copyright (c) 2005 by Stefan Thesing
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * CL (command line) gives basic simple command line
 * features. The "out"-methods simply print out data,
 * while the "lineOut"-methods print out data followed
 * by a line break.
 * The "in*"-Methods read data from keyboard input
 * followed by pressing of the Enter-key.
 * 
 * CL was created to make it easy for developers to 
 * use command-line interactivity in their 
 * Java-programs.
 * 
 * @author Stefan Thesing<br>
 * Website: <a href="http://www.webdings.de">http://www.webdings.de</a>
 * @version 1.0.1 26.05.2005
 */
public class CL {
//  Methods
	/**
	 * Prints out the contents of v to the console.
	 * @param v The variable to be given out by the program
	 */
	public static void out(String v) {
		System.out.print(v);
	}
	/**
	 * Prints out the contents of v to the console.
	 * @param v The variable to be given out by the program
	 */
	public static void out(int v) {
		System.out.print(v);
	}
	/**
	 * Prints out the contents of v to the console.
	 * @param v The variable to be given out by the program
	 */
	public static void out(boolean v) {
		System.out.print(v);
	}
	/**
	 * Prints out the contents of v to the console.
	 * @param v The variable to be given out by the program
	 */
	public static void out(float v) {
		System.out.print(v);
	}
	/**
	 * Prints out the contents of v to the console.
	 * @param v The variable to be given out by the program
	 */
	public static void out(short v) {
		System.out.print(v);
	}
	/**
	 * Prints out the contents of v to the console.
	 * @param v The variable to be given out by the program
	 */
	public static void out(double v) {
		System.out.print(v);
	}
	/**
	 * Prints out the contents of v to the console.
	 * @param v The variable to be given out by the program
	 */
	public static void out(char v) {
		System.out.print(v);
	}
	/**
	 * Prints out the contents of v to the console.
	 * @param v The variable to be given out by the program
	 */
	public static void out(char[] v) {
		System.out.print(v);
	}
	/**
	 * Prints out the contents of v to the console.
	 * @param v The variable to be given out by the program
	 */
	public static void out(Object v) {
		System.out.print(v);
	}
	/**
	 * Prints out the contents of v to the console.
	 * @param v The variable to be given out by the program
	 */
	public static void out(long v) {
		System.out.print(v);
	}
	/**
	 * Prints out the contents of v to the console, 
	 * followed by a line break.
	 * @param v The variable to be given out by the program
	 */
	public static void lineOut(String v) {
		System.out.println(v);
	}
	/**
	 * Prints out the contents of v to the console, 
	 * followed by a line break.
	 * @param v The variable to be given out by the program
	 */
	public static void lineOut(int v) {
		System.out.println(v);
	}
	/**
	 * Prints out the contents of v to the console, 
	 * followed by a line break.
	 * @param v The variable to be given out by the program
	 */
	public static void lineOut(boolean v) {
		System.out.println(v);
	}
	/**
	 * Prints out the contents of v to the console, 
	 * followed by a line break.
	 * @param v The variable to be given out by the program
	 */
	public static void lineOut(float v) {
		System.out.println(v);
	}
	/**
	 * Prints out the contents of v to the console, 
	 * followed by a line break.
	 * @param v The variable to be given out by the program
	 */
	public static void lineOut(short v) {
		System.out.println(v);
	}
	/**
	 * Prints out the contents of v to the console, 
	 * followed by a line break.
	 * @param v The variable to be given out by the program
	 */
	public static void lineOut(double v) {
		System.out.println(v);
	}
	/**
	 * Prints out the contents of v to the console, 
	 * followed by a line break.
	 * @param v The variable to be given out by the program
	 */
	public static void lineOut(char v) {
		System.out.println(v);
	}
	/**
	 * Prints out the contents of v to the console, 
	 * followed by a line break.
	 * @param v The variable to be given out by the program
	 */
	public static void lineOut(char[] v) {
		System.out.println(v);
	}
	/**
	 * Prints out the contents of v to the console, 
	 * followed by a line break.
	 * @param v The variable to be given out by the program
	 */
	public static void lineOut(Object v) {
		System.out.println(v);
	}
	/**
	 * Prints out the contents of v to the console, 
	 * followed by a line break.
	 * @param v The variable to be given out by the program
	 */
	public static void lineOut(long v) {
		System.out.println(v);
	}
	/**
	 * Prints out an empty line followed by a line break.
	 * Identical to {@link de.webdings.tools.CL#newLine()}.
	 */
	public static void lineOut() {
		System.out.println();
	}
	/**
	 * Prints out an empty line followed by a line break.
	 * Identical to {@link de.webdings.tools.CL#lineOut()}.
	 */
	public static void newLine() {
		lineOut();
	}
	/**
	 * @return a string read from keyboard user input.
	 * @throws IOException
	 */
	public static String inString() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		s = s.trim();
		return s;
	}
	/**
	 * @return an int read from keyboard user input.
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static int inInt() throws IOException, NumberFormatException {
		 return Integer.parseInt(inString());
	}
	/**
	 * is used for simple "yes or no"-Questions.
	 * It reads user input and returns <code>true</code>
	 * for "y", "Y", "yes", "YES", "yES", "yEs", "YEs" and
	 * <code>false</code> for "n", "N", "no", "NO", "nO", "No".<br>
	 * For anything else it will output "bad argument!"
	 * and restart the method.
	 * 
	 * @return true for yes and false for no
	 * @throws IOException
	 */
	public static boolean inYN() throws IOException {
		String s = inString();
		boolean b = false;
		if(s.equals("y")||
		   s.equals("Y")||
		   s.equals("yes")||
		   s.equals("YES")||
		   s.equals("yES")||
		   s.equals("yEs")||
		   s.equals("YEs")) {
				b=true;
		} else if(s.equals("n")||
				  s.equals("N")||
				  s.equals("no")||
				  s.equals("NO")||
				  s.equals("nO")||
				  s.equals("No")) {
				b=false;
		} else {
			System.out.println("bad argument!");
			b = inYN();
		}
		return b;
	}
	/**
	 * @return a float read from keyboard user input.
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static float inFloat() throws IOException, NumberFormatException {
		return Float.parseFloat(inString());
	}
	/**
	 * @return a short read from keyboard user input.
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static short inShort() throws IOException, NumberFormatException {
		return Short.parseShort(inString());
	}
	/**
	 * @return a long read from keyboard user input.
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static long inLong() throws IOException, NumberFormatException {
		return Long.parseLong(inString());
	}
}
