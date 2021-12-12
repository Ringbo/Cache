diff --git a/lucene/src/java/org/apache/lucene/index/codecs/MultiLevelSkipListWriter.java b/lucene/src/java/org/apache/lucene/index/codecs/MultiLevelSkipListWriter.java
index 46cf791..7804ed2 100644
--- a/lucene/src/java/org/apache/lucene/index/codecs/MultiLevelSkipListWriter.java
+++ b/lucene/src/java/org/apache/lucene/index/codecs/MultiLevelSkipListWriter.java
@@ -61,7 +61,8 @@
     this.skipInterval = skipInterval;
     
     // calculate the maximum number of skip levels for this document frequency
-    numberOfSkipLevels = df == 0 ? 0 : (int) Math.floor(Math.log(df) / Math.log(skipInterval));
+    // TODO: would be preferable to use integer math here instead.
+    numberOfSkipLevels = df == 0 ? 0 : (int) Math.floor(StrictMath.log(df) / StrictMath.log(skipInterval));
     
     // make sure it does not exceed maxSkipLevels
     if (numberOfSkipLevels > maxSkipLevels) {
