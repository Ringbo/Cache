diff --git a/sdks/java/io/redis/src/main/java/org/apache/beam/sdk/io/redis/RedisIO.java b/sdks/java/io/redis/src/main/java/org/apache/beam/sdk/io/redis/RedisIO.java
index 04bb47e..0554865 100644
--- a/sdks/java/io/redis/src/main/java/org/apache/beam/sdk/io/redis/RedisIO.java
+++ b/sdks/java/io/redis/src/main/java/org/apache/beam/sdk/io/redis/RedisIO.java
@@ -353,7 +353,7 @@
       bufferedKeys.add(key);
       this.window = window;
       this.lastMsg = processContext.timestamp();
-      if (bufferedKeys.size() > getBatchSize()) {
+      if (bufferedKeys.size() >= getBatchSize()) {
         List<KV<String, String>> kvs = fetchAndFlush();
         for (KV<String, String> kv : kvs) {
           processContext.output(kv);
