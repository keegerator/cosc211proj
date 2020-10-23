****************************************
Keegan Dwyer
Gathering Directory Info Using Recursion
COSC211 - Programming Project 3
4/12/20
****************************************

To use this program, it will prompt for a directory to be entered. If the directory entered does not exist or could not be found, the program will terminate after displaying an error message. Use the correct formatting (/Users/you/.../) for the directory. After giving a total file count, it will then list out all files, sub-directories, and their files until it reaches the final one.

After this, it will prompt for a file name to search for within. If the file is found, it will display a message saying so, otherwise it will tell you it could not be found. The program will then terminate.

List of Classes
- main

List of Methods
- main
	runs the program
- countFiles(File dir)
	Takes in the directory path and counts the total files within (including subdirectories)
- displayFiles(File dir)
	Takes in the directory path and recursively displays the name of all files and subdirectories (and those files) with minimal formatting
- fileFound(File dir, File findFile)
	Takes in the directory path and the path of a file to search for. If found, returns a message confirming or denying if the file was found