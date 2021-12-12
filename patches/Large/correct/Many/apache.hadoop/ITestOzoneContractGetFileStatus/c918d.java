diff --git a/hadoop-ozone/ozonefs/src/test/java/org/apache/hadoop/fs/ozone/contract/ITestOzoneContractGetFileStatus.java b/hadoop-ozone/ozonefs/src/test/java/org/apache/hadoop/fs/ozone/contract/ITestOzoneContractGetFileStatus.java
index 98bbb14..fe442f7 100644
--- a/hadoop-ozone/ozonefs/src/test/java/org/apache/hadoop/fs/ozone/contract/ITestOzoneContractGetFileStatus.java
+++ b/hadoop-ozone/ozonefs/src/test/java/org/apache/hadoop/fs/ozone/contract/ITestOzoneContractGetFileStatus.java
@@ -50,7 +50,7 @@
 
   @Override
   public void teardown() throws Exception {
-    getLog().info("FS details {}", getFileSystem());
+    getLogger().info("FS details {}", getFileSystem());
     super.teardown();
   }
 
