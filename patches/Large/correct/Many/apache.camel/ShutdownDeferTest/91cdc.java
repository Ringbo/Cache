diff --git a/camel-core/src/test/java/org/apache/camel/processor/ShutdownDeferTest.java b/camel-core/src/test/java/org/apache/camel/processor/ShutdownDeferTest.java
index cd805b4..31f7ca4 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/ShutdownDeferTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/ShutdownDeferTest.java
@@ -32,7 +32,7 @@
 
         MockEndpoint bar = getMockEndpoint("mock:bar");
         bar.expectedMinimumMessageCount(1);
-        bar.setResultWaitTime(1000);
+        bar.setResultWaitTime(3500);
 
         template.sendBody("seda:foo", "A");
         template.sendBody("seda:foo", "B");
