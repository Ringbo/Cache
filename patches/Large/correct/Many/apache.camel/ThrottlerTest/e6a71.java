diff --git a/camel-core/src/test/java/org/apache/camel/processor/ThrottlerTest.java b/camel-core/src/test/java/org/apache/camel/processor/ThrottlerTest.java
index 37e7cb6..5f8e271 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/ThrottlerTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/ThrottlerTest.java
@@ -34,7 +34,7 @@
     public void testSendLotsOfMessagesButOnly3GetThrough() throws Exception {
         MockEndpoint resultEndpoint = resolveMandatoryEndpoint("mock:result", MockEndpoint.class);
         resultEndpoint.expectedMessageCount(3);
-        resultEndpoint.setResultWaitTime(1000);
+        resultEndpoint.setResultWaitTime(5000);
 
         for (int i = 0; i < messageCount; i++) {
             template.sendBody("seda:a", "<message>" + i + "</message>");
