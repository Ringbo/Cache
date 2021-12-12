diff --git a/server/src/main/java/io/druid/server/coordinator/LoadQueuePeon.java b/server/src/main/java/io/druid/server/coordinator/LoadQueuePeon.java
index da0fd00..f596535 100644
--- a/server/src/main/java/io/druid/server/coordinator/LoadQueuePeon.java
+++ b/server/src/main/java/io/druid/server/coordinator/LoadQueuePeon.java
@@ -174,7 +174,7 @@
     synchronized (lock) {
       if (segmentsToLoad.contains(holder)) {
         if ((callback != null)) {
-          currentlyProcessing.addCallback(callback);
+          holder.addCallback(callback);
         }
         return;
       }
@@ -206,7 +206,7 @@
     synchronized (lock) {
       if (segmentsToDrop.contains(holder)) {
         if (callback != null) {
-          currentlyProcessing.addCallback(callback);
+          holder.addCallback(callback);
         }
         return;
       }
