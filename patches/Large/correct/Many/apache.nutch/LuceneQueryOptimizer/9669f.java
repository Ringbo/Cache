diff --git a/src/java/org/apache/nutch/searcher/LuceneQueryOptimizer.java b/src/java/org/apache/nutch/searcher/LuceneQueryOptimizer.java
index 35c9277..3b1f6ed 100644
--- a/src/java/org/apache/nutch/searcher/LuceneQueryOptimizer.java
+++ b/src/java/org/apache/nutch/searcher/LuceneQueryOptimizer.java
@@ -48,7 +48,7 @@
     private int maxHits;
     
     public LimitedCollector(int numHits, int maxHits) {
-      super(maxHits);
+      super(numHits);
       this.maxHits = maxHits;
     }
 
