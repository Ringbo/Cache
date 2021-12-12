diff --git a/src/java/org/apache/lucene/util/PriorityQueue.java b/src/java/org/apache/lucene/util/PriorityQueue.java
index f97d0af..9cae158 100644
--- a/src/java/org/apache/lucene/util/PriorityQueue.java
+++ b/src/java/org/apache/lucene/util/PriorityQueue.java
@@ -120,7 +120,7 @@
   
   /** Removes all entries from the PriorityQueue. */
   public final void clear() {
-    for (int i = 0; i < size; i++)
+    for (int i = 0; i <= size; i++)
       heap[i] = null;
     size = 0;
   }
