diff --git a/modules/queryparser/src/test/org/apache/lucene/queryparser/xml/TestParser.java b/modules/queryparser/src/test/org/apache/lucene/queryparser/xml/TestParser.java
index 7a2f8d2..26d9414 100644
--- a/modules/queryparser/src/test/org/apache/lucene/queryparser/xml/TestParser.java
+++ b/modules/queryparser/src/test/org/apache/lucene/queryparser/xml/TestParser.java
@@ -76,7 +76,7 @@
     }
     d.close();
     writer.close();
-    reader = IndexReader.open(dir, true);
+    reader = IndexReader.open(dir);
     searcher = newSearcher(reader);
 
   }
