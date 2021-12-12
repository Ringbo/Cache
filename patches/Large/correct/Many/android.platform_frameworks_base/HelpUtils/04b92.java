diff --git a/packages/SettingsLib/src/com/android/settingslib/HelpUtils.java b/packages/SettingsLib/src/com/android/settingslib/HelpUtils.java
index b037a3d..fc697ce 100644
--- a/packages/SettingsLib/src/com/android/settingslib/HelpUtils.java
+++ b/packages/SettingsLib/src/com/android/settingslib/HelpUtils.java
@@ -198,7 +198,7 @@
             intent.putExtra(feedbackIntentExtraKey, packageNameKey);
             intent.putExtra(feedbackIntentNameKey, packageNameValue);
         }
-        intent.putExtra(EXTRA_THEME, 1 /* Light, dark action bar */);
+        intent.putExtra(EXTRA_THEME, 0 /* Light theme */);
         TypedArray array = context.obtainStyledAttributes(new int[]{android.R.attr.colorPrimary});
         intent.putExtra(EXTRA_PRIMARY_COLOR, array.getColor(0, 0));
         array.recycle();
