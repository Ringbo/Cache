diff --git a/src/test/java/org/redisson/RedissonTwoLockedThread.java b/src/test/java/org/redisson/RedissonTwoLockedThread.java
index 76214c0..6070720 100644
--- a/src/test/java/org/redisson/RedissonTwoLockedThread.java
+++ b/src/test/java/org/redisson/RedissonTwoLockedThread.java
@@ -42,7 +42,7 @@
     @AfterClass
     public static void afterClass() throws IOException, InterruptedException {
         if (!RedissonRuntimeEnvironment.isTravis) {
-            RedisRunner.startDefaultRedisServerInstance();
+            RedisRunner.shutDownDefaultRedisServerInstance();
         }
     }
 
