diff --git a/lucene/test-framework/src/java/org/apache/lucene/store/MockIndexOutputWrapper.java b/lucene/test-framework/src/java/org/apache/lucene/store/MockIndexOutputWrapper.java
index dcf910f..058dc97 100644
--- a/lucene/test-framework/src/java/org/apache/lucene/store/MockIndexOutputWrapper.java
+++ b/lucene/test-framework/src/java/org/apache/lucene/store/MockIndexOutputWrapper.java
@@ -78,7 +78,7 @@
     long freeSpace = dir.maxSize == 0 ? 0 : dir.maxSize - dir.sizeInBytes();
     long realUsage = 0;
 
-    if (dir.rateLimiter != null && len >= 10) {
+    if (dir.rateLimiter != null && len >= 1000) {
       dir.rateLimiter.pause(len);
     }
 
