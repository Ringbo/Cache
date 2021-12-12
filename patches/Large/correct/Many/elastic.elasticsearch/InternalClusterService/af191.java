diff --git a/src/main/java/org/elasticsearch/cluster/service/InternalClusterService.java b/src/main/java/org/elasticsearch/cluster/service/InternalClusterService.java
index 398c4b0..ea6866c 100644
--- a/src/main/java/org/elasticsearch/cluster/service/InternalClusterService.java
+++ b/src/main/java/org/elasticsearch/cluster/service/InternalClusterService.java
@@ -525,7 +525,7 @@
     class NotifyTimeout implements Runnable {
         final TimeoutClusterStateListener listener;
         final TimeValue timeout;
-        ScheduledFuture future;
+        volatile ScheduledFuture future;
 
         NotifyTimeout(TimeoutClusterStateListener listener, TimeValue timeout) {
             this.listener = listener;
@@ -538,7 +538,7 @@
 
         @Override
         public void run() {
-            if (future.isCancelled()) {
+            if (future != null && future.isCancelled()) {
                 return;
             }
             if (lifecycle.stoppedOrClosed()) {
