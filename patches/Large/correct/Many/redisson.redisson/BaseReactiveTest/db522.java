diff --git a/src/test/java/org/redisson/BaseReactiveTest.java b/src/test/java/org/redisson/BaseReactiveTest.java
index 1e8aeb0..a743268 100644
--- a/src/test/java/org/redisson/BaseReactiveTest.java
+++ b/src/test/java/org/redisson/BaseReactiveTest.java
@@ -31,7 +31,7 @@
     @AfterClass
     public static void afterClass() throws IOException, InterruptedException {
         if (!RedissonRuntimeEnvironment.isTravis) {
-            RedisRunner.startDefaultRedisServerInstance();
+            RedisRunner.shutDownDefaultRedisServerInstance();
             defaultRedisson.shutdown();
         }
     }
