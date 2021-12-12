diff --git a/core/java/com/android/internal/widget/ActionBarView.java b/core/java/com/android/internal/widget/ActionBarView.java
index 587d678..fa8eb51 100644
--- a/core/java/com/android/internal/widget/ActionBarView.java
+++ b/core/java/com/android/internal/widget/ActionBarView.java
@@ -457,11 +457,11 @@
                 mIconView.getPaddingTop() - mIconView.getPaddingBottom();
         int iconSize = res.getDimensionPixelSize(android.R.dimen.app_icon_size);
 
-        if (iconSize * DisplayMetrics.DENSITY_LOW > availableHeight) {
+        if (iconSize * DisplayMetrics.DENSITY_LOW >= availableHeight) {
             return DisplayMetrics.DENSITY_LOW;
-        } else if (iconSize * DisplayMetrics.DENSITY_MEDIUM > availableHeight) {
+        } else if (iconSize * DisplayMetrics.DENSITY_MEDIUM >= availableHeight) {
             return DisplayMetrics.DENSITY_MEDIUM;
-        } else if (iconSize * DisplayMetrics.DENSITY_HIGH > availableHeight) {
+        } else if (iconSize * DisplayMetrics.DENSITY_HIGH >= availableHeight) {
             return DisplayMetrics.DENSITY_HIGH;
         }
         return DisplayMetrics.DENSITY_XHIGH;
