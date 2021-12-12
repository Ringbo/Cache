diff --git a/redisson/src/test/java/org/redisson/RedissonMapTest.java b/redisson/src/test/java/org/redisson/RedissonMapTest.java
index fc1f312..c0ff540 100644
--- a/redisson/src/test/java/org/redisson/RedissonMapTest.java
+++ b/redisson/src/test/java/org/redisson/RedissonMapTest.java
@@ -366,7 +366,7 @@
         map.put("ar_kills", "0");
         map.put("ar_deaths", "0");
 
-        RMap<String, String> rmap = redisson.getMap("123", StringCodec.INSTANCE);
+        RMap<String, String> rmap = redisson.getMap("123");
         rmap.putAll(map);
 
         assertThat(rmap.keySet()).containsExactlyElementsOf(map.keySet());
