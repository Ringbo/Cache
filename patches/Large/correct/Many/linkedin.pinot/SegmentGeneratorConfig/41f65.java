diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/indexsegment/generator/SegmentGeneratorConfig.java b/pinot-core/src/main/java/com/linkedin/pinot/core/indexsegment/generator/SegmentGeneratorConfig.java
index 9fc368e..8cb396c 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/indexsegment/generator/SegmentGeneratorConfig.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/indexsegment/generator/SegmentGeneratorConfig.java
@@ -188,7 +188,7 @@
     if (outputDir.exists()) {
       Preconditions.checkState(outputDir.isDirectory(), "Path {} is not a directory.", dir);
     } else {
-      Preconditions.checkState(outputDir.mkdir(), "Cannot create output dir: {}", dir);
+      Preconditions.checkState(outputDir.mkdirs(), "Cannot create output dir: {}", dir);
     }
     _outDir = outputDir.getAbsolutePath();
   }
