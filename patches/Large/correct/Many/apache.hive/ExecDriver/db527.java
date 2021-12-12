diff --git a/ql/src/java/org/apache/hadoop/hive/ql/exec/ExecDriver.java b/ql/src/java/org/apache/hadoop/hive/ql/exec/ExecDriver.java
index 80a57fa..6443b2a 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/exec/ExecDriver.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/exec/ExecDriver.java
@@ -351,7 +351,7 @@
     ExecDriverTaskHandle th = (ExecDriverTaskHandle)t;
     RunningJob rj = th.getRunningJob();
     this.mapProgress = Math.round(rj.mapProgress() * 100);
-    this.reduceProgress = Math.round(rj.mapProgress() * 100);
+    this.reduceProgress = Math.round(rj.reduceProgress() * 100);
     taskCounters.put("CNTR_NAME_" + getId() + "_MAP_PROGRESS", Long.valueOf(this.mapProgress));
     taskCounters.put("CNTR_NAME_" + getId() + "_REDUCE_PROGRESS", Long.valueOf(this.reduceProgress));
     Counters ctrs = th.getCounters();
