diff --git a/src/main/java/redis/clients/jedis/BinaryJedis.java b/src/main/java/redis/clients/jedis/BinaryJedis.java
index 4b93766..6431733 100644
--- a/src/main/java/redis/clients/jedis/BinaryJedis.java
+++ b/src/main/java/redis/clients/jedis/BinaryJedis.java
@@ -2441,7 +2441,7 @@
   public Set<Tuple> zrangeByScoreWithScores(final byte[] key, final double min, final double max) {
     checkIsInMultiOrPipeline();
     client.zrangeByScoreWithScores(key, min, max);
-    return getBinaryTupledSet();
+    return getTupledSet();
   }
 
   @Override
@@ -2503,7 +2503,7 @@
       final int offset, final int count) {
     checkIsInMultiOrPipeline();
     client.zrangeByScoreWithScores(key, min, max, offset, count);
-    return getBinaryTupledSet();
+    return getTupledSet();
   }
 
   @Override
@@ -2561,7 +2561,7 @@
   public Set<Tuple> zrevrangeByScoreWithScores(final byte[] key, final double max, final double min) {
     checkIsInMultiOrPipeline();
     client.zrevrangeByScoreWithScores(key, max, min);
-    return getBinaryTupledSet();
+    return getTupledSet();
   }
 
   @Override
@@ -2569,7 +2569,7 @@
       final double min, final int offset, final int count) {
     checkIsInMultiOrPipeline();
     client.zrevrangeByScoreWithScores(key, max, min, offset, count);
-    return getBinaryTupledSet();
+    return getTupledSet();
   }
 
   @Override
