diff --git a/packages/SystemUI/src/com/android/systemui/recents/views/RecentsTransitionHelper.java b/packages/SystemUI/src/com/android/systemui/recents/views/RecentsTransitionHelper.java
index 51cae86..fdb0d32 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/views/RecentsTransitionHelper.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/views/RecentsTransitionHelper.java
@@ -289,7 +289,7 @@
                     //       never happen)
                     specs.add(composeOffscreenAnimationSpec(t, offscreenTaskRect));
                 } else {
-                    layoutAlgorithm.getStackTransform(task, stackScroll, mTmpTransform, null);
+                    layoutAlgorithm.getStackTransform(t, stackScroll, mTmpTransform, null);
                     specs.add(composeAnimationSpec(tv, mTmpTransform, true /* addHeaderBitmap */));
                 }
             }
