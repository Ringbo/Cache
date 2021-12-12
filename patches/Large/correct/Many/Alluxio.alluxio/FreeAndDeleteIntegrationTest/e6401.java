diff --git a/tests/src/test/java/alluxio/client/FreeAndDeleteIntegrationTest.java b/tests/src/test/java/alluxio/client/FreeAndDeleteIntegrationTest.java
index 27d3661..55b2688 100644
--- a/tests/src/test/java/alluxio/client/FreeAndDeleteIntegrationTest.java
+++ b/tests/src/test/java/alluxio/client/FreeAndDeleteIntegrationTest.java
@@ -125,7 +125,7 @@
     try {
       // File is immediately gone after delete.
       mFileSystem.getStatus(filePath);
-      Assert.fail();
+      Assert.fail(String.format("Expected file %s being deleted but it was not.", filePath));
     } catch (FileDoesNotExistException e) {
       // expected
     }
