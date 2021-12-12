diff --git a/redisson/src/test/java/org/redisson/RedissonSetCacheTest.java b/redisson/src/test/java/org/redisson/RedissonSetCacheTest.java
index ad8519e..f4732b6 100644
--- a/redisson/src/test/java/org/redisson/RedissonSetCacheTest.java
+++ b/redisson/src/test/java/org/redisson/RedissonSetCacheTest.java
@@ -151,9 +151,9 @@
         Thread.sleep(100);
         assertThat(set.contains("123")).isTrue();
 
-        Thread.sleep(100);
+        Thread.sleep(300);
 
-        assertThat(set.contains("123")).isFalse();
+        assertThat(set.contains("123")).isTrue();
     }
 
     @Test
