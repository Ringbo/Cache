diff --git a/llap-server/src/java/org/apache/hadoop/hive/llap/daemon/impl/LlapTaskReporter.java b/llap-server/src/java/org/apache/hadoop/hive/llap/daemon/impl/LlapTaskReporter.java
index fc66254..bb9f341 100644
--- a/llap-server/src/java/org/apache/hadoop/hive/llap/daemon/impl/LlapTaskReporter.java
+++ b/llap-server/src/java/org/apache/hadoop/hive/llap/daemon/impl/LlapTaskReporter.java
@@ -350,13 +350,15 @@
       float progress = 0;
       if (task.hasInitialized()) {
         progress = task.getProgress();
+        // TODO HIVE-12449. Make use of progress notifications once Hive starts sending them out.
+        // progressNotified = task.getAndClearProgressNotification();
         if (sendCounters) {
           // send these potentially large objects at longer intervals to avoid overloading the AM
           counters = task.getCounters();
           stats = task.getTaskStatistics();
         }
       }
-      return new TaskStatusUpdateEvent(counters, progress, stats);
+      return new TaskStatusUpdateEvent(counters, progress, stats, true);
     }
 
     /**
