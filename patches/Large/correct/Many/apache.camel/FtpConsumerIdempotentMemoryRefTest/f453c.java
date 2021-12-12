diff --git a/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpConsumerIdempotentMemoryRefTest.java b/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpConsumerIdempotentMemoryRefTest.java
index 7524f00..dec0179 100644
--- a/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpConsumerIdempotentMemoryRefTest.java
+++ b/components/camel-ftp/src/test/java/org/apache/camel/component/file/remote/FtpConsumerIdempotentMemoryRefTest.java
@@ -65,7 +65,7 @@
         assertTrue(repo.contains("e.txt"));
 
         resetMocks();
-        notify = new NotifyBuilder(context).whenDone(4).create();
+        notify = new NotifyBuilder(context).whenDone(2).create();
 
         getMockEndpoint("mock:result").expectedMessageCount(2);
 
@@ -86,7 +86,9 @@
     protected RouteBuilder createRouteBuilder() throws Exception {
         return new RouteBuilder() {
             public void configure() throws Exception {
-                from(getFtpUrl()).to("mock:result");
+                from(getFtpUrl())
+                    .to("log:result")
+                    .to("mock:result");
             }
         };
     }
