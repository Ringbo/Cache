diff --git a/collect_app/src/main/java/org/odk/collect/android/activities/InstanceChooserList.java b/collect_app/src/main/java/org/odk/collect/android/activities/InstanceChooserList.java
index fd64164..cba332c 100644
--- a/collect_app/src/main/java/org/odk/collect/android/activities/InstanceChooserList.java
+++ b/collect_app/src/main/java/org/odk/collect/android/activities/InstanceChooserList.java
@@ -247,7 +247,7 @@
     @Override
     public void onLoadFinished(@NonNull Loader<Cursor> loader, Cursor cursor) {
         hideProgressBarIfAllowed();
-        listAdapter.changeCursor(cursor);
+        listAdapter.swapCursor(cursor);
     }
 
     @Override
