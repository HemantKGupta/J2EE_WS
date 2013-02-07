/*
 * An XML document type.
 * Localname: catalog
 * Namespace: 
 * Java type: noNamespace.CatalogDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one catalog(@) element.
 *
 * This is a complex type.
 */
public class CatalogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CatalogDocument
{
    
    public CatalogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATALOG$0 = 
        new javax.xml.namespace.QName("", "catalog");
    
    
    /**
     * Gets the "catalog" element
     */
    public noNamespace.CatalogDocument.Catalog getCatalog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CatalogDocument.Catalog target = null;
            target = (noNamespace.CatalogDocument.Catalog)get_store().find_element_user(CATALOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "catalog" element
     */
    public void setCatalog(noNamespace.CatalogDocument.Catalog catalog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CatalogDocument.Catalog target = null;
            target = (noNamespace.CatalogDocument.Catalog)get_store().find_element_user(CATALOG$0, 0);
            if (target == null)
            {
                target = (noNamespace.CatalogDocument.Catalog)get_store().add_element_user(CATALOG$0);
            }
            target.set(catalog);
        }
    }
    
    /**
     * Appends and returns a new empty "catalog" element
     */
    public noNamespace.CatalogDocument.Catalog addNewCatalog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CatalogDocument.Catalog target = null;
            target = (noNamespace.CatalogDocument.Catalog)get_store().add_element_user(CATALOG$0);
            return target;
        }
    }
    /**
     * An XML catalog(@).
     *
     * This is a complex type.
     */
    public static class CatalogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CatalogDocument.Catalog
    {
        
        public CatalogImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName JOURNAL$0 = 
            new javax.xml.namespace.QName("", "journal");
        
        
        /**
         * Gets array of all "journal" elements
         */
        public noNamespace.JournalDocument.Journal[] getJournalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(JOURNAL$0, targetList);
                noNamespace.JournalDocument.Journal[] result = new noNamespace.JournalDocument.Journal[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "journal" element
         */
        public noNamespace.JournalDocument.Journal getJournalArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.JournalDocument.Journal target = null;
                target = (noNamespace.JournalDocument.Journal)get_store().find_element_user(JOURNAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "journal" element
         */
        public int sizeOfJournalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JOURNAL$0);
            }
        }
        
        /**
         * Sets array of all "journal" element
         */
        public void setJournalArray(noNamespace.JournalDocument.Journal[] journalArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(journalArray, JOURNAL$0);
            }
        }
        
        /**
         * Sets ith "journal" element
         */
        public void setJournalArray(int i, noNamespace.JournalDocument.Journal journal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.JournalDocument.Journal target = null;
                target = (noNamespace.JournalDocument.Journal)get_store().find_element_user(JOURNAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(journal);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "journal" element
         */
        public noNamespace.JournalDocument.Journal insertNewJournal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.JournalDocument.Journal target = null;
                target = (noNamespace.JournalDocument.Journal)get_store().insert_element_user(JOURNAL$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "journal" element
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
         * Removes the ith "journal" element
         */
        public void removeJournal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JOURNAL$0, i);
            }
        }
    }
}
