diff --git a/packages/SystemUI/src/com/android/systemui/recents/views/TaskStackAnimationHelper.java b/packages/SystemUI/src/com/android/systemui/recents/views/TaskStackAnimationHelper.java
index a2ee4c5..f1314aba 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/views/TaskStackAnimationHelper.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/views/TaskStackAnimationHelper.java
@@ -619,7 +619,7 @@
         postAnimationTrigger.addLastDecrementRunnable(() -> {
             mStackView.getTouchHandler().onChildDismissed(deleteTaskView);
         });
-        deleteTaskView.animate().setDuration(300).scaleX(0).scaleY(0).alpha(0).setListener(
+        deleteTaskView.animate().setDuration(300).scaleX(0.9f).scaleY(0.9f).alpha(0).setListener(
                 new AnimatorListenerAdapter() {
                     @Override
                     public void onAnimationEnd(Animator animation) {
