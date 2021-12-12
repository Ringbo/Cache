diff --git a/src/java/org/apache/cassandra/db/compaction/LeveledManifest.java b/src/java/org/apache/cassandra/db/compaction/LeveledManifest.java
index 2e5e7a0..bc1ba57 100644
--- a/src/java/org/apache/cassandra/db/compaction/LeveledManifest.java
+++ b/src/java/org/apache/cassandra/db/compaction/LeveledManifest.java
@@ -239,7 +239,7 @@
 
             // L0 gets a special case that if we don't have anything more important to do,
             // we'll go ahead and compact even just one sstable
-            if (score > 1 || i == 0)
+            if (score > 1.001 || i == 0)
             {
                 Collection<SSTableReader> candidates = getCandidatesFor(i);
                 if (logger.isDebugEnabled())
@@ -427,7 +427,7 @@
             List<SSTableReader> sstables = generations[i];
             if (sstables.isEmpty())
                 continue;
-            n += (SSTableReader.getTotalBytes(sstables) - maxBytesForLevel(i)) / maxSSTableSizeInMB;
+            n += Math.max(0L, SSTableReader.getTotalBytes(sstables) - maxBytesForLevel(i)) / (maxSSTableSizeInMB * 1024 * 1024);
         }
         return n;
     }
