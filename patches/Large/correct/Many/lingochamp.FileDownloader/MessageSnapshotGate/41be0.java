diff --git a/library/src/main/java/com/liulishuo/filedownloader/MessageSnapshotGate.java b/library/src/main/java/com/liulishuo/filedownloader/MessageSnapshotGate.java
index 21fe310..dfd28eb 100644
--- a/library/src/main/java/com/liulishuo/filedownloader/MessageSnapshotGate.java
+++ b/library/src/main/java/com/liulishuo/filedownloader/MessageSnapshotGate.java
@@ -82,12 +82,12 @@
 
                 if (!transmitMessage(taskList, snapshot)) {
 
-                    String log = "The event isn't consumed, id:" + snapshot.getId() + " status:"
-                            + snapshot.getStatus() + " task-count:" + taskList.size();
+                    StringBuilder log = new StringBuilder("The event isn't consumed, id:" + snapshot.getId() + " status:"
+                            + snapshot.getStatus() + " task-count:" + taskList.size());
                     for (BaseDownloadTask.IRunningTask task : taskList) {
-                        log += " | " + task.getOrigin().getStatus();
+                        log.append(" | ").append(task.getOrigin().getStatus());
                     }
-                    FileDownloadLog.i(this, log);
+                    FileDownloadLog.i(this, log.toString());
                 }
 
 
