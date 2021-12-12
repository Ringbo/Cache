diff --git a/packages/DocumentsUI/src/com/android/documentsui/dirlist/FragmentTuner.java b/packages/DocumentsUI/src/com/android/documentsui/dirlist/FragmentTuner.java
index 39fdf8e..ea1deb4 100644
--- a/packages/DocumentsUI/src/com/android/documentsui/dirlist/FragmentTuner.java
+++ b/packages/DocumentsUI/src/com/android/documentsui/dirlist/FragmentTuner.java
@@ -104,7 +104,8 @@
                 return false;
             }
 
-            if (mState.action == ACTION_OPEN_TREE) {
+            if (mState.action == ACTION_OPEN_TREE
+                    || mState.action == ACTION_PICK_COPY_DESTINATION) {
                 // In this case nothing *ever* is selectable...the expected user behavior is
                 // they navigate *into* a folder, then click a confirmation button indicating
                 // that the current directory is the directory they are picking.
