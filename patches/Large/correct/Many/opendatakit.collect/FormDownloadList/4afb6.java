diff --git a/collect_app/src/main/java/org/odk/collect/android/activities/FormDownloadList.java b/collect_app/src/main/java/org/odk/collect/android/activities/FormDownloadList.java
index 9305b73..8462612 100644
--- a/collect_app/src/main/java/org/odk/collect/android/activities/FormDownloadList.java
+++ b/collect_app/src/main/java/org/odk/collect/android/activities/FormDownloadList.java
@@ -137,7 +137,7 @@
         });
 
         toggleButton = findViewById(R.id.toggle_button);
-        toggleButton.setEnabled(listView.getCheckedItemCount() > 0);
+        toggleButton.setEnabled(false);
         toggleButton.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) {
@@ -627,7 +627,7 @@
             updateAdapter();
             selectSupersededForms();
             downloadButton.setEnabled(listView.getCheckedItemCount() > 0);
-            toggleButton.setEnabled(listView.getCheckedItemCount() > 0);
+            toggleButton.setEnabled(listView.getCount() > 0); 
             toggleButtonLabel(toggleButton, listView);
         }
     }
