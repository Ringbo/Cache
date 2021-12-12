diff --git a/packages/SettingsLib/src/com/android/settingslib/graph/BatteryMeterDrawableBase.java b/packages/SettingsLib/src/com/android/settingslib/graph/BatteryMeterDrawableBase.java
index 6764a6b..0f443d6 100755
--- a/packages/SettingsLib/src/com/android/settingslib/graph/BatteryMeterDrawableBase.java
+++ b/packages/SettingsLib/src/com/android/settingslib/graph/BatteryMeterDrawableBase.java
@@ -101,7 +101,7 @@
         for (int i=0; i < N; i++) {
             mColors[2 * i] = levels.getInt(i, 0);
             if (colors.getType(i) == TypedValue.TYPE_ATTRIBUTE) {
-                mColors[2 * i + 1] = Utils.getColorAttr(context, colors.getResourceId(i, 0));
+                mColors[2 * i + 1] = Utils.getColorAttr(context, colors.getThemeAttributeId(i, 0));
             } else {
                 mColors[2 * i + 1] = colors.getColor(i, 0);
             }
