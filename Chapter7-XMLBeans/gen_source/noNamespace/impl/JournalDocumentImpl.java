/*
 * An XML document type.
 * Localname: journal
 * Namespace: 
 * Java type: noNamespace.JournalDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one journal(@) element.
 *
 * This is a complex type.
 */
public class JournalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.JournalDocument
{
    
    public JournalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOURNAL$0 = 
        new javax.xml.namespace.QName("", "journal");
    
    
    /**
     * Gets the "journal" element
     */
    public noNamespace.JournalDocument.Journal getJournal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.JournalDocument.Journal target = null;
            target = (noNamespace.JournalDocument.Journal)get_store().find_element_user(JOURNAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "journal" element
     */
    public void setJournal(noNamespace.JournalDocument.Journal journal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.JournalDocument.Journal target = null;
            target = (noNamespace.JournalDocument.Journal)get_store().find_element_user(JOURNAL$0, 0);
            if (target == null)
            {
                target = (noNamespace.JournalDocument.Journal)get_store().add_element_user(JOURNAL$0);
            }
            target.set(journal);
        }
    }
    
    /**
     * Appends and returns a new empty "journal" element
     */
    public noNamespace.JournalDocument.Journal addNewJournal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.JournalDocument.Journal target = null;
            target = (noNamespace.JournalDocument.Journal)get_store().add_element_user(JOURNAL$0);
            return target;
        }
    }
    /**
     * An XML journal(@).
     *
     * This is a complex type.
     */
    public static class JournalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.JournalDocument.Journal
    {
        
        public JournalImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARTICLE$0 = 
            new javax.xml.namespace.QName("", "article");
        private static final javax.xml.namespace.QName PUBLISHER$2 = 
            new javax.xml.namespace.QName("", "publisher");
        
        
        /**
         * Gets array of all "article" elements
         */
        public noNamespace.ArticleDocument.Article[] getArticleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ARTICLE$0, targetList);
                noNamespace.ArticleDocument.Article[] result = new noNamespace.ArticleDocument.Article[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "article" element
         */
        public noNamespace.ArticleDocument.Article getArticleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ArticleDocument.Article target = null;
                target = (noNamespace.ArticleDocument.Article)get_store().find_element_user(ARTICLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "article" element
         */
        public int sizeOfArticleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARTICLE$0);
            }
        }
        
        /**
         * Sets array of all "article" element
         */
        public void setArticleArray(noNamespace.ArticleDocument.Article[] articleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(articleArray, ARTICLE$0);
            }
        }
        
        /**
         * Sets ith "article" element
         */
        public void setArticleArray(int i, noNamespace.ArticleDocument.Article article)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ArticleDocument.Article target = null;
                target = (noNamespace.ArticleDocument.Article)get_store().find_element_user(ARTICLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(article);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "article" element
         */
        public noNamespace.ArticleDocument.Article insertNewArticle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ArticleDocument.Article target = null;
                target = (noNamespace.ArticleDocument.Article)get_store().insert_element_user(ARTICLE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "article" element
         */
        public noNamespace.ArticleDocument.Article addNewArticle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ArticleDocument.Article target = null;
                target = (noNamespace.ArticleDocument.Article)get_store().add_element_user(ARTICLE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "article" element
         */
        public void removeArticle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARTICLE$0, i);
            }
        }
        
        /**
         * Gets the "publisher" attribute
         */
        public java.lang.String getPublisher()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHER$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "publisher" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPublisher()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHER$2);
                return target;
            }
        }
        
        /**
         * True if has "publisher" attribute
         */
        public boolean isSetPublisher()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PUBLISHER$2) != null;
            }
        }
        
        /**
         * Sets the "publisher" attribute
         */
        public void setPublisher(java.lang.String publisher)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLISHER$2);
                }
                target.setStringValue(publisher);
            }
        }
        
        /**
         * Sets (as xml) the "publisher" attribute
         */
        public void xsetPublisher(org.apache.xmlbeans.XmlString publisher)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PUBLISHER$2);
                }
                target.set(publisher);
            }
        }
        
        /**
         * Unsets the "publisher" attribute
         */
        public void unsetPublisher()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PUBLISHER$2);
            }
        }
    }
}
