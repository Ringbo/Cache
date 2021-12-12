diff --git a/collect_app/src/main/java/org/odk/collect/android/activities/FormChooserList.java b/collect_app/src/main/java/org/odk/collect/android/activities/FormChooserList.java
index 86d8d1e..3a66a22 100644
--- a/collect_app/src/main/java/org/odk/collect/android/activities/FormChooserList.java
+++ b/collect_app/src/main/java/org/odk/collect/android/activities/FormChooserList.java
@@ -79,7 +79,7 @@
 
         // DiskSyncTask checks the disk for any forms not already in the content provider
         // that is, put here by dragging and dropping onto the SDCard
-        mDiskSyncTask = (DiskSyncTask) getLastNonConfigurationInstance();
+        mDiskSyncTask = (DiskSyncTask) getLastCustomNonConfigurationInstance();
         if (mDiskSyncTask == null) {
             Timber.i("Starting new disk sync task");
             mDiskSyncTask = new DiskSyncTask();
