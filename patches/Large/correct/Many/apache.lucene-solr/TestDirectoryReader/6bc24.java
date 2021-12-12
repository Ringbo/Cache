diff --git a/lucene/core/src/test/org/apache/lucene/index/TestDirectoryReader.java b/lucene/core/src/test/org/apache/lucene/index/TestDirectoryReader.java
index 63af9bf..26b7c26 100644
--- a/lucene/core/src/test/org/apache/lucene/index/TestDirectoryReader.java
+++ b/lucene/core/src/test/org/apache/lucene/index/TestDirectoryReader.java
@@ -613,7 +613,7 @@
     
     // check dictionary and posting lists
     FieldsEnum fenum1 = MultiFields.getFields(index1).iterator();
-    FieldsEnum fenum2 = MultiFields.getFields(index1).iterator();
+    FieldsEnum fenum2 = MultiFields.getFields(index2).iterator();
     String field1 = null;
     Bits liveDocs = MultiFields.getLiveDocs(index1);
     while((field1=fenum1.next()) != null) {
