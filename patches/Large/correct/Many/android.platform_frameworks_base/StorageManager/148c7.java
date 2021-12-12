diff --git a/core/java/android/os/storage/StorageManager.java b/core/java/android/os/storage/StorageManager.java
index 140f317..320aa2c 100644
--- a/core/java/android/os/storage/StorageManager.java
+++ b/core/java/android/os/storage/StorageManager.java
@@ -950,7 +950,7 @@
                         || vol.getType() == VolumeInfo.TYPE_PUBLIC) && vol.isMountedReadable()) {
                     final File internalPath = FileUtils.rewriteAfterRename(vol.getPath(),
                             vol.getInternalPath(), path);
-                    if (internalPath != null) {
+                    if (internalPath != null && internalPath.exists()) {
                         return internalPath;
                     }
                 }
