package pp3;

import java.io.*;
import java.util.Scanner;

/*
 * Keegan Dwyer
 * COSC211 - Programming Project 3
 * 4/12/20
 */

public class main {
	public static void main(String[] args) {	// Main driver method
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter directory name (ex. /users/you/folder/): ");	// Prompts user for directory
		String dirName = kb.nextLine();
		File directory = new File(dirName);	// Turns string into file object (directory path)

		if (directory.isDirectory()) {
			System.out.println("===================");

			System.out.print("Number of Files: ");
			System.out.println(countFiles(directory));	// Calls countFiles method, passing in the directory
			System.out.println("===================");

			System.out.println("List of Files: ");
			displayFiles(directory);	// Calls displayFiles method, passing in the directory
			System.out.println("===================");

			System.out.println("Enter file name to search for (ex. /Users/you/.../yourfile.pdf): ");
			String findFile = kb.nextLine();
			File find = new File(findFile);
			
			if (fileFound(directory, find)) {	// Calls fileFound and determines message based on input
				System.out.println(findFile + " was found.");
			}
			else {
				System.out.println("File could not be found.");
			}
				
			System.out.println("===================");

		} else {
			System.out.print("Entered directory cannot be found. Program ending...");
		}
	}

	private static int countFiles(File dir) {	// Counts the total number of files in the directory (and sub-directories)
		int fileCount = 0;
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (int i = 0; files != null & i < files.length; i++)
				fileCount = fileCount + countFiles(files[i]);
		} else
			fileCount = fileCount + 1;

		return fileCount;
	}

	private static void displayFiles(File dir) {	// Displays all files within the directory and sub-directories
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				System.out.print("\t");
				System.out.println(file.getName());
			}
			if (file.isDirectory()) {
				System.out.print(file.getName());
				System.out.print("\n");
				displayFiles(file);
			}
		}
	}
	
	private static boolean fileFound(File dir, File findFile) {	// Checks for a file within the given directory and returns true/false
		if (findFile.exists()) {
			return true;
		}
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.getName().equals(findFile.getName())) {
				return true;
			} else if (file.isDirectory()) {
				fileFound(file, findFile);
			}
		}
		return false;
	}
}
