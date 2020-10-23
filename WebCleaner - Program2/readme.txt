/*
 * COSC211 Programming Project #2
 * ---------------------------------
 * Jesse Rogalski
 * Keegan Dwyer
 * 3/17/20
 * ---------------------------------
 * This program asks for a URL and then creates a file with the text from said URL
 **/

PROGRAM DESCRIPTION:
The project was designed with only one class (WebPageReader) with its own respective main method. When running the program, you will be prompted for a URL for the Scanner object to read and the name of a text file to store the scraped web data on via PrintWriter. The program will then proceed to read the webpage, whilst filtering the HTML, XML, JavaScript, and CSS code to print out simply the body of the webpage in text only. This output will both be in the console and the text file specified by the user.