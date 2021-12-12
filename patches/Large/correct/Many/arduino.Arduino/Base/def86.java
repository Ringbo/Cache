diff --git a/app/src/processing/app/Base.java b/app/src/processing/app/Base.java
index 3a73e4a..05febcc 100644
--- a/app/src/processing/app/Base.java
+++ b/app/src/processing/app/Base.java
@@ -584,7 +584,7 @@
    * Replace the sketch in the current window with a new untitled document.
    */
   public void handleNewReplace() {
-    if (!activeEditor.checkModified(false)) {
+    if (!activeEditor.checkModified(true)) {
       return;  // sketch was modified, and user canceled
     }
     // Close the running window, avoid window boogers with multiple sketches
@@ -616,7 +616,7 @@
    * @param path Location of the primary pde file for the sketch.
    */
   public void handleOpenReplace(String path) {
-    if (!activeEditor.checkModified(false)) {
+    if (!activeEditor.checkModified(true)) {
       return;  // sketch was modified, and user canceled
     }
     // Close the running window, avoid window boogers with multiple sketches
