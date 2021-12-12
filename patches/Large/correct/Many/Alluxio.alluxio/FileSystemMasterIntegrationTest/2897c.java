diff --git a/tests/src/test/java/alluxio/master/file/FileSystemMasterIntegrationTest.java b/tests/src/test/java/alluxio/master/file/FileSystemMasterIntegrationTest.java
index 1150ffd..03512a2 100644
--- a/tests/src/test/java/alluxio/master/file/FileSystemMasterIntegrationTest.java
+++ b/tests/src/test/java/alluxio/master/file/FileSystemMasterIntegrationTest.java
@@ -324,7 +324,8 @@
   @Rule
   public LocalAlluxioClusterResource mLocalAlluxioClusterResource =
       new LocalAlluxioClusterResource(1000, Constants.GB,
-          Constants.SECURITY_AUTHENTICATION_TYPE, AuthType.SIMPLE.getAuthName());
+          Constants.SECURITY_AUTHENTICATION_TYPE, AuthType.SIMPLE.getAuthName(),
+          Constants.SECURITY_AUTHORIZATION_PERMISSION_ENABLED, "true");
   private Configuration mMasterConfiguration;
   private FileSystemMaster mFsMaster;
 
