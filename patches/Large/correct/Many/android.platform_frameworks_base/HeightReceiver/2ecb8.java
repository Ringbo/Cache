diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/tablet/HeightReceiver.java b/packages/SystemUI/src/com/android/systemui/statusbar/tablet/HeightReceiver.java
index 9924faa..7f4c918 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/tablet/HeightReceiver.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/tablet/HeightReceiver.java
@@ -76,7 +76,7 @@
         int height = -1;
         if (plugged) {
             final DisplayMetrics metrics = new DisplayMetrics();
-            mWindowManager.getDefaultDisplay().getMetrics(metrics);
+            mWindowManager.getDefaultDisplay().getRealMetrics(metrics);
             //Slog.i(TAG, "setPlugged: display metrics=" + metrics);
             final int shortSide = Math.min(metrics.widthPixels, metrics.heightPixels);
             height = shortSide - 720;
