diff --git a/services/core/java/com/android/server/wm/AppTransition.java b/services/core/java/com/android/server/wm/AppTransition.java
index 4191d31..75a7385 100644
--- a/services/core/java/com/android/server/wm/AppTransition.java
+++ b/services/core/java/com/android/server/wm/AppTransition.java
@@ -692,7 +692,7 @@
     private void getDefaultNextAppTransitionStartRect(Rect rect) {
         if (mDefaultNextAppTransitionAnimationSpec == null ||
                 mDefaultNextAppTransitionAnimationSpec.rect == null) {
-            Slog.wtf(TAG, "Starting rect for app requested, but none available", new Throwable());
+            Slog.e(TAG, "Starting rect for app requested, but none available", new Throwable());
             rect.setEmpty();
         } else {
             rect.set(mDefaultNextAppTransitionAnimationSpec.rect);
@@ -705,7 +705,7 @@
             spec = mDefaultNextAppTransitionAnimationSpec;
         }
         if (spec == null || spec.rect == null) {
-            Slog.wtf(TAG, "Starting rect for task: " + taskId + " requested, but not available",
+            Slog.e(TAG, "Starting rect for task: " + taskId + " requested, but not available",
                     new Throwable());
             rect.setEmpty();
         } else {
