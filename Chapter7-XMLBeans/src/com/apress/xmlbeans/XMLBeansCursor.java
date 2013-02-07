package com.apress.xmlbeans;

import java.io.File;
import java.io.IOException;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;

import noNamespace.*;
import noNamespace.impl.*;

import noNamespace.CatalogDocument;

public class XMLBeansCursor {

	public void selectWithXPath(File xmlFile) {
		try {
			CatalogDocument catalogDocument = CatalogDocument.Factory
					.parse(xmlFile);
			XmlCursor cursor = catalogDocument.newCursor();
			cursor.toFirstChild();
			cursor.push();
			cursor.selectPath("$this//title");
			while (cursor.toNextSelection()) {
				System.out.println(cursor.getTextValue());
			}
			cursor.pop();
		} catch (IOException e) {
		} catch (XmlException e) {
		}
	}

	public void selectWithXQuery(File xmlFile) {
		try {
			CatalogDocument catalogDocument = CatalogDocument.Factory
					.parse(xmlFile);
			XmlCursor cursor = catalogDocument.newCursor();

			String queryExpression = "for $a in $this/catalog/journal/article[1]"
					+ "return $a/@level";
			XmlCursor resultCursor = cursor.execQuery(queryExpression);

			System.out.println(resultCursor.getObject().toString() + "\n");

		} catch (IOException e) {
		} catch (XmlException e) {
		}
	}

	public void addElement(File xmlFile) {
		try {
			CatalogDocument catalogDocument = CatalogDocument.Factory
					.parse(xmlFile);
			XmlCursor cursor = catalogDocument.newCursor();
			cursor.toFirstContentToken();
			cursor.toFirstChild();
			cursor.beginElement("journal");
			cursor.insertAttributeWithValue("publisher", "IBM developerWorks");
			cursor.dispose();

			System.out.println(catalogDocument.toString());

		} catch (IOException e) {
		} catch (XmlException e) {
		}
	}

	public void navigateXMLDocument(File xmlFile) {
		try {
			CatalogDocument catalogDocument = CatalogDocument.Factory
					.parse(xmlFile);
			XmlCursor cursor = catalogDocument.newCursor();
			cursor.toFirstContentToken();
			cursor.toFirstChild();
			cursor.toFirstChild();
			cursor.toFirstChild();
			System.out.println(cursor.getTextValue());

			cursor.dispose();

		} catch (IOException e) {
		} catch (XmlException e) {
		}

	}

	public static void main(String[] args) {

		XMLBeansCursor xmlBeansCursor = new XMLBeansCursor();
		File xmlFile = new File("catalog.xml");
		
		/* xmlBeansCursor.navigateXMLDocument(xmlFile);
		xmlBeansCursor.addElement(xmlFile);
		 xmlBeansCursor.selectWithXPath(xmlFile);*/
		 xmlBeansCursor.selectWithXQuery(xmlFile);

	}

}
