diff --git a/src/test/org/apache/lucene/index/TestSegmentReader.java b/src/test/org/apache/lucene/index/TestSegmentReader.java
index 507ac3c..86369cc 100644
--- a/src/test/org/apache/lucene/index/TestSegmentReader.java
+++ b/src/test/org/apache/lucene/index/TestSegmentReader.java
@@ -106,7 +106,7 @@
   public void testGetFieldNameVariations() {
     Collection result = reader.getFieldNames();
     assertTrue(result != null);
-    assertTrue(result.size() == 7);
+    assertTrue(result.size() == 6);
     for (Iterator iter = result.iterator(); iter.hasNext();) {
       String s = (String) iter.next();
       //System.out.println("Name: " + s);
@@ -122,7 +122,7 @@
     
     result = reader.getFieldNames(false);
     assertTrue(result != null);
-    assertTrue(result.size() == 2);
+    assertTrue(result.size() == 1);
     //Get all indexed fields that are storing term vectors
     result = reader.getIndexedFieldNames(true);
     assertTrue(result != null);
