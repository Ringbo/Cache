diff --git a/src/org/odk/collect/android/activities/FormEntryActivity.java b/src/org/odk/collect/android/activities/FormEntryActivity.java
index 4645b97..502ef34 100644
--- a/src/org/odk/collect/android/activities/FormEntryActivity.java
+++ b/src/org/odk/collect/android/activities/FormEntryActivity.java
@@ -1322,7 +1322,7 @@
         if (mSaveToDiskTask != null) {
             // We have to call cancel to terminate the thread, otherwise it
             // lives on and retains the FEC in memory.
-            if (mFormLoaderTask.getStatus() == AsyncTask.Status.FINISHED) {
+            if (mSaveToDiskTask.getStatus() == AsyncTask.Status.FINISHED) {
                 mSaveToDiskTask.cancel(false);
             }
             mSaveToDiskTask.setFormSavedListener(null);
