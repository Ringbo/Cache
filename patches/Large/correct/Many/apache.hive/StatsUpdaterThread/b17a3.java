diff --git a/ql/src/java/org/apache/hadoop/hive/ql/stats/StatsUpdaterThread.java b/ql/src/java/org/apache/hadoop/hive/ql/stats/StatsUpdaterThread.java
index f34cb61..a50ec18 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/stats/StatsUpdaterThread.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/stats/StatsUpdaterThread.java
@@ -447,7 +447,7 @@
     }
     // TODO: we should probably skip updating if writeId is from an active txn
     boolean isTxnValid = (writeIdString == null) || ObjectStore.isCurrentStatsValidForTheQuery(
-        conf, db, tbl, params, statsWriteId , writeIdString, false);
+        conf, params, statsWriteId , writeIdString, false);
     return getExistingStatsToUpdate(existingStats, params, isTxnValid);
   }
 
@@ -472,7 +472,7 @@
     }
     // TODO: we should probably skip updating if writeId is from an active txn
     if (writeIdString != null && !ObjectStore.isCurrentStatsValidForTheQuery(
-        conf, db, tbl, params, statsWriteId, writeIdString, false)) {
+        conf, params, statsWriteId, writeIdString, false)) {
       return allCols;
     }
     List<String> colsToUpdate = new ArrayList<>();
