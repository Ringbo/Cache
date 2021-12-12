diff --git a/sdks/java/io/redis/src/main/java/org/apache/beam/sdk/io/redis/RedisIO.java b/sdks/java/io/redis/src/main/java/org/apache/beam/sdk/io/redis/RedisIO.java
index e0f8e3d..0e1d44c 100644
--- a/sdks/java/io/redis/src/main/java/org/apache/beam/sdk/io/redis/RedisIO.java
+++ b/sdks/java/io/redis/src/main/java/org/apache/beam/sdk/io/redis/RedisIO.java
@@ -196,7 +196,7 @@
 
       return input
           .apply(Create.of(keyPattern()))
-          .apply(ParDo.of(new ReadKeywsWithPattern(connectionConfiguration())))
+          .apply(ParDo.of(new ReadKeysWithPattern(connectionConfiguration())))
           .apply(RedisIO.readAll().withConnectionConfiguration(connectionConfiguration()));
     }
   }
@@ -255,12 +255,12 @@
     }
   }
 
-  private abstract static class BaseReadFn<T> extends DoFn<String, T> {
+  abstract static class BaseReadFn<T> extends DoFn<String, T> {
     protected final RedisConnectionConfiguration connectionConfiguration;
 
-    protected transient Jedis jedis;
+    transient Jedis jedis;
 
-    public BaseReadFn(RedisConnectionConfiguration connectionConfiguration) {
+    BaseReadFn(RedisConnectionConfiguration connectionConfiguration) {
       this.connectionConfiguration = connectionConfiguration;
     }
 
@@ -275,9 +275,9 @@
     }
   }
 
-  private static class ReadKeywsWithPattern extends BaseReadFn<String> {
+  private static class ReadKeysWithPattern extends BaseReadFn<String> {
 
-    ReadKeywsWithPattern(RedisConnectionConfiguration connectionConfiguration) {
+    ReadKeysWithPattern(RedisConnectionConfiguration connectionConfiguration) {
       super(connectionConfiguration);
     }
 
