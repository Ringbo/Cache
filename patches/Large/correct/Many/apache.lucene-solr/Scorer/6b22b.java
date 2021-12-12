diff --git a/src/java/org/apache/lucene/search/Scorer.java b/src/java/org/apache/lucene/search/Scorer.java
index 207ee3b..d84342d 100644
--- a/src/java/org/apache/lucene/search/Scorer.java
+++ b/src/java/org/apache/lucene/search/Scorer.java
@@ -87,7 +87,7 @@
       collector.collect(doc);
       doc = nextDoc();
     }
-    return doc == NO_MORE_DOCS;
+    return doc != NO_MORE_DOCS;
   }
   
   /** Returns the score of the current document matching the query.
