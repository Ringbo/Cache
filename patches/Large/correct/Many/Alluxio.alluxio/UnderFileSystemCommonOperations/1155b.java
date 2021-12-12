diff --git a/examples/src/main/java/alluxio/examples/UnderFileSystemCommonOperations.java b/examples/src/main/java/alluxio/examples/UnderFileSystemCommonOperations.java
index d79010c..fabbd6e 100644
--- a/examples/src/main/java/alluxio/examples/UnderFileSystemCommonOperations.java
+++ b/examples/src/main/java/alluxio/examples/UnderFileSystemCommonOperations.java
@@ -176,7 +176,7 @@
     createEmptyFile(testFile);
     byte[] buf = new byte[0];
     int bytesRead = mUfs.open(testFile).read(buf);
-    boolean bytesReadCorrect = bytesRead != 0;
+    boolean bytesReadCorrect = bytesRead == 0;
     if (UnderFileSystemUtils.isHdfs(mUfs) && bytesRead == -1) {
       // TODO(adit): Consider making the return value uniform across UFSs
       bytesReadCorrect = true;
