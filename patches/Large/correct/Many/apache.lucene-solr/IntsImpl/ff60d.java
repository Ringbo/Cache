diff --git a/lucene/src/java/org/apache/lucene/index/values/IntsImpl.java b/lucene/src/java/org/apache/lucene/index/values/IntsImpl.java
index af93a52..29d6c92 100644
--- a/lucene/src/java/org/apache/lucene/index/values/IntsImpl.java
+++ b/lucene/src/java/org/apache/lucene/index/values/IntsImpl.java
@@ -111,7 +111,7 @@
           minValue = maxValue = 0;
         }
         // if we exceed the range of positive longs we must switch to fixed ints
-        if ((maxValue - minValue) < (((long)1) << 63) && (maxValue - minValue) > 0) {
+        if ((maxValue - minValue) < (((long)1) << 63) && (maxValue - minValue) >= 0) {
           writePackedInts(docCount);
         } else {
           writeFixedInts(docCount);
