diff --git a/java/org/apache/catalina/core/StandardContext.java b/java/org/apache/catalina/core/StandardContext.java
index 111791f..71a2a5f 100644
--- a/java/org/apache/catalina/core/StandardContext.java
+++ b/java/org/apache/catalina/core/StandardContext.java
@@ -3649,13 +3649,15 @@
         try {
             stop();
         } catch (LifecycleException e) {
-            log.error(sm.getString("standardContext.stoppingContext"), e);
+            log.error(
+                sm.getString("standardContext.stoppingContext", logName()), e);
         }
 
         try {
             start();
         } catch (LifecycleException e) {
-            log.error(sm.getString("standardContext.startingContext"), e);
+            log.error(
+                sm.getString("standardContext.startingContext", logName()), e);
         }
 
         setPaused(false);
