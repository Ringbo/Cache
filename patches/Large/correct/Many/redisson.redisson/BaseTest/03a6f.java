diff --git a/src/test/java/org/redisson/BaseTest.java b/src/test/java/org/redisson/BaseTest.java
index 07d0f38..51fdda4 100644
--- a/src/test/java/org/redisson/BaseTest.java
+++ b/src/test/java/org/redisson/BaseTest.java
@@ -22,7 +22,7 @@
     @AfterClass
     public static void afterClass() throws IOException, InterruptedException {
         if (!RedissonRuntimeEnvironment.isTravis) {
-            RedisRunner.startDefaultRedisServerInstance();
+            RedisRunner.shutDownDefaultRedisServerInstance();
             defaultRedisson.shutdown();
         }
     }
