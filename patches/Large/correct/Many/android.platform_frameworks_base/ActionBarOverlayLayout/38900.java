diff --git a/core/java/com/android/internal/widget/ActionBarOverlayLayout.java b/core/java/com/android/internal/widget/ActionBarOverlayLayout.java
index c957b67..adb9bf8 100644
--- a/core/java/com/android/internal/widget/ActionBarOverlayLayout.java
+++ b/core/java/com/android/internal/widget/ActionBarOverlayLayout.java
@@ -286,7 +286,7 @@
                     topInset += mActionBarHeight;
                 }
             }
-        } else if (mActionBarTop.getVisibility() == VISIBLE) {
+        } else if (mActionBarTop.getVisibility() != GONE) {
             // This is the space needed on top of the window for all of the action bar
             // and tabs.
             topInset = mActionBarTop.getMeasuredHeight();
