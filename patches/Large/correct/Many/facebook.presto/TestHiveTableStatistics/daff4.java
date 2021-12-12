diff --git a/presto-product-tests/src/main/java/com/facebook/presto/tests/hive/TestHiveTableStatistics.java b/presto-product-tests/src/main/java/com/facebook/presto/tests/hive/TestHiveTableStatistics.java
index 1c1cb5f..107e3ba 100644
--- a/presto-product-tests/src/main/java/com/facebook/presto/tests/hive/TestHiveTableStatistics.java
+++ b/presto-product-tests/src/main/java/com/facebook/presto/tests/hive/TestHiveTableStatistics.java
@@ -282,14 +282,14 @@
                 row("p_nationkey", null, 5.0, 0.0, null, "1", "24"),
                 row("p_name", null, 6.0, 0.0, null, null, null),
                 row("p_regionkey", null, 3.0, 0.0, null, "1", "3"),
-                row("p_comment", null, 1.0, 0.0, null, null, null),
+                row("p_comment", null, 7.0, 0.0, null, null, null),
                 row(null, null, null, null, 15.0, null, null));
 
         assertThat(query(showStatsPartitionOne)).containsOnly(
                 row("p_nationkey", null, 5.0, 0.0, null, "1", "24"),
                 row("p_name", null, 6.0, 0.0, null, null, null),
                 row("p_regionkey", null, 1.0, 0.0, null, "1", "1"),
-                row("p_comment", null, 1.0, 0.0, null, null, null),
+                row("p_comment", null, 7.0, 0.0, null, null, null),
                 row(null, null, null, null, 5.0, null, null));
 
         assertThat(query(showStatsPartitionTwo)).containsOnly(
@@ -307,21 +307,21 @@
                 row("p_nationkey", null, 5.0, 0.0, null, "1", "24"),
                 row("p_name", null, 6.0, 0.0, null, null, null),
                 row("p_regionkey", null, 3.0, 0.0, null, "1", "3"),
-                row("p_comment", null, 1.0, 0.0, null, null, null),
+                row("p_comment", null, 7.0, 0.0, null, null, null),
                 row(null, null, null, null, 15.0, null, null));
 
         assertThat(query(showStatsPartitionOne)).containsOnly(
                 row("p_nationkey", null, 5.0, 0.0, null, "1", "24"),
                 row("p_name", null, 6.0, 0.0, null, null, null),
                 row("p_regionkey", null, 1.0, 0.0, null, "1", "1"),
-                row("p_comment", null, 1.0, 0.0, null, null, null),
+                row("p_comment", null, 7.0, 0.0, null, null, null),
                 row(null, null, null, null, 5.0, null, null));
 
         assertThat(query(showStatsPartitionTwo)).containsOnly(
                 row("p_nationkey", null, 4.0, 0.0, null, "8", "21"),
                 row("p_name", null, 6.0, 0.0, null, null, null),
                 row("p_regionkey", null, 1.0, 0.0, null, "2", "2"),
-                row("p_comment", null, 1.0, 0.0, null, null, null),
+                row("p_comment", null, 5.0, 0.0, null, null, null),
                 row(null, null, null, null, 5.0, null, null));
     }
 
