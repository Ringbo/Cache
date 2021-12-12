diff --git a/src/main/java/org/redisson/core/RedissonRedLock.java b/src/main/java/org/redisson/core/RedissonRedLock.java
index 195e272..c96a849 100644
--- a/src/main/java/org/redisson/core/RedissonRedLock.java
+++ b/src/main/java/org/redisson/core/RedissonRedLock.java
@@ -60,7 +60,7 @@
         }
         
         if (lockedLocks.size() < minLocksAmount(locks)) {
-            unlock();
+            unlockInner(lockedLocks);
             lockedLocks.clear();
             if (latestException != null) {
                 throw latestException;
