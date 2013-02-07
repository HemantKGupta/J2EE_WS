/*
 * An XML document type.
 * Localname: article
 * Namespace: 
 * Java type: noNamespace.ArticleDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one article(@) element.
 *
 * This is a complex type.
 */
public class ArticleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ArticleDocument
{
    
    public ArticleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARTICLE$0 = 
        new javax.xml.namespace.QName("", "article");
    
    
    /**
     * Gets the "article" element
     */
    public noNamespace.ArticleDocument.Article getArticle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ArticleDocument.Article target = null;
            target = (noNamespace.ArticleDocument.Article)get_store().find_element_user(ARTICLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "article" element
     */
    public void setArticle(noNamespace.ArticleDocument.Article article)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ArticleDocument.Article target = null;
            target = (noNamespace.ArticleDocument.Article)get_store().find_element_user(ARTICLE$0, 0);
            if (target == null)
            {
                target = (noNamespace.ArticleDocument.Article)get_store().add_element_user(ARTICLE$0);
            }
            target.set(article);
        }
    }
    
    /**
     * Appends and returns a new empty "article" element
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
     * An XML article(@).
     *
     * This is a complex type.
     */
    public static class ArticleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ArticleDocument.Article
    {
        
        public ArticleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName AUTHOR$2 = 
            new javax.xml.namespace.QName("", "author");
        private static final javax.xml.namespace.QName LEVEL$4 = 
            new javax.xml.namespace.QName("", "level");
        private static final javax.xml.namespace.QName DATE$6 = 
            new javax.xml.namespace.QName("", "date");
        private static final javax.xml.namespace.QName SECTION$8 = 
            new javax.xml.namespace.QName("", "section");
        
        
        /**
         * Gets the "title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" element
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" element
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
                }
                target.set(title);
            }
        }
        
        /**
         * Gets the "author" element
         */
        public java.lang.String getAuthor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHOR$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "author" element
         */
        public org.apache.xmlbeans.XmlString xgetAuthor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHOR$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "author" element
         */
        public void setAuthor(java.lang.String author)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHOR$2);
                }
                target.setStringValue(author);
            }
        }
        
        /**
         * Sets (as xml) the "author" element
         */
        public void xsetAuthor(org.apache.xmlbeans.XmlString author)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHOR$2);
                }
                target.set(author);
            }
        }
        
        /**
         * Gets the "level" attribute
         */
        public java.lang.String getLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "level" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVEL$4);
                return target;
            }
        }
        
        /**
         * True if has "level" attribute
         */
        public boolean isSetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LEVEL$4) != null;
            }
        }
        
        /**
         * Sets the "level" attribute
         */
        public void setLevel(java.lang.String level)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$4);
                }
                target.setStringValue(level);
            }
        }
        
        /**
         * Sets (as xml) the "level" attribute
         */
        public void xsetLevel(org.apache.xmlbeans.XmlString level)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LEVEL$4);
                }
                target.set(level);
            }
        }
        
        /**
         * Unsets the "level" attribute
         */
        public void unsetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LEVEL$4);
            }
        }
        
        /**
         * Gets the "date" attribute
         */
        public java.lang.String getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "date" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATE$6);
                return target;
            }
        }
        
        /**
         * True if has "date" attribute
         */
        public boolean isSetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATE$6) != null;
            }
        }
        
        /**
         * Sets the "date" attribute
         */
        public void setDate(java.lang.String date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATE$6);
                }
                target.setStringValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "date" attribute
         */
        public void xsetDate(org.apache.xmlbeans.XmlString date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DATE$6);
                }
                target.set(date);
            }
        }
        
        /**
         * Unsets the "date" attribute
         */
        public void unsetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATE$6);
            }
        }
        
        /**
         * Gets the "section" attribute
         */
        public java.lang.String getSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECTION$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "section" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECTION$8);
                return target;
            }
        }
        
        /**
         * True if has "section" attribute
         */
        public boolean isSetSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SECTION$8) != null;
            }
        }
        
        /**
         * Sets the "section" attribute
         */
        public void setSection(java.lang.String section)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECTION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SECTION$8);
                }
                target.setStringValue(section);
            }
        }
        
        /**
         * Sets (as xml) the "section" attribute
         */
        public void xsetSection(org.apache.xmlbeans.XmlString section)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECTION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SECTION$8);
                }
                target.set(section);
            }
        }
        
        /**
         * Unsets the "section" attribute
         */
        public void unsetSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SECTION$8);
            }
        }
    }
}
