diff --git a/camel-core/src/main/java/org/apache/camel/converter/jaxp/XMLStreamReaderReader.java b/camel-core/src/main/java/org/apache/camel/converter/jaxp/XMLStreamReaderReader.java
index 571c21b..207f273 100644
--- a/camel-core/src/main/java/org/apache/camel/converter/jaxp/XMLStreamReaderReader.java
+++ b/camel-core/src/main/java/org/apache/camel/converter/jaxp/XMLStreamReaderReader.java
@@ -38,7 +38,7 @@
     private char[] buffer;
     private int bpos;
 
-    public XMLStreamReaderReader(XMLStreamReader reader, XMLOutputFactory outfactory) {
+    XMLStreamReaderReader(XMLStreamReader reader, XMLOutputFactory outfactory) {
         this.reader = reader;
         this.buffer = new char[BUFFER_SIZE];
         this.chunk = new TrimmableCharArrayWriter();
