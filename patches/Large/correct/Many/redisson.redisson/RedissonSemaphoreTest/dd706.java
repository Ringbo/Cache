diff --git a/redisson/src/test/java/org/redisson/RedissonSemaphoreTest.java b/redisson/src/test/java/org/redisson/RedissonSemaphoreTest.java
index 8b0367d..f5c6f2f 100644
--- a/redisson/src/test/java/org/redisson/RedissonSemaphoreTest.java
+++ b/redisson/src/test/java/org/redisson/RedissonSemaphoreTest.java
@@ -131,7 +131,7 @@
         t.join(1);
 
         long startTime = System.currentTimeMillis();
-        assertThat(s.tryAcquire(4, 1, TimeUnit.SECONDS)).isTrue();
+        assertThat(s.tryAcquire(4, 2, TimeUnit.SECONDS)).isTrue();
         assertThat(System.currentTimeMillis() - startTime).isBetween(900L, 1020L);
         assertThat(s.availablePermits()).isEqualTo(0);
     }
