diff --git a/src/java/org/apache/cassandra/db/compaction/LeveledManifest.java b/src/java/org/apache/cassandra/db/compaction/LeveledManifest.java
index 643fe44..71356f0 100644
--- a/src/java/org/apache/cassandra/db/compaction/LeveledManifest.java
+++ b/src/java/org/apache/cassandra/db/compaction/LeveledManifest.java
@@ -274,7 +274,7 @@
 
     public synchronized int getLevelSize(int i)
     {
-        if (i > generations.length)
+        if (i >= generations.length)
             throw new ArrayIndexOutOfBoundsException("Maximum valid generation is " + (generations.length - 1));
         return generations[i].size();
     }
