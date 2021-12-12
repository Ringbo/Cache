diff --git a/src/com/owncloud/android/services/observer/SyncedFolderObserverService.java b/src/com/owncloud/android/services/observer/SyncedFolderObserverService.java
index f322c89..e843672 100644
--- a/src/com/owncloud/android/services/observer/SyncedFolderObserverService.java
+++ b/src/com/owncloud/android/services/observer/SyncedFolderObserverService.java
@@ -72,7 +72,7 @@
         fileFilter = new FileFilter() {
             @Override
             public boolean accept(File pathname) {
-                return !pathname.getName().startsWith(".") && !pathname.getAbsolutePath().endsWith(".tmp");
+                return !pathname.getName().startsWith(".") && !pathname.getName().endsWith(".tmp");
             }
         };
 
