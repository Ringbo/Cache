diff --git a/src/test/java/org/redisson/RedissonCountDownLatchConcurrentTest.java b/src/test/java/org/redisson/RedissonCountDownLatchConcurrentTest.java
index 66eb8e0..9c60d8f 100644
--- a/src/test/java/org/redisson/RedissonCountDownLatchConcurrentTest.java
+++ b/src/test/java/org/redisson/RedissonCountDownLatchConcurrentTest.java
@@ -26,7 +26,7 @@
     @AfterClass
     public static void afterClass() throws IOException, InterruptedException {
         if (!RedissonRuntimeEnvironment.isTravis) {
-            RedisRunner.startDefaultRedisServerInstance();
+            RedisRunner.shutDownDefaultRedisServerInstance();
         }
     }
 
