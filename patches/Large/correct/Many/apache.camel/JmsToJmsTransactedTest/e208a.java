diff --git a/components/camel-jms/src/test/java/org/apache/camel/component/jms/tx/JmsToJmsTransactedTest.java b/components/camel-jms/src/test/java/org/apache/camel/component/jms/tx/JmsToJmsTransactedTest.java
index 6380955..1115f34 100644
--- a/components/camel-jms/src/test/java/org/apache/camel/component/jms/tx/JmsToJmsTransactedTest.java
+++ b/components/camel-jms/src/test/java/org/apache/camel/component/jms/tx/JmsToJmsTransactedTest.java
@@ -73,7 +73,7 @@
         bar.expectedMessageCount(0);
 
         MockEndpoint start = getMockEndpoint("mock:start");
-        start.expectedMessageCount(6); // default number of redeliveries by AMQ
+        start.expectedMessageCount(7); // default number of redeliveries by AMQ is 6 so we get 6+1
 
         template.sendBody("activemq:queue:foo", "Hello World");
 
@@ -100,7 +100,7 @@
         bar.expectedMessageCount(0);
 
         MockEndpoint start = getMockEndpoint("mock:start");
-        start.expectedMessageCount(6); // default number of redeliveries by AMQ
+        start.expectedMessageCount(7); // default number of redeliveries by AMQ is 6 so we get 6+1
 
         template.sendBody("activemq:queue:foo", "Hello World");
 
@@ -131,7 +131,7 @@
         bar.expectedMessageCount(0);
 
         MockEndpoint start = getMockEndpoint("mock:start");
-        start.expectedMessageCount(6);
+        start.expectedMessageCount(7); // default number of redeliveries by AMQ is 6 so we get 6+1
 
         template.sendBody("activemq:queue:foo", "Hello World");
 
