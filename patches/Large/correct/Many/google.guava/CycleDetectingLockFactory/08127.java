diff --git a/guava/src/com/google/common/util/concurrent/CycleDetectingLockFactory.java b/guava/src/com/google/common/util/concurrent/CycleDetectingLockFactory.java
index 810e539..0818e3b 100644
--- a/guava/src/com/google/common/util/concurrent/CycleDetectingLockFactory.java
+++ b/guava/src/com/google/common/util/concurrent/CycleDetectingLockFactory.java
@@ -753,7 +753,7 @@
    * including both lock and unlock attempts. Failure to do so can result in
    * corrupting the acquireLocks set.
    */
-  private void lockStateChanged(CycleDetectingLock lock) {
+  private static void lockStateChanged(CycleDetectingLock lock) {
     if (!lock.isAcquiredByCurrentThread()) {
       ArrayList<LockGraphNode> acquiredLockList = acquiredLocks.get();
       LockGraphNode node = lock.getLockGraphNode();
