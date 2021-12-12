diff --git a/packages/SystemUI/src/com/android/systemui/BatteryMeterView.java b/packages/SystemUI/src/com/android/systemui/BatteryMeterView.java
index 292c9c2..0d331d1 100755
--- a/packages/SystemUI/src/com/android/systemui/BatteryMeterView.java
+++ b/packages/SystemUI/src/com/android/systemui/BatteryMeterView.java
@@ -328,7 +328,7 @@
         int fillColor = getFillColor(darkIntensity);
         mIconTint = fillColor;
         mFramePaint.setColor(backgroundColor);
-        mBoltPaint.setColor(backgroundColor);
+        mBoltPaint.setColor(fillColor);
         mChargeColor = fillColor;
         invalidate();
     }
