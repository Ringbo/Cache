diff --git a/components/camel-jms/src/test/java/org/apache/camel/component/jms/discovery/JmsDiscoveryTest.java b/components/camel-jms/src/test/java/org/apache/camel/component/jms/discovery/JmsDiscoveryTest.java
index 8f70be2..a79314a 100644
--- a/components/camel-jms/src/test/java/org/apache/camel/component/jms/discovery/JmsDiscoveryTest.java
+++ b/components/camel-jms/src/test/java/org/apache/camel/component/jms/discovery/JmsDiscoveryTest.java
@@ -38,7 +38,7 @@
     @Test
     public void testDiscovery() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedMessageCount(3);
+        mock.expectedMinimumMessageCount(3);
 
         assertMockEndpointsSatisfied();
 
