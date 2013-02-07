package com.apress.xmlbeans;

import noNamespace.*;
import noNamespace.impl.*;

public class XMLBeansMarshaller {

	public CatalogDocument createCatalog() {
		CatalogDocument catalogDoc =CatalogDocument.Factory.newInstance();
		CatalogDocument.Catalog	catalog = catalogDoc.addNewCatalog();
		JournalDocument.Journal	journal = catalog.addNewJournal();

		journal.setPublisher("IBM developerWorks");
		ArticleDocument.Article	article = journal.addNewArticle();
		article.setTitle("Service Oriented Architecture Frameworks");
		article.setAuthor("Naveen Balani");
		article.setLevel("Intermediate");
		article.setDate("January-2004");
		article.setSection("Java Technology");

		article = journal.addNewArticle();
		article.setTitle("Advance DAO Programming");
		article.setAuthor("Sean Sullivan");
		article.setLevel("Advanced");
		article.setDate("October-2003");
		article.setSection("Java Technology");

		article = journal.addNewArticle();
		article.setTitle("Best Practices in EJB Exception Handling");
		article.setAuthor("Srikanth Shenoy");
		article.setLevel("Advanced");
		article.setDate("May-2002");
		article.setSection("Java Technology");

		System.out.println(catalogDoc);
		return catalogDoc;

	}

	public static void main(String[] argv) {

		XMLBeansMarshaller marshaller = new XMLBeansMarshaller();
		marshaller.createCatalog();

	}
}
