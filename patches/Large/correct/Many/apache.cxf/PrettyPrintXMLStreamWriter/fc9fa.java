diff --git a/api/src/main/java/org/apache/cxf/wsdl/PrettyPrintXMLStreamWriter.java b/api/src/main/java/org/apache/cxf/wsdl/PrettyPrintXMLStreamWriter.java
index 8acd158..1c6800e 100644
--- a/api/src/main/java/org/apache/cxf/wsdl/PrettyPrintXMLStreamWriter.java
+++ b/api/src/main/java/org/apache/cxf/wsdl/PrettyPrintXMLStreamWriter.java
@@ -217,12 +217,12 @@
     }
      
     public void writeStartElement(java.lang.String localName) throws XMLStreamException {
-        writeStartElement(null, null, localName);
+        writeStartElement(null, localName, null);
     }
      
     public void writeStartElement(java.lang.String namespaceURI, java.lang.String localName)
         throws XMLStreamException {
-        writeStartElement(null, namespaceURI, localName);
+        writeStartElement(null, localName, namespaceURI);
     }
      
     public void writeStartElement(java.lang.String prefix,
