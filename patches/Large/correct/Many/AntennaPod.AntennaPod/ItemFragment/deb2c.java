diff --git a/app/src/main/java/de/danoeh/antennapod/fragment/ItemFragment.java b/app/src/main/java/de/danoeh/antennapod/fragment/ItemFragment.java
index 4ae6b97..d4ab482 100644
--- a/app/src/main/java/de/danoeh/antennapod/fragment/ItemFragment.java
+++ b/app/src/main/java/de/danoeh/antennapod/fragment/ItemFragment.java
@@ -183,7 +183,8 @@
             txtvTitle.setEllipsize(TextUtils.TruncateAt.END);
         }
         webvDescription = (WebView) layout.findViewById(R.id.webvDescription);
-        if (UserPreferences.getTheme() == R.style.Theme_AntennaPod_Dark) {
+        if (UserPreferences.getTheme() == R.style.Theme_AntennaPod_Dark ||
+                UserPreferences.getTheme() == R.style.Theme_AntennaPod_TrueBlack) {
             if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1) {
                 webvDescription.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
             }
