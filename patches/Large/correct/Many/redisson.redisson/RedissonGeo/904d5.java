diff --git a/src/main/java/org/redisson/RedissonGeo.java b/src/main/java/org/redisson/RedissonGeo.java
index 527892d..20ca9a3 100644
--- a/src/main/java/org/redisson/RedissonGeo.java
+++ b/src/main/java/org/redisson/RedissonGeo.java
@@ -62,7 +62,7 @@
 
     @Override
     public Future<Long> addAsync(double longitude, double latitude, V member) {
-        return commandExecutor.writeAsync(getName(), RedisCommands.GEOADD, getName(), convert(longitude), convert(latitude), member);
+        return commandExecutor.writeAsync(getName(), codec, RedisCommands.GEOADD, getName(), convert(longitude), convert(latitude), member);
     }
 
     private String convert(double longitude) {
