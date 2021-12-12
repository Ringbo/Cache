diff --git a/deeplearning4j-cli/deeplearning4j-cli-api/src/main/java/org/deeplearning4j/cli/files/FileRecordReaderFactory.java b/deeplearning4j-cli/deeplearning4j-cli-api/src/main/java/org/deeplearning4j/cli/files/FileRecordReaderFactory.java
index 35dea73..88b9835 100644
--- a/deeplearning4j-cli/deeplearning4j-cli-api/src/main/java/org/deeplearning4j/cli/files/FileRecordReaderFactory.java
+++ b/deeplearning4j-cli/deeplearning4j-cli-api/src/main/java/org/deeplearning4j/cli/files/FileRecordReaderFactory.java
@@ -49,7 +49,7 @@
 
   @Override
   public RecordReader create(URI uri) throws UnknownFormatException {
-    Preconditions.checkArgument(URI != null, "URI cannot be null");
+    Preconditions.checkArgument(uri != null, "URI cannot be null");
     File file = new File(uri.toString());
     InputSplit split = new FileSplit(file);
 
