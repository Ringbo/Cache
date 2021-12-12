diff --git a/core/java/android/widget/RadialTimePickerView.java b/core/java/android/widget/RadialTimePickerView.java
index 0dd9b2a..4b061d3 100644
--- a/core/java/android/widget/RadialTimePickerView.java
+++ b/core/java/android/widget/RadialTimePickerView.java
@@ -1275,7 +1275,7 @@
             // Calling getDegreesXY() has side-effects, so we need to cache the
             // current inner circle value and restore after the call.
             final boolean wasOnInnerCircle = mIsOnInnerCircle;
-            final int degrees = getDegreesFromXY(x, y);
+            final int degrees = getDegreesFromXY(x, y, true);
             final boolean isOnInnerCircle = mIsOnInnerCircle;
             mIsOnInnerCircle = wasOnInnerCircle;
 
