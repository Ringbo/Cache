diff --git a/src/test/java/org/elasticsearch/test/unit/common/compress/CompressIndexInputOutputTests.java b/src/test/java/org/elasticsearch/test/unit/common/compress/CompressIndexInputOutputTests.java
index 42465aa..4111466 100644
--- a/src/test/java/org/elasticsearch/test/unit/common/compress/CompressIndexInputOutputTests.java
+++ b/src/test/java/org/elasticsearch/test/unit/common/compress/CompressIndexInputOutputTests.java
@@ -292,7 +292,7 @@
             Document document = reader.document(doc);
             checkDoc(document);
             DocumentStoredFieldVisitor visitor = new DocumentStoredFieldVisitor("id", "field", "count");
-            reader.document(i, visitor);
+            reader.document(doc, visitor);
             document = visitor.getDocument();
             checkDoc(document);
         }
