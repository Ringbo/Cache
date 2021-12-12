diff --git a/tests/src/test/java/alluxio/client/fs/UfsSyncIntegrationTest.java b/tests/src/test/java/alluxio/client/fs/UfsSyncIntegrationTest.java
index 1d0e5cd..824a660 100644
--- a/tests/src/test/java/alluxio/client/fs/UfsSyncIntegrationTest.java
+++ b/tests/src/test/java/alluxio/client/fs/UfsSyncIntegrationTest.java
@@ -447,14 +447,14 @@
 
     // Set initial alluxio permissions
     mFileSystem.setAttribute(new AlluxioURI(alluxioPath(EXISTING_FILE)),
-        SetAttributeOptions.defaults().setMode(new Mode((short) 777)));
+        SetAttributeOptions.defaults().setMode(new Mode((short) 0777)));
 
     URIStatus status = mFileSystem.getStatus(new AlluxioURI(alluxioPath(EXISTING_FILE)), options);
     String startFingerprint = status.getUfsFingerprint();
 
     // Change alluxio permissions
     mFileSystem.setAttribute(new AlluxioURI(alluxioPath(EXISTING_FILE)),
-        SetAttributeOptions.defaults().setMode(new Mode((short) 655)));
+        SetAttributeOptions.defaults().setMode(new Mode((short) 0655)));
 
     status = mFileSystem.getStatus(new AlluxioURI(alluxioPath(EXISTING_FILE)), options);
     String endFingerprint = status.getUfsFingerprint();
