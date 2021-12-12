diff --git a/packages/SystemUI/src/com/android/systemui/qs/tiles/DataSaverTile.java b/packages/SystemUI/src/com/android/systemui/qs/tiles/DataSaverTile.java
index 0ce805e..b22e1ec 100644
--- a/packages/SystemUI/src/com/android/systemui/qs/tiles/DataSaverTile.java
+++ b/packages/SystemUI/src/com/android/systemui/qs/tiles/DataSaverTile.java
@@ -56,7 +56,8 @@
 
     @Override
     protected void handleClick() {
-        if (Prefs.getBoolean(mContext, Prefs.Key.QS_DATA_SAVER_DIALOG_SHOWN, false)) {
+        if (mState.value
+                || Prefs.getBoolean(mContext, Prefs.Key.QS_DATA_SAVER_DIALOG_SHOWN, false)) {
             // Do it right away.
             toggleDataSaver();
             return;
