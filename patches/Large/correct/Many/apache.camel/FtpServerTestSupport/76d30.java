diff --git a/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpServerTestSupport.java b/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpServerTestSupport.java
index 1c8b5c6..d057f5f 100644
--- a/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpServerTestSupport.java
+++ b/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpServerTestSupport.java
@@ -136,7 +136,7 @@
 
     protected FtpServerFactory createFtpServerFactory() throws Exception {
         assertTrue(USERS_FILE.exists());
-        assertTrue("Port number is not initialized in an expected range: " + port, port > 21000);
+        assertTrue("Port number is not initialized in an expected range: " + port, port >= 21000);
 
         NativeFileSystemFactory fsf = new NativeFileSystemFactory();
         fsf.setCreateHome(true);
