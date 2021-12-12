diff --git a/src/tools/TreeSync.java b/src/tools/TreeSync.java
index 3db87e5..ad3e7d0 100644
--- a/src/tools/TreeSync.java
+++ b/src/tools/TreeSync.java
@@ -353,7 +353,7 @@
 
     LOG.debug("[" + thread_id + "] Start row: " + UniqueId.uidToString(start_row));
     LOG.debug("[" + thread_id + "] End row: " + UniqueId.uidToString(end_row));
-    final Scanner scanner = tsdb.getClient().newScanner(tsdb.uidTable());
+    final Scanner scanner = tsdb.getClient().newScanner(tsdb.metaTable());
     scanner.setStartKey(start_row);
     scanner.setStopKey(end_row);
     scanner.setFamily("name".getBytes(CHARSET));
