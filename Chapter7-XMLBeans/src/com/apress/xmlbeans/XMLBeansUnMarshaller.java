package com.apress.xmlbeans;

import noNamespace.*;
import noNamespace.impl.*;
import java.io.File;

public class XMLBeansUnMarshaller {
	public void printElements(File file) {
		try {
			CatalogDocument catalogDocument = CatalogDocument.Factory
					.parse(file);

			CatalogDocument.Catalog catalog = catalogDocument.getCatalog();

			JournalDocument.Journal[] journalArray = catalog.getJournalArray();

			System.out.println("Catalog has " + journalArray.length
					+ " journal elements");

			for (int i = 0; i < journalArray.length; i++) {
				System.out.println("Journal: " + i);
				System.out.println(" publisher : "
						+ journalArray[i].getPublisher());
				ArticleDocument.Article[] articleArray = journalArray[i]
						.getArticleArray();

				for (int j = 0; j < articleArray.length; j++) {
					System.out.println("Article: " + j);
					System.out.println("Level : " + articleArray[j].getLevel());
					System.out.println("Date : " + articleArray[j].getDate());
					System.out.println("Section : "
							+ articleArray[j].getSection());
					System.out.println("Title : " + articleArray[j].getTitle());
					System.out.println("Author : "
							+ articleArray[j].getAuthor());

				}

			}
		} catch (org.apache.xmlbeans.XmlException e) {
		} catch (java.io.IOException e) {
		}

	}

	public static void main(String[] argv) {

		XMLBeansUnMarshaller unmarshaller = new XMLBeansUnMarshaller();
		unmarshaller.printElements(new File("catalog.xml"));

	}
}
