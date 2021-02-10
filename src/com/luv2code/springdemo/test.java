package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class test {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		FileReader fr;
		try {
			fr = new FileReader("/home/ddrew/Desktop/newFortune.txt");
			
			int i; 
			while ((i=fr.read()) != -1)
				System.out.print((char) i);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
