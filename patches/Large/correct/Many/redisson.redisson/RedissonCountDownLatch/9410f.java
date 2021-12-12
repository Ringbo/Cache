diff --git a/src/main/java/org/redisson/RedissonCountDownLatch.java b/src/main/java/org/redisson/RedissonCountDownLatch.java
index ce2b7f8..3ec1005 100644
--- a/src/main/java/org/redisson/RedissonCountDownLatch.java
+++ b/src/main/java/org/redisson/RedissonCountDownLatch.java
@@ -249,7 +249,7 @@
             @Override
             public Boolean execute(RedisConnection<Object, Object> conn) {
                 conn.watch(getName());
-                Long oldValue = (Long) conn.get(getName());
+                Number oldValue = (Number) conn.get(getName());
                 if (oldValue != null) {
                     conn.unwatch();
                     return false;
