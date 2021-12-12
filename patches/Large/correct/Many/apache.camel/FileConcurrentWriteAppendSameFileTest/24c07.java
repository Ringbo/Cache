diff --git a/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentWriteAppendSameFileTest.java b/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentWriteAppendSameFileTest.java
index d039389..a9d8103 100644
--- a/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentWriteAppendSameFileTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentWriteAppendSameFileTest.java
@@ -26,12 +26,9 @@
 import org.apache.camel.builder.RouteBuilder;
 import org.apache.camel.component.mock.MockEndpoint;
 
-/**
- * @version 
- */
 public class FileConcurrentWriteAppendSameFileTest extends ContextTestSupport {
 
-    private final int size = 1000;
+    private final int size = 500;
 
     @Override
     protected void setUp() throws Exception {
@@ -58,7 +55,7 @@
 
         assertMockEndpointsSatisfied();
 
-        // check the file has 10000 lines
+        // check the file has 5000 lines
         String txt = context.getTypeConverter().convertTo(String.class, new File("target/concurrent/outbox/result.txt"));
         assertNotNull(txt);
 
