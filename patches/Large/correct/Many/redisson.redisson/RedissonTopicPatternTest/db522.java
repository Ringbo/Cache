diff --git a/src/test/java/org/redisson/RedissonTopicPatternTest.java b/src/test/java/org/redisson/RedissonTopicPatternTest.java
index 890b8a7..9fcfb2a 100644
--- a/src/test/java/org/redisson/RedissonTopicPatternTest.java
+++ b/src/test/java/org/redisson/RedissonTopicPatternTest.java
@@ -28,7 +28,7 @@
     @AfterClass
     public static void afterClass() throws IOException, InterruptedException {
         if (!RedissonRuntimeEnvironment.isTravis) {
-            RedisRunner.startDefaultRedisServerInstance();
+            RedisRunner.shutDownDefaultRedisServerInstance();
         }
     }
 
