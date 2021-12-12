diff --git a/AnkiDroid/src/main/java/com/ichi2/async/DeckTask.java b/AnkiDroid/src/main/java/com/ichi2/async/DeckTask.java
index 9f9ea39..c81d3ad 100644
--- a/AnkiDroid/src/main/java/com/ichi2/async/DeckTask.java
+++ b/AnkiDroid/src/main/java/com/ichi2/async/DeckTask.java
@@ -844,7 +844,7 @@
             }
 
             publishProgress(new TaskData(res.getString(R.string.import_update_counts)));
-            return new TaskData(true);
+            return new TaskData(addedCount, null, true);
         } catch (RuntimeException e) {
             Timber.e(e, "doInBackgroundImportAdd - RuntimeException on importing cards");
             AnkiDroidApp.sendExceptionReport(e, "doInBackgroundImportAdd");
