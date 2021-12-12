diff --git a/api/src/com/todoroo/astrid/sync/SyncProvider.java b/api/src/com/todoroo/astrid/sync/SyncProvider.java
index 78d0c15..d1e438b 100644
--- a/api/src/com/todoroo/astrid/sync/SyncProvider.java
+++ b/api/src/com/todoroo/astrid/sync/SyncProvider.java
@@ -276,8 +276,8 @@
                     TYPE remote = data.remoteUpdated.get(remoteIndex);
                     push(local, remote);
 
-                    // re-read remote task after merge
-                    remote = pull(remote);
+                    // re-read remote task after merge (with local's title)
+                    remote = pull(local);
                     remote.task.setId(local.task.getId());
                     data.remoteUpdated.set(remoteIndex, remote);
                 } else {
