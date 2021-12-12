diff --git a/ql/src/java/org/apache/hadoop/hive/ql/exec/StatsTask.java b/ql/src/java/org/apache/hadoop/hive/ql/exec/StatsTask.java
index b9456e8..74d1c05 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/exec/StatsTask.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/exec/StatsTask.java
@@ -377,7 +377,7 @@
         if (work.getLoadTableDesc() != null &&
             !work.getLoadTableDesc().getReplace()) {
           String originalValue = parameters.get(statType);
-          if (originalValue != null) {
+          if (originalValue != null && !originalValue.equals("-1")) {
             longValue += Long.parseLong(originalValue);
           }
         }
