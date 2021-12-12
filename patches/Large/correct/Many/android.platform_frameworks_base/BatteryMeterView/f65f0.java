diff --git a/packages/SystemUI/src/com/android/systemui/BatteryMeterView.java b/packages/SystemUI/src/com/android/systemui/BatteryMeterView.java
index 3fbc76b..0d331d1 100755
--- a/packages/SystemUI/src/com/android/systemui/BatteryMeterView.java
+++ b/packages/SystemUI/src/com/android/systemui/BatteryMeterView.java
@@ -225,23 +225,23 @@
         mSubpixelSmoothingRight = context.getResources().getFraction(
                 R.fraction.battery_subpixel_smoothing_right, 1, 1);
 
-        mFramePaint = new Paint();
+        mFramePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
         mFramePaint.setColor(frameColor);
         mFramePaint.setDither(true);
         mFramePaint.setStrokeWidth(0);
         mFramePaint.setStyle(Paint.Style.FILL_AND_STROKE);
 
-        mBatteryPaint = new Paint();
+        mBatteryPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
         mBatteryPaint.setDither(true);
         mBatteryPaint.setStrokeWidth(0);
         mBatteryPaint.setStyle(Paint.Style.FILL_AND_STROKE);
 
-        mTextPaint = new Paint();
+        mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
         Typeface font = Typeface.create("sans-serif-condensed", Typeface.BOLD);
         mTextPaint.setTypeface(font);
         mTextPaint.setTextAlign(Paint.Align.CENTER);
 
-        mWarningTextPaint = new Paint();
+        mWarningTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
         mWarningTextPaint.setColor(mColors[1]);
         font = Typeface.create("sans-serif", Typeface.BOLD);
         mWarningTextPaint.setTypeface(font);
@@ -249,7 +249,7 @@
 
         mChargeColor = context.getColor(R.color.batterymeter_charge_color);
 
-        mBoltPaint = new Paint();
+        mBoltPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
         mBoltPaint.setColor(context.getColor(R.color.batterymeter_bolt_color));
         mBoltPoints = loadBoltPoints(res);
 
