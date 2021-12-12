diff --git a/core/java/android/widget/AbsSeekBar.java b/core/java/android/widget/AbsSeekBar.java
index 4ca8971..9a68593 100644
--- a/core/java/android/widget/AbsSeekBar.java
+++ b/core/java/android/widget/AbsSeekBar.java
@@ -955,7 +955,7 @@
                 if (!canUserSetProgress()) {
                     return false;
                 }
-                int increment = Math.max(1, Math.round((float) getMax() / 5));
+                int increment = Math.max(1, Math.round((float) getMax() / 20));
                 if (action == AccessibilityNodeInfo.ACTION_SCROLL_BACKWARD) {
                     increment = -increment;
                 }
