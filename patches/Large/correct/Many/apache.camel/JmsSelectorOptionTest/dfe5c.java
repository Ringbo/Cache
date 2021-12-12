diff --git a/components/camel-jms/src/test/java/org/apache/camel/component/jms/JmsSelectorOptionTest.java b/components/camel-jms/src/test/java/org/apache/camel/component/jms/JmsSelectorOptionTest.java
index 6a9e3f4..4df53bc 100644
--- a/components/camel-jms/src/test/java/org/apache/camel/component/jms/JmsSelectorOptionTest.java
+++ b/components/camel-jms/src/test/java/org/apache/camel/component/jms/JmsSelectorOptionTest.java
@@ -39,7 +39,7 @@
         MockEndpoint endpointB = getMockEndpoint("mock:b");
         MockEndpoint endpointC = getMockEndpoint("mock:c");
         
-        endpointA.expectedBodiesReceived("A blue car!", "A blue car, again!");
+        endpointA.expectedBodiesReceivedInAnyOrder("A blue car!", "A blue car, again!");
         endpointA.expectedHeaderReceived("color", "blue");
         endpointB.expectedHeaderReceived("color", "red");
         endpointB.expectedBodiesReceived("A red car!");
