diff --git a/hadoop-tools/hadoop-distcp/src/main/java/org/apache/hadoop/tools/mapred/UniformSizeInputFormat.java b/hadoop-tools/hadoop-distcp/src/main/java/org/apache/hadoop/tools/mapred/UniformSizeInputFormat.java
index 8dc7a65..8f31234 100644
--- a/hadoop-tools/hadoop-distcp/src/main/java/org/apache/hadoop/tools/mapred/UniformSizeInputFormat.java
+++ b/hadoop-tools/hadoop-distcp/src/main/java/org/apache/hadoop/tools/mapred/UniformSizeInputFormat.java
@@ -112,7 +112,8 @@
         FileSplit split = new FileSplit(listingFilePath, lastSplitStart,
             lastPosition - lastSplitStart, null);
         if (LOG.isDebugEnabled()) {
-          LOG.info ("Creating split : " + split + ", bytes in split: " + currentSplitSize);
+          LOG.debug("Creating split : " + split + ", bytes in split: "
+              + currentSplitSize);
         }
         splits.add(split);
       }
