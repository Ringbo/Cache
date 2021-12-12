diff --git a/activemq-core/src/main/java/org/apache/activemq/store/journal/JournalPersistenceAdapter.java b/activemq-core/src/main/java/org/apache/activemq/store/journal/JournalPersistenceAdapter.java
index 0ab05ce..064b401 100755
--- a/activemq-core/src/main/java/org/apache/activemq/store/journal/JournalPersistenceAdapter.java
+++ b/activemq-core/src/main/java/org/apache/activemq/store/journal/JournalPersistenceAdapter.java
@@ -221,7 +221,7 @@
         Scheduler.cancel(periodicCheckpointTask);
 
         // Take one final checkpoint and stop checkpoint processing.
-        checkpoint(false, true);
+        checkpoint(true, true);
         checkpointTask.shutdown();        
         checkpointExecutor.shutdown();
         
