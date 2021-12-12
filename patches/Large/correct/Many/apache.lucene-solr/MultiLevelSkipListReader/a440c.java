diff --git a/lucene/src/java/org/apache/lucene/index/codecs/MultiLevelSkipListReader.java b/lucene/src/java/org/apache/lucene/index/codecs/MultiLevelSkipListReader.java
index b75aa47..cb812a5 100644
--- a/lucene/src/java/org/apache/lucene/index/codecs/MultiLevelSkipListReader.java
+++ b/lucene/src/java/org/apache/lucene/index/codecs/MultiLevelSkipListReader.java
@@ -186,7 +186,8 @@
   
   /** Loads the skip levels  */
   private void loadSkipLevels() throws IOException {
-    numberOfSkipLevels = docCount == 0 ? 0 : (int) Math.floor(Math.log(docCount) / Math.log(skipInterval[0]));
+    // TODO: would be preferable to use integer math here instead.
+    numberOfSkipLevels = docCount == 0 ? 0 : (int) Math.floor(StrictMath.log(docCount) / StrictMath.log(skipInterval[0]));
     if (numberOfSkipLevels > maxNumberOfSkipLevels) {
       numberOfSkipLevels = maxNumberOfSkipLevels;
     }
