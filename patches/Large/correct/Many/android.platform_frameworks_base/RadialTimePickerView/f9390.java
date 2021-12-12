diff --git a/core/java/android/widget/RadialTimePickerView.java b/core/java/android/widget/RadialTimePickerView.java
index 0460282..56f126c 100644
--- a/core/java/android/widget/RadialTimePickerView.java
+++ b/core/java/android/widget/RadialTimePickerView.java
@@ -557,7 +557,7 @@
             if (mIsOnInnerCircle && hour == 0) {
                 // Inner circle is 1 through 12.
                 hour = 12;
-            } else if (hour != 0) {
+            } else if (!mIsOnInnerCircle && hour != 0) {
                 // Outer circle is 13 through 23 and 0.
                 hour += 12;
             }
