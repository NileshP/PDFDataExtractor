package com.test;

import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PDFReaderSE {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		PdfReader reader = new PdfReader("d.pdf");
		int n = reader.getNumberOfPages();
		System.out.println("No. of Pages : "+n);
		
		for (int i = 1; i <= n; i++) {
		
			if(i==3){
			
			String pageContent = PdfTextExtractor.getTextFromPage(reader, i);
			System.out.println(pageContent);
			}
		}
		

	}

}
