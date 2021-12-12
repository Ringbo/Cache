diff --git a/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpConsumerLocalWorkDirectoryAsAbsolutePathTest.java b/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpConsumerLocalWorkDirectoryAsAbsolutePathTest.java
index eb8932c..14a7bfa 100644
--- a/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpConsumerLocalWorkDirectoryAsAbsolutePathTest.java
+++ b/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpConsumerLocalWorkDirectoryAsAbsolutePathTest.java
@@ -71,7 +71,8 @@
 
         assertMockEndpointsSatisfied();
 
-        Thread.sleep(200);
+        // give test some time to close file resources
+        Thread.sleep(2000);
 
         // now the lwd file should be deleted
         File local = new File("target/lwd/hello.txt").getAbsoluteFile();
@@ -80,7 +81,7 @@
         // and the out file should exists
         File out = new File("target/out/hello.txt").getAbsoluteFile();
         assertTrue("file should exists", out.exists());
-        assertEquals("Hello World", IOConverter.toString(out));
+        assertEquals("Hello World", IOConverter.toString(out, null));
     }
 
     protected RouteBuilder createRouteBuilder() throws Exception {
