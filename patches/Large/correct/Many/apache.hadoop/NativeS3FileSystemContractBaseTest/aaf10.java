diff --git a/hadoop-tools/hadoop-aws/src/test/java/org/apache/hadoop/fs/s3native/NativeS3FileSystemContractBaseTest.java b/hadoop-tools/hadoop-aws/src/test/java/org/apache/hadoop/fs/s3native/NativeS3FileSystemContractBaseTest.java
index ef223ac..261f79b 100644
--- a/hadoop-tools/hadoop-aws/src/test/java/org/apache/hadoop/fs/s3native/NativeS3FileSystemContractBaseTest.java
+++ b/hadoop-tools/hadoop-aws/src/test/java/org/apache/hadoop/fs/s3native/NativeS3FileSystemContractBaseTest.java
@@ -85,7 +85,7 @@
 
   public void testDirWithDifferentMarkersWorks() throws Exception {
 
-    for (int i = 0; i < 3; i++) {
+    for (int i = 0; i <= 3; i++) {
       String base = "test/hadoop" + i;
       Path path = path("/" + base);
 
