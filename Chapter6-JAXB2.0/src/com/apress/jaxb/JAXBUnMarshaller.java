package com.apress.jaxb;

import generated.*;

import javax.xml.bind.*;

import java.io.File;
import java.util.List;

public class JAXBUnMarshaller {
	public void unMarshall(File xmlDocument) {
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance("generated");

			Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();

			JAXBElement<CatalogType> catalogElement = (JAXBElement<CatalogType>) unMarshaller.unmarshal(xmlDocument);
			CatalogType catalog=catalogElement.getValue();

			System.out.println("Section: " + catalog.getSection());
			System.out.println("Publisher: " + catalog.getPublisher());
			List<JournalType> journalList = catalog.getJournal();
			for (int i = 0; i < journalList.size(); i++) {

				JournalType journal = (JournalType) journalList.get(i);

				List<ArticleType> articleList = journal.getArticle();
				for (int j = 0; j < articleList.size(); j++) {
					ArticleType article = (ArticleType)articleList.get(j);

					System.out.println("Article Date: " + article.getDate());
					System.out.println("Level: " + article.getLevel());
					System.out.println("Title: " + article.getTitle());
					System.out.println("Author: " + article.getAuthor());

				}
			}
		} catch (JAXBException e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] argv) {
		File xmlDocument = new File("catalog.xml");
		JAXBUnMarshaller jaxbUnmarshaller = new JAXBUnMarshaller();
		jaxbUnmarshaller.unMarshall(xmlDocument);
	}
}
