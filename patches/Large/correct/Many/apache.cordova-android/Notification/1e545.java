diff --git a/framework/src/org/apache/cordova/Notification.java b/framework/src/org/apache/cordova/Notification.java
index 9fb423a..b5834c3 100755
--- a/framework/src/org/apache/cordova/Notification.java
+++ b/framework/src/org/apache/cordova/Notification.java
@@ -233,7 +233,7 @@
 
         // First button
         if (fButtons.length > 0) {
-          dlg.setPositiveButton(fButtons[0],
+          dlg.setNegativeButton(fButtons[0],
               new AlertDialog.OnClickListener() {
             public void onClick(DialogInterface dialog, int which) {
               dialog.dismiss();
@@ -255,7 +255,7 @@
 
         // Third button
         if (fButtons.length > 2) {
-          dlg.setNegativeButton(fButtons[2],
+          dlg.setPositiveButton(fButtons[2],
               new AlertDialog.OnClickListener() {
             public void onClick(DialogInterface dialog, int which) {
               dialog.dismiss();
