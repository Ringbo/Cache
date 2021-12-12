diff --git a/guava-tests/benchmark/com/google/common/util/concurrent/CycleDetectingLockFactoryBenchmark.java b/guava-tests/benchmark/com/google/common/util/concurrent/CycleDetectingLockFactoryBenchmark.java
index a8c7807..c14060b 100644
--- a/guava-tests/benchmark/com/google/common/util/concurrent/CycleDetectingLockFactoryBenchmark.java
+++ b/guava-tests/benchmark/com/google/common/util/concurrent/CycleDetectingLockFactoryBenchmark.java
@@ -58,7 +58,7 @@
     lockAndUnlock(factory.newReentrantLock("foo"), reps);
   }
 
-  private void lockAndUnlock(Lock lock, int reps) {
+  private static void lockAndUnlock(Lock lock, int reps) {
     for (int i = 0; i < reps; i++) {
       lock.lock();
       lock.unlock();
@@ -73,7 +73,7 @@
     lockAndUnlockNested(detectingLocks, reps);
   }
 
-  private void lockAndUnlockNested(Lock[] locks, int reps) {
+  private static void lockAndUnlockNested(Lock[] locks, int reps) {
     for (int i = 0; i < reps; i++) {
       for (int j = 0; j < locks.length; j++) {
         locks[j].lock();
