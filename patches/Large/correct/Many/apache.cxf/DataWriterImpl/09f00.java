diff --git a/rt/databinding/xmlbeans/src/main/java/org/apache/cxf/xmlbeans/DataWriterImpl.java b/rt/databinding/xmlbeans/src/main/java/org/apache/cxf/xmlbeans/DataWriterImpl.java
index bd59818..5ac1024 100755
--- a/rt/databinding/xmlbeans/src/main/java/org/apache/cxf/xmlbeans/DataWriterImpl.java
+++ b/rt/databinding/xmlbeans/src/main/java/org/apache/cxf/xmlbeans/DataWriterImpl.java
@@ -96,8 +96,7 @@
 
                 if (!st.isDocumentType()) {
                     if (StringUtils.isEmpty(part.getConcreteName().getNamespaceURI())) {
-                        output.writeStartElement(part.getConcreteName().getNamespaceURI(),
-                                                 part.getConcreteName().getLocalPart());
+                        output.writeStartElement(part.getConcreteName().getLocalPart());
                         
                     } else {
                         String pfx = output.getPrefix(part.getConcreteName().getNamespaceURI());
