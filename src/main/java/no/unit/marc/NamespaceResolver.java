package no.unit.marc;

import org.w3c.dom.Document;

import javax.xml.namespace.NamespaceContext;
import java.util.Iterator;

import static org.marc4j.Constants.MARCXML_NS_URI;

public class NamespaceResolver implements NamespaceContext {

    // the delegate
    private final transient Document sourceDocument;

    /**
     * This constructor stores the source document to search the namespaces in
     * it.
     *
     * @param document source document
     */
    public NamespaceResolver(Document document) {
        sourceDocument = document;
    }

    /**
     * The lookup for the namespace uris is delegated to the stored document.
     *
     * @param prefix to search for
     * @return uri
     */
    @Override
    public String getNamespaceURI(String prefix) {
        return MARCXML_NS_URI;
    }

    /**
     * This method is not needed in this context, but can be implemented in a
     * similar way.
     */
    @Override
    public String getPrefix(String namespaceURI) {
        return sourceDocument.lookupPrefix(namespaceURI);
    }

    @Override
    public Iterator<String> getPrefixes(String namespaceURI) {
        // not implemented yet
        return null;
    }

}
