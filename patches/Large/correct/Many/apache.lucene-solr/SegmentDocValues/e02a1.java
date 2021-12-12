diff --git a/lucene/core/src/java/org/apache/lucene/index/SegmentDocValues.java b/lucene/core/src/java/org/apache/lucene/index/SegmentDocValues.java
index ce2050f..4838799 100644
--- a/lucene/core/src/java/org/apache/lucene/index/SegmentDocValues.java
+++ b/lucene/core/src/java/org/apache/lucene/index/SegmentDocValues.java
@@ -85,7 +85,7 @@
       try {
         dvp.decRef();
       } catch (Throwable th) {
-        if (t != null) {
+        if (t == null) {
           t = th;
         }
       }
