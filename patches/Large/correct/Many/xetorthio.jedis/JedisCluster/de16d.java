diff --git a/src/main/java/redis/clients/jedis/JedisCluster.java b/src/main/java/redis/clients/jedis/JedisCluster.java
index e5895c5..611f8e5 100644
--- a/src/main/java/redis/clients/jedis/JedisCluster.java
+++ b/src/main/java/redis/clients/jedis/JedisCluster.java
@@ -1334,7 +1334,7 @@
           + " only supports SCAN commands with non-empty MATCH patterns");
     }
 
-    if (JedisClusterHashTagUtil.isClusterCompliantMatchPattern(matchPattern)) {
+    if (!JedisClusterHashTagUtil.isClusterCompliantMatchPattern(matchPattern)) {
       throw new IllegalArgumentException(JedisCluster.class.getSimpleName()
           + " only supports SCAN commands with MATCH patterns containing hash-tags ( curly-brackets enclosed strings )");
     }
