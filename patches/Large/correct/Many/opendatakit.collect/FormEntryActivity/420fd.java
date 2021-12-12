diff --git a/src/org/odk/collect/android/activities/FormEntryActivity.java b/src/org/odk/collect/android/activities/FormEntryActivity.java
index bf8edc6..571dad8 100644
--- a/src/org/odk/collect/android/activities/FormEntryActivity.java
+++ b/src/org/odk/collect/android/activities/FormEntryActivity.java
@@ -1077,7 +1077,7 @@
      */
     private boolean saveDataToDisk(boolean exit, boolean complete, String updatedSaveName) {
         // save current answer
-        if (!saveAnswersForCurrentScreen(EVALUATE_CONSTRAINTS)) {
+        if (!saveAnswersForCurrentScreen(complete)) {
             Toast.makeText(this, getString(R.string.data_saved_error), Toast.LENGTH_SHORT).show();
             return false;
         }
