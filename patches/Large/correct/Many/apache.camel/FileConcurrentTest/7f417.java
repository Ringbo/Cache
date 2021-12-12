diff --git a/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentTest.java b/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentTest.java
index f8fef27..d001c97 100644
--- a/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentTest.java
@@ -131,8 +131,8 @@
         long start = System.currentTimeMillis();
 
         MockEndpoint result = getMockEndpoint("mock:result");
-        // should be ordered
-        result.expectedBodiesReceived("A+C+E+G+I", "B+D+F+H+J");
+        // should be ordered in the body, but the files can be loaded in different order per OS
+        result.expectedBodiesReceivedInAnyOrder("A+C+E+G+I", "B+D+F+H+J");
 
         assertMockEndpointsSatisfied();
 
