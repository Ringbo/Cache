diff --git a/components/camel-sjms/src/test/java/org/apache/camel/component/sjms/tx/BatchTransactedTopicConsumerTest.java b/components/camel-sjms/src/test/java/org/apache/camel/component/sjms/tx/BatchTransactedTopicConsumerTest.java
index 8e0c4c6..ea4ea43 100644
--- a/components/camel-sjms/src/test/java/org/apache/camel/component/sjms/tx/BatchTransactedTopicConsumerTest.java
+++ b/components/camel-sjms/src/test/java/org/apache/camel/component/sjms/tx/BatchTransactedTopicConsumerTest.java
@@ -46,7 +46,7 @@
         // We should get two sets of 10 messages.  10 before the rollback and 10 after the rollback.
         getMockEndpoint("mock:test.before.1").expectedMessageCount(10);
         getMockEndpoint("mock:test.before.2").expectedMessageCount(10);
-        getMockEndpoint("mock:test.after.1").expectedMinimumMessageCount(10);
+        getMockEndpoint("mock:test.after.1").expectedMessageCount(10);
         getMockEndpoint("mock:test.after.2").expectedMessageCount(10);
 
         // Send only 10 messages
@@ -101,7 +101,7 @@
                                         // Try failing in two places to
                                         // ensure we still get the number of messages that
                                         // we expect across the topics
-                                        if (body.endsWith("6")) {
+                                        if (body.endsWith("6") || body.endsWith("10")) {
                                             log.info("5th message received.  Rolling back.");
                                             exchange.getOut().setFault(true);
                                             exchange.getOut().setBody("5th message received.  Rolling back.");
@@ -129,7 +129,7 @@
                                         // Try failing in two places to
                                         // ensure we still get the number of messages that
                                         // we expect across the topics
-                                        if (body.endsWith("3") || body.endsWith("7")) {
+                                        if (body.endsWith("3") || body.endsWith("10")) {
                                             log.info("5th message received.  Rolling back.");
                                             exchange.getOut().setFault(true);
                                             exchange.getOut().setBody("5th message received.  Rolling back.");
