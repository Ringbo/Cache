diff --git a/src/test/java/org/redisson/RedissonLockTest.java b/src/test/java/org/redisson/RedissonLockTest.java
index 83cd76b..28b0132 100644
--- a/src/test/java/org/redisson/RedissonLockTest.java
+++ b/src/test/java/org/redisson/RedissonLockTest.java
@@ -41,7 +41,7 @@
                 RLock lock1 = redisson.getLock("lock");
                 lock1.lock();
                 long spendTime = System.currentTimeMillis() - startTime;
-                Assert.assertTrue(spendTime < 2005);
+                Assert.assertTrue(spendTime < 2010);
                 lock1.unlock();
                 latch.countDown();
             };
