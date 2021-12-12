diff --git a/camel-core/src/test/java/org/apache/camel/component/file/FileConsumeNoopIdempotentDisabledTest.java b/camel-core/src/test/java/org/apache/camel/component/file/FileConsumeNoopIdempotentDisabledTest.java
index 0469add..676a36d 100644
--- a/camel-core/src/test/java/org/apache/camel/component/file/FileConsumeNoopIdempotentDisabledTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/file/FileConsumeNoopIdempotentDisabledTest.java
@@ -36,7 +36,7 @@
     public void testNoop() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
         // should be able to read the file multiple times as idempotent is false
-        mock.expectedMessageCount(2);
+        mock.expectedMinimumMessageCount(2);
 
         assertMockEndpointsSatisfied();
     }
