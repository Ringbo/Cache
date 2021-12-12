diff --git a/hadoop-tools/hadoop-distcp/src/test/java/org/apache/hadoop/tools/contract/AbstractContractDistCpTest.java b/hadoop-tools/hadoop-distcp/src/test/java/org/apache/hadoop/tools/contract/AbstractContractDistCpTest.java
index a4f50c7..21a14d3 100644
--- a/hadoop-tools/hadoop-distcp/src/test/java/org/apache/hadoop/tools/contract/AbstractContractDistCpTest.java
+++ b/hadoop-tools/hadoop-distcp/src/test/java/org/apache/hadoop/tools/contract/AbstractContractDistCpTest.java
@@ -160,7 +160,7 @@
     Path inputFile3 = new Path(inputDir, "file3");
     mkdirs(srcFS, inputDir);
     int fileSizeKb = conf.getInt("scale.test.distcp.file.size.kb", 10 * 1024);
-    int fileSizeMb = fileSizeKb * 1024;
+    int fileSizeMb = fileSizeKb / 1024;
     getLog().info("{} with file size {}", testName.getMethodName(), fileSizeMb);
     byte[] data1 = dataset((fileSizeMb + 1) * 1024 * 1024, 33, 43);
     createFile(srcFS, inputFile1, true, data1);
