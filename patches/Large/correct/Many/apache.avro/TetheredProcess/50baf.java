diff --git a/lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java b/lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java
index 40a1056..fac7589 100644
--- a/lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java
+++ b/lang/java/mapred/src/main/java/org/apache/avro/mapred/tether/TetheredProcess.java
@@ -154,7 +154,7 @@
     File stdout = TaskLog.getTaskLogFile(taskid, false, TaskLog.LogName.STDOUT);
     File stderr = TaskLog.getTaskLogFile(taskid, false, TaskLog.LogName.STDERR);
     long logLength = TaskLog.getTaskLogLength(job);
-    command = TaskLog.captureOutAndError(command, stdout, stderr, logLength);
+    command = TaskLog.captureOutAndError(null, command, stdout, stderr, logLength, false);
     stdout.getParentFile().mkdirs();
     stderr.getParentFile().mkdirs();
 
