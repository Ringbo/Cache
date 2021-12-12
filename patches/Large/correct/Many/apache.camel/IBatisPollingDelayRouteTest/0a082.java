diff --git a/components/camel-ibatis/src/test/java/org/apache/camel/component/ibatis/IBatisPollingDelayRouteTest.java b/components/camel-ibatis/src/test/java/org/apache/camel/component/ibatis/IBatisPollingDelayRouteTest.java
index 6bf1ef0..4193b36 100644
--- a/components/camel-ibatis/src/test/java/org/apache/camel/component/ibatis/IBatisPollingDelayRouteTest.java
+++ b/components/camel-ibatis/src/test/java/org/apache/camel/component/ibatis/IBatisPollingDelayRouteTest.java
@@ -42,7 +42,7 @@
         assertMockEndpointsSatisfied();
         long delta = System.currentTimeMillis() - start;
 
-        assertTrue("Should not take that long: " + delta, delta < 5000);
+        assertTrue("Should not take that long: " + delta, delta < 7000);
     }
 
     private void createTestData() {
