diff --git a/java/org/apache/catalina/core/StandardContext.java b/java/org/apache/catalina/core/StandardContext.java
index 83e992d..bee2a9f 100644
--- a/java/org/apache/catalina/core/StandardContext.java
+++ b/java/org/apache/catalina/core/StandardContext.java
@@ -3684,7 +3684,7 @@
         // Validate our current component state
         if (!getState().isAvailable())
             throw new IllegalStateException
-                (sm.getString("containerBase.notStarted", logName()));
+                (sm.getString("standardContext.notStarted", getName()));
 
         if(log.isInfoEnabled())
             log.info(sm.getString("standardContext.reloadingStarted",
@@ -3697,14 +3697,14 @@
             stop();
         } catch (LifecycleException e) {
             log.error(
-                sm.getString("standardContext.stoppingContext", logName()), e);
+                sm.getString("standardContext.stoppingContext", getName()), e);
         }
 
         try {
             start();
         } catch (LifecycleException e) {
             log.error(
-                sm.getString("standardContext.startingContext", logName()), e);
+                sm.getString("standardContext.startingContext", getName()), e);
         }
 
         setPaused(false);
