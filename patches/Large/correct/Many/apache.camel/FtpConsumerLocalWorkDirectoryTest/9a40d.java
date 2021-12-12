diff --git a/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpConsumerLocalWorkDirectoryTest.java b/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpConsumerLocalWorkDirectoryTest.java
index 85148f7..8b05616 100644
--- a/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpConsumerLocalWorkDirectoryTest.java
+++ b/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpConsumerLocalWorkDirectoryTest.java
@@ -68,7 +68,8 @@
 
         assertMockEndpointsSatisfied();
 
-        Thread.sleep(200);
+        // give test some time to close file resources
+        Thread.sleep(2000);
 
         // now the lwd file should be deleted
         File local = new File("target/lwd/hello.txt").getAbsoluteFile();
@@ -77,7 +78,7 @@
         // and the out file should exists
         File out = new File("target/out/hello.txt").getAbsoluteFile();
         assertTrue("file should exists", out.exists());
-        assertEquals("Hello World", IOConverter.toString(out));
+        assertEquals("Hello World", IOConverter.toString(out, null));
     }
 
     protected RouteBuilder createRouteBuilder() throws Exception {
