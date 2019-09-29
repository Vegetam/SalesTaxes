package com.francescomalagrino.salesTaxes.helpers.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.atteo.evo.inflector.English;

import com.francescomalagrino.salesTaxes.exceptions.WordsFileException;

public class ReadFileManager {
	
	private static ReadFileManager instance;
	
	private ClassLoader classLoader;
	
	private ReadFileManager() {
		
		classLoader = getClass().getClassLoader();
	}
	
	public static ReadFileManager getInstance() {
		
		if (instance == null) {
			instance = new ReadFileManager();
		}
		
		return instance;
	}

	public List<String> getWords(String fileName, boolean withPlural) throws WordsFileException {
		
		List<String> returnValue = new ArrayList<String>();
		
		InputStream inputStream = classLoader.getResourceAsStream(fileName);
		
		BufferedReader br = null;
		
		try {
		        
			br = new BufferedReader(new InputStreamReader(inputStream));
			
			String stopword = null;
			while ((stopword = br.readLine()) != null) {
				
				if (stopword == null || stopword.isEmpty()) {
					continue;
				}
				
				stopword = stopword.toUpperCase();
				
				returnValue.add(stopword);
				
				// To insert the plural
				if (withPlural) {
					String plural = English.plural(stopword);
					if (plural != null && !plural.isEmpty() && !plural.equals(stopword)) {
						returnValue.add(plural);
					}
				}
			}
	        
		} catch (IOException e) {
			
			e.printStackTrace();
			throw new WordsFileException(e.getMessage());
			
		} catch (NullPointerException e) {
			
			e.printStackTrace();
			throw new WordsFileException(e.getMessage());
			
		} finally {
			
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return returnValue;
	}
}
