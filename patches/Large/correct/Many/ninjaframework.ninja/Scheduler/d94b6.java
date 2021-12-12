diff --git a/ninja-core/src/main/java/ninja/scheduler/Scheduler.java b/ninja-core/src/main/java/ninja/scheduler/Scheduler.java
index 1d082f9..d63456c 100644
--- a/ninja-core/src/main/java/ninja/scheduler/Scheduler.java
+++ b/ninja-core/src/main/java/ninja/scheduler/Scheduler.java
@@ -118,7 +118,7 @@
         }
 
         log.info("Scheduling method " + method.getName() + " on " + target + " to be run every " + delay
-                + " " + timeUnit + " after " + delay + " " + timeUnit);
+                + " " + timeUnit + " after " + initialDelay + " " + timeUnit);
         executor.scheduleWithFixedDelay(new Runnable() {
             @Override
             public void run() {
