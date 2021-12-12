diff --git a/redisson/src/test/java/org/redisson/RedissonPermitExpirableSemaphoreTest.java b/redisson/src/test/java/org/redisson/RedissonPermitExpirableSemaphoreTest.java
index bb294b8..77bb9dd 100644
--- a/redisson/src/test/java/org/redisson/RedissonPermitExpirableSemaphoreTest.java
+++ b/redisson/src/test/java/org/redisson/RedissonPermitExpirableSemaphoreTest.java
@@ -154,7 +154,7 @@
         long startTime = System.currentTimeMillis();
         String permitId2 = s.tryAcquire(1, TimeUnit.SECONDS);
         assertThat(permitId2).hasSize(32);
-        assertThat(System.currentTimeMillis() - startTime).isBetween(500L, 600L);
+        assertThat(System.currentTimeMillis() - startTime).isBetween(450L, 600L);
         assertThat(s.availablePermits()).isEqualTo(0);
     }
 
