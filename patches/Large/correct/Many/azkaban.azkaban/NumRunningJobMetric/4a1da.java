diff --git a/azkaban-execserver/src/main/java/azkaban/execapp/metric/NumRunningJobMetric.java b/azkaban-execserver/src/main/java/azkaban/execapp/metric/NumRunningJobMetric.java
index 957359b..e6f64fe 100644
--- a/azkaban-execserver/src/main/java/azkaban/execapp/metric/NumRunningJobMetric.java
+++ b/azkaban-execserver/src/main/java/azkaban/execapp/metric/NumRunningJobMetric.java
@@ -32,16 +32,16 @@
 
   @Override
   public void UpdateValueAndNotifyManager() {
-    metricManager.reportMetric(this);
+    notifyManager();
   }
 
   @Override
-  public void handleEvent(Event event) {
+  public synchronized void handleEvent(Event event) {
     if (event.getType() == Type.JOB_STARTED) {
       value = value + 1;
     } else if (event.getType() == Type.JOB_FINISHED) {
       value = value - 1;
     }
-    notifyManager();
+    UpdateValueAndNotifyManager();
   }
 }
