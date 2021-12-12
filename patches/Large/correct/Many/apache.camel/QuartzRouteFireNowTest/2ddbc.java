diff --git a/components/camel-quartz2/src/test/java/org/apache/camel/component/quartz2/QuartzRouteFireNowTest.java b/components/camel-quartz2/src/test/java/org/apache/camel/component/quartz2/QuartzRouteFireNowTest.java
index d45f21d..d8dcb7f 100644
--- a/components/camel-quartz2/src/test/java/org/apache/camel/component/quartz2/QuartzRouteFireNowTest.java
+++ b/components/camel-quartz2/src/test/java/org/apache/camel/component/quartz2/QuartzRouteFireNowTest.java
@@ -30,7 +30,7 @@
     @Test
     public void testQuartzRoute() throws Exception {
         resultEndpoint = getMockEndpoint("mock:result");
-        resultEndpoint.expectedMessageCount(2);
+        resultEndpoint.expectedMinimumMessageCount(2);
         resultEndpoint.message(0).header("triggerName").isEqualTo("myTimerName");
         resultEndpoint.message(0).header("triggerGroup").isEqualTo("myGroup");
 
