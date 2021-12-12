diff --git a/src/java/voldemort/store/readonly/ReadOnlyStorageEngine.java b/src/java/voldemort/store/readonly/ReadOnlyStorageEngine.java
index 40f229c..71faa3e 100644
--- a/src/java/voldemort/store/readonly/ReadOnlyStorageEngine.java
+++ b/src/java/voldemort/store/readonly/ReadOnlyStorageEngine.java
@@ -350,7 +350,7 @@
      */
     private void deleteBackups() {
         File[] storeDirList = ReadOnlyUtils.getVersionDirs(storeDir, 0L, currentVersionId);
-        if(storeDirList.length > (numBackups + 1)) {
+        if(storeDirList != null && storeDirList.length > (numBackups + 1)) {
             // delete ALL old directories asynchronously
             File[] extraBackups = ReadOnlyUtils.findKthVersionedDir(storeDirList,
                                                                     0,
@@ -424,7 +424,7 @@
                 throw new VoldemortException("Cannot parse version id");
 
             File[] backUpDirs = ReadOnlyUtils.getVersionDirs(storeDir, versionId, Long.MAX_VALUE);
-            if(backUpDirs.length <= 1) {
+            if(backUpDirs == null || backUpDirs.length <= 1) {
                 logger.warn("No rollback performed since there are no back-up directories");
                 return;
             }
