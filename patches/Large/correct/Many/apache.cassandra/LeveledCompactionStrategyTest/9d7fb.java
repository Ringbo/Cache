diff --git a/test/unit/org/apache/cassandra/db/compaction/LeveledCompactionStrategyTest.java b/test/unit/org/apache/cassandra/db/compaction/LeveledCompactionStrategyTest.java
index 56f12de..9392195 100644
--- a/test/unit/org/apache/cassandra/db/compaction/LeveledCompactionStrategyTest.java
+++ b/test/unit/org/apache/cassandra/db/compaction/LeveledCompactionStrategyTest.java
@@ -69,7 +69,7 @@
 
         LeveledCompactionStrategy strat = (LeveledCompactionStrategy)store.getCompactionStrategy();
 
-        while (strat.getLevelSize(0) > 0)
+        while (strat.getLevelSize(0) > 1)
         {
             store.forceMajorCompaction();
             Thread.sleep(200);
