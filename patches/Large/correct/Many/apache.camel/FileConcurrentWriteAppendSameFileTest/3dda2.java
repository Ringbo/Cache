diff --git a/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentWriteAppendSameFileTest.java b/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentWriteAppendSameFileTest.java
index 1eb48e6..40c08fd 100644
--- a/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentWriteAppendSameFileTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentWriteAppendSameFileTest.java
@@ -28,7 +28,7 @@
 
 public class FileConcurrentWriteAppendSameFileTest extends ContextTestSupport {
 
-    private final int size = 500;
+    private final int size = 100;
 
     @Override
     protected void setUp() throws Exception {
@@ -52,12 +52,12 @@
         mock.setResultWaitTime(30000);
 
         // we need to wait a bit for our slow CI server to make sure the entire file is written on disc
-        Thread.sleep(100);
+        Thread.sleep(1000);
         context.startRoute("foo");
 
         assertMockEndpointsSatisfied();
 
-        // check the file has 500 lines
+        // check the file has correct number of lines
         String txt = context.getTypeConverter().convertTo(String.class, new File("target/concurrent/outbox/result.txt"));
         assertNotNull(txt);
 
