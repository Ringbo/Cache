diff --git a/core/java/com/android/internal/widget/RotarySelector.java b/core/java/com/android/internal/widget/RotarySelector.java
index a6ce7f8..42cbd07 100644
--- a/core/java/com/android/internal/widget/RotarySelector.java
+++ b/core/java/com/android/internal/widget/RotarySelector.java
@@ -668,7 +668,7 @@
         // wrapping the offset back to the other side so that when the animation is finished,
         // the buttons will come back into their original places.
         if (mDimplesOfFling > 0) {
-            if (!goingRight && mRotaryOffsetX < 3 * mDimpleSpacing) {
+            if (!goingRight && mRotaryOffsetX < -3 * mDimpleSpacing) {
                 // wrap around on fling left
                 mRotaryOffsetX += mDimplesOfFling * mDimpleSpacing;
             } else if (goingRight && mRotaryOffsetX > 3 * mDimpleSpacing) {
