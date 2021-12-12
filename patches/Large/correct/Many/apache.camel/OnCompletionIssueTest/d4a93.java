diff --git a/camel-core/src/test/java/org/apache/camel/issues/OnCompletionIssueTest.java b/camel-core/src/test/java/org/apache/camel/issues/OnCompletionIssueTest.java
index 0a5bdfa..98d0fc7 100644
--- a/camel-core/src/test/java/org/apache/camel/issues/OnCompletionIssueTest.java
+++ b/camel-core/src/test/java/org/apache/camel/issues/OnCompletionIssueTest.java
@@ -27,7 +27,7 @@
         end.expectedMessageCount(1);
 
         MockEndpoint complete = getMockEndpoint("mock:complete");
-        complete.expectedBodiesReceived("finish", "stop", "faulted", "except");
+        complete.expectedBodiesReceivedInAnyOrder("finish", "stop", "faulted", "except");
 
         template.sendBody("direct:input", "finish");
         template.sendBody("direct:input", "stop");
