diff --git a/camel-core/src/main/java/org/apache/camel/converter/jaxp/XMLStreamReaderInputStream.java b/camel-core/src/main/java/org/apache/camel/converter/jaxp/XMLStreamReaderInputStream.java
index 1e3158f..96783d4 100644
--- a/camel-core/src/main/java/org/apache/camel/converter/jaxp/XMLStreamReaderInputStream.java
+++ b/camel-core/src/main/java/org/apache/camel/converter/jaxp/XMLStreamReaderInputStream.java
@@ -39,7 +39,7 @@
     private String charset;
     private int bpos;
 
-    public XMLStreamReaderInputStream(XMLStreamReader reader, String charset, XMLOutputFactory outfactory) {
+    XMLStreamReaderInputStream(XMLStreamReader reader, String charset, XMLOutputFactory outfactory) {
         this.reader = reader;
         this.buffer = new byte[BUFFER_SIZE];
         this.chunk = new TrimmableByteArrayOutputStream();
@@ -51,7 +51,7 @@
         }
     }
 
-    public XMLStreamReaderInputStream(XMLStreamReader reader, XMLOutputFactory outfactory) {
+    XMLStreamReaderInputStream(XMLStreamReader reader, XMLOutputFactory outfactory) {
         this(reader, "utf-8", outfactory);
     }
 
