diff --git a/platform/platform-impl/src/com/intellij/ui/FocusTrackback.java b/platform/platform-impl/src/com/intellij/ui/FocusTrackback.java
index e5c7f82..07021bc 100644
--- a/platform/platform-impl/src/com/intellij/ui/FocusTrackback.java
+++ b/platform/platform-impl/src/com/intellij/ui/FocusTrackback.java
@@ -190,7 +190,7 @@
 
     if (project != null && !project.isDisposed()) {
       final IdeFocusManager focusManager = IdeFocusManager.getInstance(project);
-      focusManager.requestFocus(new MyFocusCommand(), true).doWhenProcessed(new Runnable() {
+      focusManager.requestFocus(new MyFocusCommand(), false).doWhenProcessed(new Runnable() {
         public void run() {
           dispose();
         }
