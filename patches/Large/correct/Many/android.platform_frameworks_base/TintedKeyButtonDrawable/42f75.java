diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/policy/TintedKeyButtonDrawable.java b/packages/SystemUI/src/com/android/systemui/statusbar/policy/TintedKeyButtonDrawable.java
index 56f6726..0616ffc 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/policy/TintedKeyButtonDrawable.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/policy/TintedKeyButtonDrawable.java
@@ -63,7 +63,7 @@
     }
 
     public boolean isDarkIntensitySet() {
-        return mDarkIntensity == DARK_INTENSITY_NOT_SET;
+        return mDarkIntensity != DARK_INTENSITY_NOT_SET;
     }
 
     public float getDarkIntensity() {
