diff --git a/tests/HwAccelerationTest/src/com/android/test/hwui/ClearActivity.java b/tests/HwAccelerationTest/src/com/android/test/hwui/ClearActivity.java
index 1d7ff0f..b49db7c5 100644
--- a/tests/HwAccelerationTest/src/com/android/test/hwui/ClearActivity.java
+++ b/tests/HwAccelerationTest/src/com/android/test/hwui/ClearActivity.java
@@ -51,7 +51,7 @@
             mClearPaint = new Paint();
             mClearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
             mClearPaint.setAntiAlias(true);
-            mClearPaint.setColor(0xff00ff00);
+            mClearPaint.setColor(0x0000ff00);
             mClearPaint.setStrokeWidth(15.0f);
             mClearPaint.setStyle(Paint.Style.FILL);
             mClearPaint.setTextSize(32.0f);
