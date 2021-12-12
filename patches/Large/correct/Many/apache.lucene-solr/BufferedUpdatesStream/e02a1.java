diff --git a/lucene/core/src/java/org/apache/lucene/index/BufferedUpdatesStream.java b/lucene/core/src/java/org/apache/lucene/index/BufferedUpdatesStream.java
index 9da1e09..e5aae4f 100644
--- a/lucene/core/src/java/org/apache/lucene/index/BufferedUpdatesStream.java
+++ b/lucene/core/src/java/org/apache/lucene/index/BufferedUpdatesStream.java
@@ -456,7 +456,7 @@
       try {
         segStates[j].finish(pool);
       } catch (Throwable th) {
-        if (firstExc != null) {
+        if (firstExc == null) {
           firstExc = th;
         }
       }
