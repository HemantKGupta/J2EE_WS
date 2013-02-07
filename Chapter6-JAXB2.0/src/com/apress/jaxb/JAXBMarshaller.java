package com.apress.jaxb;

import generated.*;

import javax.xml.bind.*;
import java.util.List;

public class JAXBMarshaller {
	public void generateXMLDocument() {
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance("generated");
			Marshaller marshaller = jaxbContext.createMarshaller();
			generated.ObjectFactory factory = new generated.ObjectFactory();

			CatalogType catalog = factory.createCatalogType();
			catalog.setSection("Java Technology");
			catalog.setPublisher("IBM developerWorks");

			JournalType journal = factory.createJournalType();
			ArticleType article = factory.createArticleType();

			article.setLevel("Intermediate");
			article.setDate("January-2004");
			article.setTitle("Service Oriented Architecture   Frameworks");
			article.setAuthor("Naveen Balani");

			List<JournalType> journalList = catalog.getJournal();
			journalList.add(journal);
			List<ArticleType> articleList = journal.getArticle();
			articleList.add(article);

			article = factory.createArticleType();

			article.setLevel("Advanced");
			article.setDate("October-2003");
			article.setTitle("Advance DAO Programming");
			article.setAuthor("Sean Sullivan");

			articleList = journal.getArticle();
			articleList.add(article);

			article = factory.createArticleType();

			article.setLevel("Advanced");
			article.setDate("May-2002");
			article.setTitle("Best Practices in EJB   Exception Handling");
			article.setAuthor("Srikanth Shenoy");
			articleList = journal.getArticle();

			articleList.add(article);
			JAXBElement<CatalogType> catalogElement=factory.createCatalog(catalog);
			marshaller.setProperty("jaxb.formatted.output",Boolean.TRUE);
			marshaller.marshal(catalogElement, System.out);

		}  catch (JAXBException e) {
			System.out.println(e.toString());

		}

	}

	public static void main(String[] argv) {
		
		JAXBMarshaller jaxbMarshaller = new JAXBMarshaller();
		jaxbMarshaller.generateXMLDocument();
	}
}
