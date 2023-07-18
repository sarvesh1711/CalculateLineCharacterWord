package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileReader;

	public class CalculateLineCharacterWord {


		    public static void main(String[] args) {
		        String fileName = "D:\\Batch 22\\aurionpro 22\\calculate line character word\\src\\com\\aurionpro\\test\\sarvesh.txt";

		        int linesFile = 0;
		        int charsFile = 0;
		        int wordsFile = 0;

		        try {
		            BufferedReader reader = new BufferedReader(new FileReader(fileName));
		            String line;

		            while ((line = reader.readLine()) != null) {
		                linesFile++;
		                charsFile += line.length();
		                wordsFile += line.split("\\s+").length;
		            }
		            System.out.println("Lines are :"+linesFile);
		            System.out.println("Characters are :"+charsFile);
		            System.out.println("words are :"+wordsFile);
		    }
		        catch(Exception e)
		        {
		        	e.printStackTrace();
		        }
		        }
	}
