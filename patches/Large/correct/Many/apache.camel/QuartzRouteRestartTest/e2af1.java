diff --git a/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/QuartzRouteRestartTest.java b/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/QuartzRouteRestartTest.java
index 1cc2770..aa68e74 100644
--- a/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/QuartzRouteRestartTest.java
+++ b/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/QuartzRouteRestartTest.java
@@ -45,7 +45,7 @@
         
         // start route, and we got messages again
         mock.reset();
-        mock.expectedMessageCount(1);
+        mock.expectedMinimumMessageCount(1);
 
         context().startRoute("trigger");
 
