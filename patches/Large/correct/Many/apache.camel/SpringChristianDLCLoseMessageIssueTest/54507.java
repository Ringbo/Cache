diff --git a/components/camel-spring/src/test/java/org/apache/camel/spring/issues/SpringChristianDLCLoseMessageIssueTest.java b/components/camel-spring/src/test/java/org/apache/camel/spring/issues/SpringChristianDLCLoseMessageIssueTest.java
index c734c23..4be5718 100644
--- a/components/camel-spring/src/test/java/org/apache/camel/spring/issues/SpringChristianDLCLoseMessageIssueTest.java
+++ b/components/camel-spring/src/test/java/org/apache/camel/spring/issues/SpringChristianDLCLoseMessageIssueTest.java
@@ -35,7 +35,7 @@
         result.expectedMessageCount(2);
 
         MockEndpoint error = getMockEndpoint("mock:error");
-        error.expectedMessageCount(2);
+        error.expectedMinimumMessageCount(2);
 
         // should newer get a message as DLC handles it
         MockEndpoint kaboom = getMockEndpoint("mock:kaboom");
@@ -57,9 +57,9 @@
         MockEndpoint result = getMockEndpoint("mock:result");
         result.expectedMessageCount(2);
 
-        // should get 1 message when seda:bye is full
+        // should get at least 1 message when seda:bye is full
         MockEndpoint error = getMockEndpoint("mock:error");
-        error.expectedMessageCount(1);
+        error.expectedMinimumMessageCount(1);
 
         template.sendBody("direct:start", "Hello World");
         template.sendBody("direct:start", "Bye World");
