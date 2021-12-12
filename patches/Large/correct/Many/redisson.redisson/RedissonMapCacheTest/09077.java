diff --git a/redisson/src/test/java/org/redisson/RedissonMapCacheTest.java b/redisson/src/test/java/org/redisson/RedissonMapCacheTest.java
index 2f0354e..7336ff4 100644
--- a/redisson/src/test/java/org/redisson/RedissonMapCacheTest.java
+++ b/redisson/src/test/java/org/redisson/RedissonMapCacheTest.java
@@ -860,7 +860,7 @@
         Assert.assertEquals("1", map.get("4"));
         RMapCache<String, Object> mapCache1 = redisson.getMapCache("test_put_if_absent_3");
         Object currValue = mapCache1.putIfAbsent("4", 1.23, 10000L, TimeUnit.SECONDS);
-        Object updatedValue = mapCache1.addAndGet("4", 1L);
+        Object updatedValue = mapCache1.addAndGet("4", 1D);
         System.out.println("updatedValue: " + updatedValue);
     }
 
