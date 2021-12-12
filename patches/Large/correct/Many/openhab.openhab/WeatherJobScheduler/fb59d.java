diff --git a/bundles/binding/org.openhab.binding.weather/src/main/java/org/openhab/binding/weather/internal/scheduler/WeatherJobScheduler.java b/bundles/binding/org.openhab.binding.weather/src/main/java/org/openhab/binding/weather/internal/scheduler/WeatherJobScheduler.java
index 3eed230..86e9ada 100644
--- a/bundles/binding/org.openhab.binding.weather/src/main/java/org/openhab/binding/weather/internal/scheduler/WeatherJobScheduler.java
+++ b/bundles/binding/org.openhab.binding.weather/src/main/java/org/openhab/binding/weather/internal/scheduler/WeatherJobScheduler.java
@@ -60,7 +60,7 @@
     /**
      * Restarts the JobScheduler after a short delay.
      */
-    public void restart() {
+    public synchronized void restart() {
         delayedExecutor.cancel();
         delayedExecutor.schedule(new TimerTask() {
 
