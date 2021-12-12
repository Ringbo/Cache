diff --git a/src/test-deprecated/org/apache/lucene/index/TestIndexReader.java b/src/test-deprecated/org/apache/lucene/index/TestIndexReader.java
index 5678cef..a5bc12d 100644
--- a/src/test-deprecated/org/apache/lucene/index/TestIndexReader.java
+++ b/src/test-deprecated/org/apache/lucene/index/TestIndexReader.java
@@ -83,7 +83,7 @@
         // verify fields again
         reader = IndexReader.open(d);
         fieldNames = reader.getFieldNames();
-        assertEquals(9, fieldNames.size());    // the following fields + an empty one (bug?!)
+        assertEquals(8, fieldNames.size());    // the following fields
         assertTrue(fieldNames.contains("keyword"));
         assertTrue(fieldNames.contains("text"));
         assertTrue(fieldNames.contains("unindexed"));
@@ -105,7 +105,7 @@
 
         // verify that only unindexed fields were returned
         Collection unindexedFieldNames = reader.getFieldNames(false);
-        assertEquals(3, unindexedFieldNames.size());    // the following fields + an empty one
+        assertEquals(2, unindexedFieldNames.size());    // the following fields
         assertTrue(unindexedFieldNames.contains("unindexed"));
         assertTrue(unindexedFieldNames.contains("unindexed2"));
     }
