diff --git a/adapters/saml/as7-eap6/subsystem/src/main/java/org/keycloak/subsystem/saml/as7/xml/FormattingXMLStreamWriter.java b/adapters/saml/as7-eap6/subsystem/src/main/java/org/keycloak/subsystem/saml/as7/xml/FormattingXMLStreamWriter.java
index 0d56659..2334a63 100644
--- a/adapters/saml/as7-eap6/subsystem/src/main/java/org/keycloak/subsystem/saml/as7/xml/FormattingXMLStreamWriter.java
+++ b/adapters/saml/as7-eap6/subsystem/src/main/java/org/keycloak/subsystem/saml/as7/xml/FormattingXMLStreamWriter.java
@@ -81,7 +81,7 @@
     public void writeStartElement(final String localName) throws XMLStreamException {
         ArrayDeque<String> namespaces = unspecifiedNamespaces;
         String namespace = namespaces.getFirst();
-        if (namespace != NO_NAMESPACE) {
+        if (namespace == null ? NO_NAMESPACE != null : ! namespace.equals(NO_NAMESPACE)) {
             writeStartElement(namespace, localName);
             return;
         }
@@ -140,9 +140,9 @@
         attrQueue.add(new ArgRunnable() {
             public void run(int arg) throws XMLStreamException {
                 if (arg == 0) {
-                    delegate.writeStartElement(prefix, namespaceURI, localName);
+                    delegate.writeStartElement(prefix, localName, namespaceURI);
                 } else {
-                    delegate.writeEmptyElement(prefix, namespaceURI, localName);
+                    delegate.writeEmptyElement(prefix, localName, namespaceURI);
                 }
             }
         });
@@ -165,14 +165,14 @@
         runAttrQueue();
         nl();
         indent();
-        delegate.writeEmptyElement(prefix, namespaceURI, localName);
+        delegate.writeEmptyElement(prefix, localName, namespaceURI);
         state = END_ELEMENT;
     }
 
     @Override
     public void writeEmptyElement(final String localName) throws XMLStreamException {
         String namespace = unspecifiedNamespaces.getFirst();
-        if (namespace != NO_NAMESPACE) {
+        if (namespace == null ? NO_NAMESPACE != null : ! namespace.equals(NO_NAMESPACE)) {
             writeEmptyElement(namespace, localName);
             return;
         }
