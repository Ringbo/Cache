diff --git a/lucene/core/src/java/org/apache/lucene/util/packed/MonotonicAppendingLongBuffer.java b/lucene/core/src/java/org/apache/lucene/util/packed/MonotonicAppendingLongBuffer.java
index 43e0d20..671d2e0 100644
--- a/lucene/core/src/java/org/apache/lucene/util/packed/MonotonicAppendingLongBuffer.java
+++ b/lucene/core/src/java/org/apache/lucene/util/packed/MonotonicAppendingLongBuffer.java
@@ -43,7 +43,7 @@
    *  @param pageSize         the size of a single page */
   public MonotonicAppendingLongBuffer(int initialPageCount, int pageSize) {
     super(initialPageCount, pageSize);
-    averages = new float[pageSize];
+    averages = new float[initialPageCount];
   }
 
   /** Create an {@link MonotonicAppendingLongBuffer} with initialPageCount=16
