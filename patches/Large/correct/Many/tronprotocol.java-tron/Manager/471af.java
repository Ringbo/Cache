diff --git a/src/main/java/org/tron/core/db/Manager.java b/src/main/java/org/tron/core/db/Manager.java
index 43c41bf..659c0c5 100644
--- a/src/main/java/org/tron/core/db/Manager.java
+++ b/src/main/java/org/tron/core/db/Manager.java
@@ -295,7 +295,7 @@
     return repushTransactions;
   }
 
-  public BlockingQueue<TriggerCapsule> getTriggerCapsuleQueue() {
+  public synchronized BlockingQueue<TriggerCapsule> getTriggerCapsuleQueue() {
     return triggerCapsuleQueue;
   }
 
