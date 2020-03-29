package wijas__problem1;

import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		String dataFile, outputFile;
		
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		
		try {
			duplicateRemover.remove(problem1.txt);
			duplicateRemover.write(unique_words.txt);
		} catch (IOException e) 
		{
			System.out.println("Error: Input/Output");
		}
		
	}

}
