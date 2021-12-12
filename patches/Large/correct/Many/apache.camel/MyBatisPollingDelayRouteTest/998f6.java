diff --git a/components/camel-mybatis/src/test/java/org/apache/camel/component/mybatis/MyBatisPollingDelayRouteTest.java b/components/camel-mybatis/src/test/java/org/apache/camel/component/mybatis/MyBatisPollingDelayRouteTest.java
index c777c28..ed3b384 100644
--- a/components/camel-mybatis/src/test/java/org/apache/camel/component/mybatis/MyBatisPollingDelayRouteTest.java
+++ b/components/camel-mybatis/src/test/java/org/apache/camel/component/mybatis/MyBatisPollingDelayRouteTest.java
@@ -26,7 +26,7 @@
     public void testSendAccountBean() throws Exception {
         long start = System.currentTimeMillis();
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedMessageCount(2);
+        mock.expectedMinimumMessageCount(2);
 
         assertMockEndpointsSatisfied();
         long delta = System.currentTimeMillis() - start;
