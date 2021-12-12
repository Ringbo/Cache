diff --git a/src/test/java/org/redisson/RedissonTest.java b/src/test/java/org/redisson/RedissonTest.java
index 28a4181..65792df 100644
--- a/src/test/java/org/redisson/RedissonTest.java
+++ b/src/test/java/org/redisson/RedissonTest.java
@@ -44,7 +44,7 @@
     @AfterClass
     public static void afterClass() throws IOException, InterruptedException {
         if (!RedissonRuntimeEnvironment.isTravis) {
-            RedisRunner.startDefaultRedisServerInstance();
+            RedisRunner.shutDownDefaultRedisServerInstance();
             defaultRedisson.shutdown();
         }
     }
