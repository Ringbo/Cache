diff --git a/hadoop-tools/hadoop-fs2img/src/main/java/org/apache/hadoop/hdfs/server/namenode/ImageWriter.java b/hadoop-tools/hadoop-fs2img/src/main/java/org/apache/hadoop/hdfs/server/namenode/ImageWriter.java
index 1be5190..14a5f8f 100644
--- a/hadoop-tools/hadoop-fs2img/src/main/java/org/apache/hadoop/hdfs/server/namenode/ImageWriter.java
+++ b/hadoop-tools/hadoop-fs2img/src/main/java/org/apache/hadoop/hdfs/server/namenode/ImageWriter.java
@@ -183,9 +183,9 @@
       dirsTmp.deleteOnExit();
       dirsTmpStream = new FileOutputStream(dirsTmp);
       dirs = beginSection(dirsTmpStream);
-    } catch (Throwable e) {
+    } catch (IOException e) {
       IOUtils.cleanupWithLogger(null, raw, dirsTmpStream);
-      throw new IOException(e);
+      throw e;
     }
 
     try {
