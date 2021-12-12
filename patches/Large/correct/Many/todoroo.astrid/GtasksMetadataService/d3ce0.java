diff --git a/astrid/plugin-src/com/todoroo/astrid/gtasks/GtasksMetadataService.java b/astrid/plugin-src/com/todoroo/astrid/gtasks/GtasksMetadataService.java
index 7f50d3b..0fc411c 100644
--- a/astrid/plugin-src/com/todoroo/astrid/gtasks/GtasksMetadataService.java
+++ b/astrid/plugin-src/com/todoroo/astrid/gtasks/GtasksMetadataService.java
@@ -77,7 +77,7 @@
     }
 
     @Override
-    public void findLocalMatch(GtasksTaskContainer remoteTask) {
+    public synchronized void findLocalMatch(GtasksTaskContainer remoteTask) {
         if(remoteTask.task.getId() != Task.NO_ID)
             return;
         TodorooCursor<Metadata> cursor = metadataDao.query(Query.select(Metadata.PROPERTIES).
