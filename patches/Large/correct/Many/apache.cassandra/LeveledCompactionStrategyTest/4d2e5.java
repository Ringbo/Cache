diff --git a/test/unit/org/apache/cassandra/db/compaction/LeveledCompactionStrategyTest.java b/test/unit/org/apache/cassandra/db/compaction/LeveledCompactionStrategyTest.java
index 9392195..051aff8 100644
--- a/test/unit/org/apache/cassandra/db/compaction/LeveledCompactionStrategyTest.java
+++ b/test/unit/org/apache/cassandra/db/compaction/LeveledCompactionStrategyTest.java
@@ -64,7 +64,7 @@
                 rm.add(new QueryPath(cfname, null, ByteBufferUtil.bytes("column" + c)), value, 0);
             }
             rm.apply();
-            store.forceFlush();
+            store.forceBlockingFlush();
         }
 
         LeveledCompactionStrategy strat = (LeveledCompactionStrategy)store.getCompactionStrategy();
