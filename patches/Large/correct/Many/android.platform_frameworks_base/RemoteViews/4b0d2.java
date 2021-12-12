diff --git a/core/java/android/widget/RemoteViews.java b/core/java/android/widget/RemoteViews.java
index 9245134..036b391 100644
--- a/core/java/android/widget/RemoteViews.java
+++ b/core/java/android/widget/RemoteViews.java
@@ -252,9 +252,7 @@
                 if (mEnterAnimationId != 0) {
                     opts = ActivityOptions.makeCustomAnimation(context, mEnterAnimationId, 0);
                 } else {
-                    opts = ActivityOptions.makeScaleUpAnimation(view,
-                            0, 0,
-                            view.getMeasuredWidth(), view.getMeasuredHeight());
+                    opts = ActivityOptions.makeBasic();
                 }
 
                 if (launchStackId != StackId.INVALID_STACK_ID) {
