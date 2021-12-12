diff --git a/tests/src/test/java/alluxio/client/UfsUtilsIntegrationTest.java b/tests/src/test/java/alluxio/client/UfsUtilsIntegrationTest.java
index d9e5ba5..aa19bf9 100644
--- a/tests/src/test/java/alluxio/client/UfsUtilsIntegrationTest.java
+++ b/tests/src/test/java/alluxio/client/UfsUtilsIntegrationTest.java
@@ -68,7 +68,7 @@
           mLocalAlluxioClusterResource.get().getMasterConf());
     }
 
-    UfsUtils.loadUfs(mFileSystem, new AlluxioURI(AlluxioURI.SEPARATOR), new AlluxioURI(
+    UfsUtils.loadUfs(new AlluxioURI(AlluxioURI.SEPARATOR), new AlluxioURI(
         mUfsRoot + AlluxioURI.SEPARATOR), new PrefixList("alluxio;exclusions", ";"),
         mLocalAlluxioClusterResource.get().getMasterConf());
 
