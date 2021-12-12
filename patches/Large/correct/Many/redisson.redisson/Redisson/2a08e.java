diff --git a/redisson/src/main/java/org/redisson/Redisson.java b/redisson/src/main/java/org/redisson/Redisson.java
index 5d46865..aee5fd6 100755
--- a/redisson/src/main/java/org/redisson/Redisson.java
+++ b/redisson/src/main/java/org/redisson/Redisson.java
@@ -171,10 +171,10 @@
      *
      * @return Redisson instance
      */
-    public static RedissonReactiveClient createRx() {
+    public static RedissonRxClient createRx() {
         Config config = new Config();
         config.useSingleServer().setAddress("redis://127.0.0.1:6379");
-        return createReactive(config);
+        return createRx(config);
     }
 
     /**
