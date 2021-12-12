diff --git a/java/org/apache/catalina/valves/StuckThreadDetectionValve.java b/java/org/apache/catalina/valves/StuckThreadDetectionValve.java
index 911da42..b0c64ea 100644
--- a/java/org/apache/catalina/valves/StuckThreadDetectionValve.java
+++ b/java/org/apache/catalina/valves/StuckThreadDetectionValve.java
@@ -177,7 +177,7 @@
         // Keeping a reference to the thread object here does not prevent
         // GC'ing, as the reference is removed from the Map in the finally clause
 
-        Long key = new Long(Thread.currentThread().getId());
+        Long key = Long.valueOf(Thread.currentThread().getId());
         StringBuffer requestUrl = request.getRequestURL();
         if(request.getQueryString()!=null) {
             requestUrl.append("?");
@@ -240,7 +240,7 @@
         return result;
     }
 
-    private class MonitoredThread {
+    private static class MonitoredThread {
 
         /**
          * Reference to the thread to get a stack trace from background task
@@ -288,7 +288,7 @@
         }
     }
 
-    private class CompletedStuckThread {
+    private static class CompletedStuckThread {
 
         private String threadName;
         private long totalActiveTime;
