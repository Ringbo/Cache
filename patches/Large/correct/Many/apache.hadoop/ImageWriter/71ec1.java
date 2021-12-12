diff --git a/hadoop-tools/hadoop-fs2img/src/main/java/org/apache/hadoop/hdfs/server/namenode/ImageWriter.java b/hadoop-tools/hadoop-fs2img/src/main/java/org/apache/hadoop/hdfs/server/namenode/ImageWriter.java
index 0abc7a7..c21c282 100644
--- a/hadoop-tools/hadoop-fs2img/src/main/java/org/apache/hadoop/hdfs/server/namenode/ImageWriter.java
+++ b/hadoop-tools/hadoop-fs2img/src/main/java/org/apache/hadoop/hdfs/server/namenode/ImageWriter.java
@@ -183,9 +183,9 @@
       dirsTmp.deleteOnExit();
       dirsTmpStream = new FileOutputStream(dirsTmp);
       dirs = beginSection(dirsTmpStream);
-    } catch (IOException e) {
+    } catch (Throwable e) {
       IOUtils.cleanupWithLogger(null, raw, dirsTmpStream);
-      throw e;
+      throw new IOException(e);
     }
 
     try {
