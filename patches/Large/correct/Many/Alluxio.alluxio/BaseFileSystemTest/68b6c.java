diff --git a/core/client-internal/src/test/java/alluxio/client/file/BaseFileSystemTest.java b/core/client-internal/src/test/java/alluxio/client/file/BaseFileSystemTest.java
index 3782da2..22a0dce 100644
--- a/core/client-internal/src/test/java/alluxio/client/file/BaseFileSystemTest.java
+++ b/core/client-internal/src/test/java/alluxio/client/file/BaseFileSystemTest.java
@@ -322,9 +322,9 @@
     AlluxioURI alluxioPath = new AlluxioURI("/t");
     AlluxioURI ufsPath = new AlluxioURI("/u");
     MountOptions mountOptions = MountOptions.defaults();
-    Mockito.doNothing().when(mFileSystemMasterClient).mount(alluxioPath, ufsPath);
+    Mockito.doNothing().when(mFileSystemMasterClient).mount(alluxioPath, ufsPath, mountOptions);
     mFileSystem.mount(alluxioPath, ufsPath, mountOptions);
-    Mockito.verify(mFileSystemMasterClient).mount(alluxioPath, ufsPath);
+    Mockito.verify(mFileSystemMasterClient).mount(alluxioPath, ufsPath, mountOptions);
   }
 
   /**
@@ -337,7 +337,8 @@
     AlluxioURI alluxioPath = new AlluxioURI("/t");
     AlluxioURI ufsPath = new AlluxioURI("/u");
     MountOptions mountOptions = MountOptions.defaults();
-    Mockito.doThrow(EXCEPTION).when(mFileSystemMasterClient).mount(alluxioPath, ufsPath);
+    Mockito.doThrow(EXCEPTION).when(mFileSystemMasterClient)
+        .mount(alluxioPath, ufsPath, mountOptions);
     try {
       mFileSystem.mount(alluxioPath, ufsPath, mountOptions);
       Assert.fail(SHOULD_HAVE_PROPAGATED_MESSAGE);
