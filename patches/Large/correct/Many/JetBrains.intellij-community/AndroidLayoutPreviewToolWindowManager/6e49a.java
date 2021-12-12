diff --git a/plugins/android/src/org/jetbrains/android/uipreview/AndroidLayoutPreviewToolWindowManager.java b/plugins/android/src/org/jetbrains/android/uipreview/AndroidLayoutPreviewToolWindowManager.java
index 2d1f647..b9621ac 100644
--- a/plugins/android/src/org/jetbrains/android/uipreview/AndroidLayoutPreviewToolWindowManager.java
+++ b/plugins/android/src/org/jetbrains/android/uipreview/AndroidLayoutPreviewToolWindowManager.java
@@ -281,7 +281,7 @@
   public void render() {
     ApplicationManager.getApplication().assertIsDispatchThread();
 
-    if (!myToolWindow.isVisible()) {
+    if (myToolWindow == null || !myToolWindow.isVisible()) {
       return;
     }
     
