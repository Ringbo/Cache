diff --git a/src/com/owncloud/android/ui/activity/FolderSyncActivity.java b/src/com/owncloud/android/ui/activity/FolderSyncActivity.java
index 961e943..8ae2e56 100644
--- a/src/com/owncloud/android/ui/activity/FolderSyncActivity.java
+++ b/src/com/owncloud/android/ui/activity/FolderSyncActivity.java
@@ -319,7 +319,7 @@
     @Override
     public void onSyncStatusToggleClick(int section, SyncedFolderItem syncedFolderItem) {
         if (syncedFolderItem.getId() > UNPERSISTED_ID) {
-            mSyncedFolderProvider.updateFolderSyncEnabled(syncedFolderItem.getId(), !syncedFolderItem.isEnabled());
+            mSyncedFolderProvider.updateFolderSyncEnabled(syncedFolderItem.getId(), syncedFolderItem.isEnabled());
         } else {
             mSyncedFolderProvider.storeFolderSync(syncedFolderItem);
         }
