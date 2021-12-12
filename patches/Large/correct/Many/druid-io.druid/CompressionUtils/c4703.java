diff --git a/java-util/src/main/java/io/druid/java/util/common/CompressionUtils.java b/java-util/src/main/java/io/druid/java/util/common/CompressionUtils.java
index 9729dc4..2fc4a37 100644
--- a/java-util/src/main/java/io/druid/java/util/common/CompressionUtils.java
+++ b/java-util/src/main/java/io/druid/java/util/common/CompressionUtils.java
@@ -125,7 +125,7 @@
     long totalSize = 0;
     for (File file : directory.listFiles()) {
       log.info("Adding file[%s] with size[%,d].  Total size so far[%,d]", file, file.length(), totalSize);
-      if (file.length() >= Integer.MAX_VALUE) {
+      if (file.length() > Integer.MAX_VALUE) {
         zipOut.finish();
         throw new IOE("file[%s] too large [%,d]", file, file.length());
       }
