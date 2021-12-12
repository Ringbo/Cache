diff --git a/tests/src/test/java/alluxio/client/fs/FileSystemMasterIntegrationTest.java b/tests/src/test/java/alluxio/client/fs/FileSystemMasterIntegrationTest.java
index 18a6819..493c08c 100644
--- a/tests/src/test/java/alluxio/client/fs/FileSystemMasterIntegrationTest.java
+++ b/tests/src/test/java/alluxio/client/fs/FileSystemMasterIntegrationTest.java
@@ -1209,7 +1209,7 @@
     String ufs = Configuration.get(PropertyKey.MASTER_MOUNT_TABLE_ROOT_UFS);
     String parentPath = Paths.get(ufs, "d1").toString();
     FileUtils.createDir(parentPath);
-    FileUtils.changeLocalFilePermission(parentPath, new Mode((short) 600).toString());
+    FileUtils.changeLocalFilePermission(parentPath, new Mode((short) 0600).toString());
     AlluxioURI path = new AlluxioURI(Paths.get("/d1", "d2", "d3", "d4").toString());
 
     // this should fail
