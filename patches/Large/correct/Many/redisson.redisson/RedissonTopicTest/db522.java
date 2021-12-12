diff --git a/src/test/java/org/redisson/RedissonTopicTest.java b/src/test/java/org/redisson/RedissonTopicTest.java
index 10404f0..d2121da 100644
--- a/src/test/java/org/redisson/RedissonTopicTest.java
+++ b/src/test/java/org/redisson/RedissonTopicTest.java
@@ -28,7 +28,7 @@
     @AfterClass
     public static void afterClass() throws IOException, InterruptedException {
         if (!RedissonRuntimeEnvironment.isTravis) {
-            RedisRunner.startDefaultRedisServerInstance();
+            RedisRunner.shutDownDefaultRedisServerInstance();
         }
     }
 
