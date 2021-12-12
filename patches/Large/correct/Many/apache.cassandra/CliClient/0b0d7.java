diff --git a/src/java/org/apache/cassandra/cli/CliClient.java b/src/java/org/apache/cassandra/cli/CliClient.java
index d25ebb4..0320d65 100644
--- a/src/java/org/apache/cassandra/cli/CliClient.java
+++ b/src/java/org/apache/cassandra/cli/CliClient.java
@@ -1352,7 +1352,7 @@
                 sessionState.out.printf("      Row cache size / save period in seconds: %s/%s%n", cf_def.row_cache_size, cf_def.row_cache_save_period_in_seconds);
                 sessionState.out.printf("      Key cache size / save period in seconds: %s/%s%n", cf_def.key_cache_size, cf_def.key_cache_save_period_in_seconds);
                 sessionState.out.printf("      Memtable thresholds: %s/%s/%s (millions of ops/minutes/MB)%n",
-                                cf_def.memtable_operations_in_millions, cf_def.memtable_throughput_in_mb, cf_def.memtable_flush_after_mins);
+                                cf_def.memtable_operations_in_millions, cf_def.memtable_flush_after_mins, cf_def.memtable_throughput_in_mb);
                 sessionState.out.printf("      GC grace seconds: %s%n", cf_def.gc_grace_seconds);
                 sessionState.out.printf("      Compaction min/max thresholds: %s/%s%n", cf_def.min_compaction_threshold, cf_def.max_compaction_threshold);
                 sessionState.out.printf("      Read repair chance: %s%n", cf_def.read_repair_chance);
