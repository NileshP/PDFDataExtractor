package com.test;

import java.io.IOException;
import java.util.Set;

import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;

public class PDFReader {
	public static void main(String[] args) throws IOException {

		PdfReader reader = new PdfReader("d.pdf");
		int n = reader.getNumberOfPages();

		System.out.println("No. of Pages: "+n);
		
		AcroFields fields = reader.getAcroFields();

		Set<String> fldname = fields.getFields().keySet();

		for (String string : fldname) {

			System.out.println(fields.getFieldType(string));
			System.out.println(string + "------" + fields.getField(string));

			if (string.contains("c1_1")) {

				String[] states = fields.getAppearanceStates(string);
				System.out.println("\t\t State length is " + states.length);
				for (int i = 0; i < states.length; i++) {

					System.out.println("\t\t" + states[i]);

				}
			}

		}

	}

}
