diff --git a/core/java/com/android/internal/widget/SizeAdaptiveLayout.java b/core/java/com/android/internal/widget/SizeAdaptiveLayout.java
index bbf5509..7687ad1 100644
--- a/core/java/com/android/internal/widget/SizeAdaptiveLayout.java
+++ b/core/java/com/android/internal/widget/SizeAdaptiveLayout.java
@@ -175,7 +175,7 @@
             height = Math.min(height, lp.maxHeight);
         }
 
-        if (heightIn != height) {
+        if (DEBUG && heightIn != height) {
             Log.d(TAG, this + "child view " + child + " " +
                   "measured out of bounds at " + heightIn +"px " +
                   "clamped to " + height + "px");
