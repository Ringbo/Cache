diff --git a/robospice-cache-parent/robospice-cache/src/com/octo/android/robospice/persistence/file/InFileObjectPersister.java b/robospice-cache-parent/robospice-cache/src/com/octo/android/robospice/persistence/file/InFileObjectPersister.java
index 553d7f4..d286b32 100644
--- a/robospice-cache-parent/robospice-cache/src/com/octo/android/robospice/persistence/file/InFileObjectPersister.java
+++ b/robospice-cache-parent/robospice-cache/src/com/octo/android/robospice/persistence/file/InFileObjectPersister.java
@@ -74,9 +74,9 @@
 
         boolean allDeleted = true;
         for (File cacheFile : cacheFileList) {
-            allDeleted = allDeleted || cacheFile.delete();
+            allDeleted = cacheFile.delete() && allDeleted;
         }
-        if (allDeleted) {
+        if (allDeleted || cacheFileList.length == 0) {
             Ln.d("Some file could not be deleted from cache.");
         }
     }
