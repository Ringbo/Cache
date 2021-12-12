diff --git a/lib/java/com/google/android/material/bottomsheet/BottomSheetBehavior.java b/lib/java/com/google/android/material/bottomsheet/BottomSheetBehavior.java
index d91a688..956cddb 100644
--- a/lib/java/com/google/android/material/bottomsheet/BottomSheetBehavior.java
+++ b/lib/java/com/google/android/material/bottomsheet/BottomSheetBehavior.java
@@ -768,7 +768,8 @@
         materialShapeDrawable.getShapeAppearanceModel().setCornerRadius(0);
         materialShapeDrawable.invalidateSelf();
       }
-      if (state == STATE_DRAGGING && previousState == STATE_EXPANDED) {
+      if (state == STATE_DRAGGING
+           && previousState == STATE_EXPANDED && interpolatorAnimator != null) {
         interpolatorAnimator.start();
       }
     }
@@ -997,13 +998,13 @@
           }
           if (viewDragHelper.settleCapturedViewAt(releasedChild.getLeft(), top)) {
             setStateInternal(STATE_SETTLING);
-            if (targetState == STATE_EXPANDED) {
+            if (targetState == STATE_EXPANDED && interpolatorAnimator != null) {
               interpolatorAnimator.reverse();
             }
             ViewCompat.postOnAnimation(
                 releasedChild, new SettleRunnable(releasedChild, targetState));
           } else {
-            if (targetState == STATE_EXPANDED) {
+            if (targetState == STATE_EXPANDED && interpolatorAnimator != null) {
               interpolatorAnimator.reverse();
             }
             setStateInternal(targetState);
