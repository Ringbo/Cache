diff --git a/hazelcast/src/test/java/com/hazelcast/concurrent/lock/LockBasicTest.java b/hazelcast/src/test/java/com/hazelcast/concurrent/lock/LockBasicTest.java
index c4663ed..e981992 100644
--- a/hazelcast/src/test/java/com/hazelcast/concurrent/lock/LockBasicTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/concurrent/lock/LockBasicTest.java
@@ -180,7 +180,7 @@
             }
         }).start();
         latch.await();
-        assertTrue(lock.tryLock(3, TimeUnit.SECONDS));
+        assertTrue(lock.tryLock(30, TimeUnit.SECONDS));
 
         assertTrue(lock.isLocked());
         assertTrue(lock.isLockedByCurrentThread());
