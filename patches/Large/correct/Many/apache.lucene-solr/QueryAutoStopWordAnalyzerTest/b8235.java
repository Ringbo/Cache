diff --git a/modules/analysis/common/src/test/org/apache/lucene/analysis/query/QueryAutoStopWordAnalyzerTest.java b/modules/analysis/common/src/test/org/apache/lucene/analysis/query/QueryAutoStopWordAnalyzerTest.java
index b0769ad..47b0f11 100644
--- a/modules/analysis/common/src/test/org/apache/lucene/analysis/query/QueryAutoStopWordAnalyzerTest.java
+++ b/modules/analysis/common/src/test/org/apache/lucene/analysis/query/QueryAutoStopWordAnalyzerTest.java
@@ -53,7 +53,7 @@
       writer.addDocument(doc);
     }
     writer.close();
-    reader = IndexReader.open(dir, true);
+    reader = IndexReader.open(dir);
   }
 
   @Override
