diff --git a/packages/SystemUI/src/com/android/systemui/BatteryMeterView.java b/packages/SystemUI/src/com/android/systemui/BatteryMeterView.java
index 0d331d1..3fbc76b 100755
--- a/packages/SystemUI/src/com/android/systemui/BatteryMeterView.java
+++ b/packages/SystemUI/src/com/android/systemui/BatteryMeterView.java
@@ -225,23 +225,23 @@
         mSubpixelSmoothingRight = context.getResources().getFraction(
                 R.fraction.battery_subpixel_smoothing_right, 1, 1);
 
-        mFramePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
+        mFramePaint = new Paint();
         mFramePaint.setColor(frameColor);
         mFramePaint.setDither(true);
         mFramePaint.setStrokeWidth(0);
         mFramePaint.setStyle(Paint.Style.FILL_AND_STROKE);
 
-        mBatteryPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
+        mBatteryPaint = new Paint();
         mBatteryPaint.setDither(true);
         mBatteryPaint.setStrokeWidth(0);
         mBatteryPaint.setStyle(Paint.Style.FILL_AND_STROKE);
 
-        mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
+        mTextPaint = new Paint();
         Typeface font = Typeface.create("sans-serif-condensed", Typeface.BOLD);
         mTextPaint.setTypeface(font);
         mTextPaint.setTextAlign(Paint.Align.CENTER);
 
-        mWarningTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
+        mWarningTextPaint = new Paint();
         mWarningTextPaint.setColor(mColors[1]);
         font = Typeface.create("sans-serif", Typeface.BOLD);
         mWarningTextPaint.setTypeface(font);
@@ -249,7 +249,7 @@
 
         mChargeColor = context.getColor(R.color.batterymeter_charge_color);
 
-        mBoltPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
+        mBoltPaint = new Paint();
         mBoltPaint.setColor(context.getColor(R.color.batterymeter_bolt_color));
         mBoltPoints = loadBoltPoints(res);
 
