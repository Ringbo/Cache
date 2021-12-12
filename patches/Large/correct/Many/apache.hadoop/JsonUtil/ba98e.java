diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/web/JsonUtil.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/web/JsonUtil.java
index 58fafde..63fbda6 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/web/JsonUtil.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/web/JsonUtil.java
@@ -414,7 +414,7 @@
         (Object[])m.get("cachedLocations"));
 
     final LocatedBlock locatedblock = new LocatedBlock(b, locations,
-        startOffset, isCorrupt, cachedLocations);
+        null, null, startOffset, isCorrupt, cachedLocations);
     locatedblock.setBlockToken(toBlockToken((Map<?, ?>)m.get("blockToken")));
     return locatedblock;
   }
