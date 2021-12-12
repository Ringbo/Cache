diff --git a/src/java/org/apache/cassandra/db/compaction/LeveledCompactionStrategy.java b/src/java/org/apache/cassandra/db/compaction/LeveledCompactionStrategy.java
index d14545c..9fb6a89 100644
--- a/src/java/org/apache/cassandra/db/compaction/LeveledCompactionStrategy.java
+++ b/src/java/org/apache/cassandra/db/compaction/LeveledCompactionStrategy.java
@@ -181,7 +181,9 @@
         List<ICompactionScanner> scanners = new ArrayList<ICompactionScanner>(sstables.size());
         for (Integer level : byLevel.keySet())
         {
-            if (level == 0)
+            // level can be -1 when sstables are added to DataTracker but not to LeveledManifest
+            // since we don't know which level those sstable belong yet, we simply do the same as L0 sstables.
+            if (level <= 0)
             {
                 // L0 makes no guarantees about overlapping-ness.  Just create a direct scanner for each
                 for (SSTableReader sstable : byLevel.get(level))
