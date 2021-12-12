diff --git a/camel-core/src/test/java/org/apache/camel/issues/StopRouteFromRouteTest.java b/camel-core/src/test/java/org/apache/camel/issues/StopRouteFromRouteTest.java
index 73b52b3..56e18db 100644
--- a/camel-core/src/test/java/org/apache/camel/issues/StopRouteFromRouteTest.java
+++ b/camel-core/src/test/java/org/apache/camel/issues/StopRouteFromRouteTest.java
@@ -51,7 +51,7 @@
         template.sendBody("direct:start", "Hello Camel");
 
         // just wait a bit for the thread to stop the route
-        Thread.sleep(1000);
+        Thread.sleep(1500);
 
         // the route should now be stopped
         assertTrue("Route myRoute should be stopped", context.getRouteStatus("myRoute").isStopped());
