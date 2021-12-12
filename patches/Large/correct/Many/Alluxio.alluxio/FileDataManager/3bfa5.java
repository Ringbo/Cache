diff --git a/servers/src/main/java/tachyon/worker/file/FileDataManager.java b/servers/src/main/java/tachyon/worker/file/FileDataManager.java
index 6e05839..a256929 100644
--- a/servers/src/main/java/tachyon/worker/file/FileDataManager.java
+++ b/servers/src/main/java/tachyon/worker/file/FileDataManager.java
@@ -244,7 +244,7 @@
    */
   public void clearPersistedFiles(List<Long> persistedFiles) {
     synchronized (mPersistedFiles) {
-      mPersistedFiles.removeAll(mPersistedFiles);
+      mPersistedFiles.removeAll(persistedFiles);
     }
   }
 }
