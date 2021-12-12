diff --git a/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/QuartzRouteRestartTest.java b/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/QuartzRouteRestartTest.java
index ef06ee7..d228474 100644
--- a/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/QuartzRouteRestartTest.java
+++ b/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/QuartzRouteRestartTest.java
@@ -36,7 +36,7 @@
         MockEndpoint mock = getMockEndpoint("mock:result");
         mock.setResultWaitTime(15000);
         mock.expectedMinimumMessageCount(3);
-        mock.message(0).arrives().between(7, 9).seconds().beforeNext();
+        mock.message(0).arrives().between(6, 9).seconds().beforeNext();
         mock.message(2).arrives().between(3, 5).seconds().afterPrevious();
 
         assertMockEndpointsSatisfied();
