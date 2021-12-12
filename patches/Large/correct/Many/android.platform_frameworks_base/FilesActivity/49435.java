diff --git a/packages/DocumentsUI/src/com/android/documentsui/FilesActivity.java b/packages/DocumentsUI/src/com/android/documentsui/FilesActivity.java
index 2af6c46..bed8b29 100644
--- a/packages/DocumentsUI/src/com/android/documentsui/FilesActivity.java
+++ b/packages/DocumentsUI/src/com/android/documentsui/FilesActivity.java
@@ -381,7 +381,7 @@
             }
 
             // Open the Close drawer if it is closed and we're at the top of a root.
-            if (size == 1) {
+            if (size <= 1) {
                 mDrawer.setOpen(true);
                 // Remember so we don't just close it again if back is pressed again.
                 mDrawerLastFiddled = System.currentTimeMillis();
