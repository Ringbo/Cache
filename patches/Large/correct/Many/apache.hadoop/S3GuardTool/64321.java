diff --git a/hadoop-tools/hadoop-aws/src/main/java/org/apache/hadoop/fs/s3a/s3guard/S3GuardTool.java b/hadoop-tools/hadoop-aws/src/main/java/org/apache/hadoop/fs/s3a/s3guard/S3GuardTool.java
index fbffba9..ac10e08 100644
--- a/hadoop-tools/hadoop-aws/src/main/java/org/apache/hadoop/fs/s3a/s3guard/S3GuardTool.java
+++ b/hadoop-tools/hadoop-aws/src/main/java/org/apache/hadoop/fs/s3a/s3guard/S3GuardTool.java
@@ -805,7 +805,9 @@
      */
     private void compareDir(FileStatus msDir, FileStatus s3Dir,
                             PrintStream out) throws IOException {
-      Preconditions.checkArgument(!(msDir == null && s3Dir == null));
+      Preconditions.checkArgument(!(msDir == null && s3Dir == null),
+          "The path does not exist in metadata store and on s3.");
+
       if (msDir != null && s3Dir != null) {
         Preconditions.checkArgument(msDir.getPath().equals(s3Dir.getPath()),
             String.format("The path from metadata store and s3 are different:" +
